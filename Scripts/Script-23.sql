SELECT u.id  as userId, name, Phone
from Users u;
inner join contacts c on u.id = c.user_id;
where YEAR(birthday) = 1998;

--��������� insert
--���������� ������� � ��������  � ���������� ����������
--inner join 
--������� ������ � ������ (������� ��� ���������� ���������� ����);