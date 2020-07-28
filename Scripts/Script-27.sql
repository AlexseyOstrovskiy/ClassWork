use Mybasa;
delimiter $$

create procedure myP(year1 INTEGER, year2 INTEGER)
begin
	select programming_languages.name  'Languages_name', authors.author_name, programming_languages.creation_date, authors.biography
	from programming_languages
	inner join authors
	where year(creation_date) between year1 and year2
	order by creation_date desc; 
end
$$