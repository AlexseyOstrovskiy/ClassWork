package com.pabdi.repository;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManagerFactory;

public abstract class AbstractRepository<PK extends Serializable, T> {

    private final Class<T> persistentClass;

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @SuppressWarnings("unchecked")
    public AbstractRepository() {
        this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }

    protected Session getSession() {
        return entityManagerFactory.createEntityManager().unwrap(Session.class);
    }


    protected T getByKey(PK key) {
        return getSession().find(persistentClass, key);
    }

    protected T persist(T entity) {
        Session session = getSession();
        beginTransaction(session);
        session.persist(entity);
        commitTransaction(session);
        return entity;
    }

    protected void update(T entity) {
        getSession().merge(entity);
    }

    protected void delete(T entity) {
        getSession().remove(entity);
    }

    protected List<T> getAll() {
        return getSession().createQuery("FROM " + persistentClass.getSimpleName(), persistentClass)
                .getResultList();
    }

    private void beginTransaction(Session session) {
        session.beginTransaction();
    }

    private void commitTransaction(Session session) {
        session.getTransaction().commit();
    }
}