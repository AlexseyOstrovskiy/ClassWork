#������� ��� ������ � ������
# now - ���������� ������� ���� + �����
select now();

#curdate, current_date - ������� ���� ��� �������
select curdate(), current_date();  
#curtime current_time -������� ����� ��� ����
select curtime(), current_time();
# ������� ��� �������� ���������� ���� -  
select 
	year('2020-12-12'),
	month('2020-12-12'),
	day('2020-12-12'),
	hour('2020-12-12 12:11:10'),
	minute('2020-12-12 12:11:10'),
	second('2020-12-12 12:11:10');
	
#datediff - ���������� ������� ����� ����� ������ � ����
select datediff('2020-07-21', '2020-09-01');
