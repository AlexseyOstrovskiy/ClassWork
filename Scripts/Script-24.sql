start transaction

UPDATE user set name ='Vaska' where id=1;
insert into users (id, name, birthday )
values(1, 'Grishan', '2020-03-05');

--commit;
--commit - ��������� � ���� ����������� �� ������ ������ � ����������

rollback;
--rollback - ���������� ��� ��������� ������������� ����������� ��� ������������� ������
