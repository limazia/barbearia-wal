use barbearia;
create table agendamento(
id int auto_increment not null,
cliente varchar(50) not null,
tipoServico varchar(50) not null,
dia varchar(20) not null,
hora varchar(20) not null,
profissional varchar(50) not null,
observacao varchar(255) not null,
primary key (id)
);
