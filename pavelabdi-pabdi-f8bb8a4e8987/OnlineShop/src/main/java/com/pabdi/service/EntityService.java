package com.pabdi.service;

import java.util.List;

public interface EntityService<T> {

    List<T> getAll();

    T getById(int id);
}
