--Подзаппросы
--SELECT  * FROM Users u 
--where id > (SELECT AVG(id) from users);

--INSERT into Users (id, name, birthday)
--values(
--(SELECT MAX(id)+10  from Users),
--'Parya',
--'1985-01-01'
--);

--exists
select * FROM Users 
where EXISTS (
select * from contacts 
where contacts.user_id  = Users.id );
