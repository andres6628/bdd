create table productos(
codigo int primary key,
nombre varchar(50) not null,
descripcion varchar(200),
precio money not null,
stock int not null
);