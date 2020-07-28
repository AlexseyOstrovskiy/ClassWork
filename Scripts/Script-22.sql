use Mybasa;
delimiter $$

create function addTips (employeeld(INTEGER))#, tipsDate(DATETIME), tipsAmount(INTEGER))
returns INTEGER
begin
	insert into Mybasa (employee_id)#, `data`, amount )
	values(employeeld)#, tipsDate, tipsAmount )
	return 1;
end

$$



