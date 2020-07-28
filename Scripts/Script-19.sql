DELIMITER @@
#use test;
@@

create function login(youName varchar(50), youPass varchar(16))
returns int
begin 
	declare c int default 0;
	
	select  count (*) into c from users where `name` = youName and 'pass' = youPass;
	return c;
end
@@

set @isExists = login('Vasya', '1234');
select @isExists ;