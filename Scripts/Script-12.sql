# case 
#select id, name, 
#case
	#when year(now) - year(birthday)>= 18 then '18+'
#	else '<18'
#end as status
#from Users;

#if
#select user_id, 
#if(left(phone,4) = '+375', 'BY', 'not BY') as country
#from contacts;

# ifnull(<имя столбца>, <значение>)
select ifnull(birthday, 'нет данных') as bd from Users;


#coalesce - возвращает первое не нулевое значение

select coalesce(null, name, 'hello') as blabal from users;