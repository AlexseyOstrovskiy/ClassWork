USE Mybasa;

delimiter $$

create function addTips (employeeld INTEGER, tipsDate DATETIME, tipsAmount INTEGER)
returns INTEGER
begin
	declare sumTIPS Integer;
	insert into tips (employee_id, `data`, amount )
	values (employeeld, tipsDate, tipsAmount );
	select  SUM(amount) into sumTIPS  from tips where employee_id = employeeld ;
	return sumTIPS;
end
$$