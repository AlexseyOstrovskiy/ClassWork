DELIMITER //
//
use information_schema
create procedure addUser(userName varchar(50), userBDay date);
begin
	insert into users(name, birthday)
	values(userName, userBDay);
end
//