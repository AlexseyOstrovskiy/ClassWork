-- in
--select * FROM Users 
--where name in ('Mick');

-- not in 
--select * FROM Users 
--where name not in ('Mick');

--between
--SELECT * FROM Users u 
--where birthday  BETWEEN '1197-01-10' and '1999-07-01';

--like
-- % - ������ % ����� ���������� ������ ����� �������� ����� ������
-- _ - ������ _ ����� ���������� ����� ���� ������
--SELECT  * FROM Users u 
--where name like 'G%h_';

--regexp - 
--SELECT * from Users 
--where name regexp 'Mick';

-- is,  is null, is not null
select * FROM Users 
where name is not null 
