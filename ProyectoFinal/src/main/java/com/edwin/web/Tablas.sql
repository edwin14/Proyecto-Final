
create table cliente(id_cliente integer primary key auto_increment,nombre varchar(80),tipo_pago varchar(20));

create table mesa(id_mesa integer primary key auto_increment, id_cliente integer,num_mesa float,personas_mesa float,
             foreign key (id_cliente) references cliente (id_cliente));

create table platillo(id_platillo integer primary key auto_incremenz,num_platillo float,tipo_platillo varchar(80),
             foreign key (id_cliente) references cliente (id_cliente));



select * from cliente