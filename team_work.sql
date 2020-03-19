create table team_work.trolls (
trolls_health int,
trolls_power int,
trolls_name varchar(256)
);

insert into team_work.trolls (trolls_health, trolls_power, trolls_name)
values(30, 6, "Poppy");

insert into team_work.trolls (trolls_health, trolls_power, trolls_name)
values(30, 6, "Biggie");

insert into team_work.trolls (trolls_health, trolls_power, trolls_name)
values(30, 6, "Mandy");

insert into team_work.trolls (trolls_health, trolls_power, trolls_name)
values(30, 6, "Moxie");

insert into team_work.trolls (trolls_health, trolls_power, trolls_name)
values(30, 6, "Branch");

select * from trolls;

create table heroes (
heroes_health int,
heroes_power int,
heroes_name varchar(256)
);

insert into team_work.heroes (heroes_health, heroes_power, heroes_name)
values(20, 10, "Ragnar");

insert into team_work.heroes (heroes_health, heroes_power, heroes_name)
values(20, 10, "Bjorn");

insert into team_work.heroes (heroes_health, heroes_power, heroes_name)
values(20, 10, "Rolo");

insert into team_work.heroes (heroes_health, heroes_power, heroes_name)
values(20, 10, "Floki");

insert into team_work.heroes (heroes_health, heroes_power, heroes_name)
values(20, 10, "Lagerta");

select * from heroes;