DELIMITER @@
#use users;
@@

begin
create procedure sumFunction ( in a int, in b int, inout res int)
set res = a + b;
end
@@
# IN - �������� ������ �������� � ���� ���������
# OUT - �������� ����� ������ ������ ������ ���� ��������� 
# INOUT - �������� ����� �������� ��� ������ ���� ��������� � ����� �������� �� ��� 
#�������� ����� ��� ����������� ��� ���������� �������� ������������

declare r int default 0;
call sunFunction(15, 25, r);
select  r;