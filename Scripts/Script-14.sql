DELIMITER $$
use 1;
$$
create procedure usersB()
begin 
	select * from users where name like 'B%';
end
$$
