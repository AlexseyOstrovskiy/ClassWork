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

# ifnull(<��� �������>, <��������>)
select ifnull(birthday, '��� ������') as bd from Users;


#coalesce - ���������� ������ �� ������� ��������

select coalesce(null, name, 'hello') as blabal from users;