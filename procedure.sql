delimiter $$
create procedure sp_table(type varchar(20), rno int, name varchar(20), eng float,math float,sci float )
begin 
if(type ='insert') then 
insert into demo(RollNo, Name , English, Maths, Science)
values(rno,name,eng,math,sci);
end if;
end;