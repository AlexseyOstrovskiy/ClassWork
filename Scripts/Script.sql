SELECT name as nameTest, birthday, id
FROM Users
WHERE  id BETWEEN 1 AND 10
--GROUP BY nameTest 
--order by - сортировка по столбцу
--ASC - по возрастанию
--DESC - по убыванию
ORDER BY birthday DESC
--LIMIT 10 - первые 10 записей
-- LIMIT 3, 8 - 8 записей начиная с 4
LIMIT 1,1

