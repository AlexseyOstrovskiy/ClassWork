start transaction

UPDATE user set name ='Vaska' where id=1;
insert into users (id, name, birthday )
values(1, 'Grishan', '2020-03-05');

--commit;
--commit - изменение в базе сохран€ютс€ до первой ошибки в транзакции

rollback;
--rollback - откатывает все изменени€ произведенные транзакцией при возникновении ошибки
