#функции для работы с датами
# now - возвращает текущую дату + время
select now();

#curdate, current_date - текущая дата без времени
select curdate(), current_date();  
#curtime current_time -текущее время без даты
select curtime(), current_time();
# функции для экспорта параметров даты -  
select 
	year('2020-12-12'),
	month('2020-12-12'),
	day('2020-12-12'),
	hour('2020-12-12 12:11:10'),
	minute('2020-12-12 12:11:10'),
	second('2020-12-12 12:11:10');
	
#datediff - возвращает разницу между двумя датами в днях
select datediff('2020-07-21', '2020-09-01');
