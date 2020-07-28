DELIMITER @@
#use users;
@@

begin
create procedure sumFunction ( in a int, in b int, inout res int)
set res = a + b;
end
@@
# IN - аргумент нельзя изменить в теле процедуры
# OUT - аргумент можно задать только внутри тела процедуры 
# INOUT - аргумент можно изменять как внутри тела процедуры и также задавать из вне 
#ключевое слово сет обязательно при совершении операции присваивания

declare r int default 0;
call sunFunction(15, 25, r);
select  r;