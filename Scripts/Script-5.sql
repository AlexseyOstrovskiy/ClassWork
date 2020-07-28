--Агрегирующие функции
-- SUM - сложение численных данных по столбцу
SELECT sum(id) from Users;
--AVG - среднее значение по столбцу
SELECT  AVG(id) FROM Users;
--COUNT - возвращает количество записей
SELECT COUNT() FROM Users;
--MIN MAX - минимальное и максимальное значение столбца
 SELECT  MAX(name ) FROM Users;
 SELECT MIN(birthday) FROM Users; 
 
SELECT COUNT() as users_count,
max(birthday) as users_maxBD,
min (birthday) as minBD
FROM Users;
