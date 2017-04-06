
create table MaristIHSA (
  firstName varchar(25),
  lastName varchar(25),
  competitionClass varchar(7),
  points integer
);

/*Original making of table*/
insert into MaristIHSA (firstName, lastName, competitionClass, points)
values('fName', 'lName', 'cClass', points);

select points
from MaristIHSA
where lastName = 'lName' and competitionClass = 'cClass';