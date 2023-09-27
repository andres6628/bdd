create table registros_entrada(
codigo_registro int primary key,
cedula_empleado char(10) not null,
fecha date not null,
hora time not null
);