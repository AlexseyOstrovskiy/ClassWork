DELIMITER $$
#use test;
$$
create procedure fetchPhoneList(inout list varchar(500))
begin
	declare phoneNumber varchar(20);
	declare done int default 0;
	# объ€вл€ем курсор
	# если в процедуре/функции объ€влены другие переменные, то они должы быть объ€влены до объ€влени€ курсора 
	declare cur cursor for select phone from contacts;
	# объ€вл€ем обработчик ошибки который сработает в том случае если курсор не сможет найти новую запись (записи в курсоре закончатс€)
	declare continue handler for not found set done = 1;
	#open -открывает курсор и начинает выполнение команды select	
	open cur;
#loop - бесконечный цикл
#getPhones -им€ цикла
	getPhones: loop
	#fetch - выбирает одну строку из курсора и переходит на следующую
	fetch cur into phoneNumber;
	if done = 1 then 
		leave getPhones;
	end if;
	set list = concat(phoneNumber, ',',list );
	end loop getPhones;
#close - закрывает курсор(удал€ет его из пам€ти)
close cur;
end
$$