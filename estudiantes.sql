create table estudiantes(
cedula char(10) primary key,
nombre varchar(50) not null,
apellido varchar(50) not null,
email varchar(50) not null,
fecha_nacimiento date not null
);