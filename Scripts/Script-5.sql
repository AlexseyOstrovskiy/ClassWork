--������������ �������
-- SUM - �������� ��������� ������ �� �������
SELECT sum(id) from Users;
--AVG - ������� �������� �� �������
SELECT  AVG(id) FROM Users;
--COUNT - ���������� ���������� �������
SELECT COUNT() FROM Users;
--MIN MAX - ����������� � ������������ �������� �������
 SELECT  MAX(name ) FROM Users;
 SELECT MIN(birthday) FROM Users; 
 
SELECT COUNT() as users_count,
max(birthday) as users_maxBD,
min (birthday) as minBD
FROM Users;
