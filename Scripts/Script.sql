SELECT name as nameTest, birthday, id
FROM Users
WHERE  id BETWEEN 1 AND 10
--GROUP BY nameTest 
--order by - ���������� �� �������
--ASC - �� �����������
--DESC - �� ��������
ORDER BY birthday DESC
--LIMIT 10 - ������ 10 �������
-- LIMIT 3, 8 - 8 ������� ������� � 4
LIMIT 1,1

