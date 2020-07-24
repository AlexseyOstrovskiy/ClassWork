SELECT u.id  as userId, name, Phone
from Users u;
inner join contacts c on u.id = c.user_id;
where YEAR(birthday) = 1998;

--повторить insert
--объявлений функций и процедур  и объявление аргументов
--inner join 
--функции работы с датами (функции для извлечения параметров даты);