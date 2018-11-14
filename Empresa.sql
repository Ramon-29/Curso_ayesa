
create table usuario(
id int not null auto_increment,
usrname varchar(20) not null unique,
nombre varchar(20) not null,
apellidos varchar(40) not null,
pass varchar(16) not null,
primary key(id)
);

create table productoalmacen(
id int not null auto_increment,
idproducto int not null,
idalmacen int not null,
cantidad number(4,2) not null
);

create table producto(
id int not null auto_increment,
nombre varchar(20) not null,
precio number(4,2) not null,
primary key (id),
foreign key (id) references productoalmacen(idproducto)

);

create table almacen(
id int not null auto_increment,
nombre varchar(20) not null,
primary key (id),
foreign key (id) references productoalmacen(idalmacen)
);