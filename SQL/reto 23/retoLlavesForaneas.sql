insert into estado_civil values('U','UNION LIBRE');
insert into estado_civil values('C','CASADO');
insert into estado_civil values('S','SOLTERO');


CREATE TABLE ususario(
    cedula char(10) primary key,
    nombre varchar(25) not null,
    apellido varchar(25) not null,
    tipo_cuenta varchar(20),
    limite_credito float
);


CREATE TABLE cuentas(
    numero_cuenta char(5) primary key,
    cedula char(10) references ususario(cedula),
    fecha_creacion date not null,
    saldo money not null
);

alter table cuentas
add tipo_cuenta varchar(20),

update cuentas
set tipo_cuenta = 'Ahorros'
where cedula like '%0%'

select tipo_cuenta, COUNT(numero_cuenta) from cuentas
group by tipo_cuenta

select AVG(saldo) from cuentas 
where cedula = (select cedula from ususario 
                where cedula = '0000000000'); 

create table clientes(
cedula char(10) primary key,
nombre varchar(50) not null,
apellido varchar(50) not null
);


create table compras(
    id_compras int primary key,
    cedula char(10) references clientes(cedula),
    fecha_compra date not null,
    monto float not null
);

select 
create table productos(
    codigo int primary key,
    nombre varchar(50) not null,
    descripcion varchar(200),
    precio money not null,
    stock int not null
);


create table ventas (
    id_ventas int primary key,
    codigo_producto int references productos(codigo),
    fecha_venta date not null,
    cantidad int
);


create table videojuegos(
    codigo int primary key,
    nombre varchar(100) not null,
    descripcion varchar(300),
    valoracion int not null
);


create table plataformas(
    id_plataforma int primary key,
    nombre_plataforma varchar(50) not null,
    codigo_videojuegos int references videojuegos(codigo)
);

create table colegio(
    nombre varchar(50) not null,
    direccion varchar(150) not null,
    telefono char(10)
);


create table profesores(
    codigo int primary key,
    nombre varchar(50) not null
);



CREATE TABLE IF NOT EXISTS estudiantes
(
    cedula character(10) COLLATE pg_catalog."default" NOT NULL,
    nombre character varying(50) COLLATE pg_catalog."default" NOT NULL,
    apellido character varying(50) COLLATE pg_catalog."default" NOT NULL,
    email character varying(50) COLLATE pg_catalog."default" NOT NULL,
    fecha_nacimiento date NOT NULL,
    CONSTRAINT estudiantes_pkey PRIMARY KEY (cedula)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS estudiantes
    OWNER to postgres;

ALTER TABLE estudiantes
add codigo_profesor int not null;

ALTER table estudiantes
add CONSTRAINT estudiantes_profesores_fk
FOREIGN key (codigo_profesor)
references profesores(codigo)


CREATE TABLE empleado(
    codigo_empleado int primary key,
    nombre varchar(25) not null,
    fecha date not null,
    hora time not null
);


CREATE table registros_entrada(
    codigo_registro int primary key,
    cedula_empleado char(10) not null,
    fecha date not null,
    hora time not null,
    codigo_empleado int references empleado(codigo_empleado)
);

insert into registros_entrada values(1,'0000000001','2023-10-23','8:00',1);
insert into registros_entrada values(2,'0000000002','2023-10-23','8:01',2);
insert into registros_entrada values(3,'0000000003','2023-10-23','8:03',3);
insert into registros_entrada values(4,'0000000004','2023-10-23','8:02',4);
insert into registros_entrada values(5,'0000000005','2023-10-23','8:05',5);
insert into registros_entrada values(6,'0000000006','2023-10-23','8:04',6);
insert into registros_entrada values(7,'0000000007','2023-10-23','8:06',7);
insert into registros_entrada values(8,'0000000008','2023-10-23','8:07',8);
insert into registros_entrada values(9,'0000000009','2023-10-23','8:08',9);
insert into registros_entrada values(10,'0000000010','2023-10-23','8:09',1);

ALTER TABLE personas
ADD CONSTRAINT cedula_fk
PRIMARY KEY (cedula);

insert into personas values('0000000001','Andres','Villacres',1.8,'1997-12-12','4:30',200,0,'C');
insert into personas values('0000000002','Anderson','Villacres',1.8,'1997-12-12','4:30',200,0,'C');
insert into personas values('0000000003','Maria','Villacis',1.8,'1997-12-12','4:30',200,0,'C');
insert into personas values('0000000004','Belen','Villa',1.8,'1997-12-12','4:30',200,0,'C');
insert into personas values('0000000005','Jessica','Villares',1.8,'1997-12-12','4:30',200,0,'C');
insert into personas values('0000000006','Carlos','Paucar',1.8,'1997-12-12','4:30',200,0,'C');
insert into personas values('0000000007','Pedro','Trump',1.8,'1997-12-12','4:30',200,0,'C');
insert into personas values('0000000008','Jose','Arias',1.8,'1997-12-12','4:30',200,0,'C');
insert into personas values('0000000009','Jairo','Gomez',1.8,'1997-12-12','4:30',200,0,'C');
insert into personas values('0000000010','David','Jerez',1.8,'1997-12-12','4:30',200,0,'C');
insert into personas values('0000000011','Daniel','Marin',1.8,'1997-12-12','4:30',200,0,'C');

CREATE TABLE prestamo(
    cedula char(10) references personas(cedula),
    monto money,
    fecha_prestamo date,
    hora_prestamo time,
    garante varchar(40)
);

insert into prestamo values('0000000001',5000,'2023-10-23','10:00','Andres Villacres');
insert into prestamo values('0000000002',10000,'2023-10-23','10:00','Andres Villacres');
insert into prestamo values('0000000003',500,'2023-10-23','10:00','Andres Villacres');
insert into prestamo values('0000000001',2000,'2023-10-23','10:00','Andres Jerez');
insert into prestamo values('0000000002',5000,'2023-10-23','10:00','Andres Jerez');
insert into prestamo values('0000000003',5000,'2023-10-23','10:00','Andres Villacres');
insert into prestamo values('0000000001',22000,'2023-10-23','10:00','Carlos Paucar');
insert into prestamo values('0000000002',45000,'2023-10-23','10:00','Jose Paucar');
insert into prestamo values('0000000003',30000,'2023-10-23','10:00','Andres Villacres');
insert into prestamo values('0000000001',75000,'2023-10-23','10:00','Edwin Villacres');
insert into prestamo values('0000000002',1000,'2023-10-23','10:00','Vanessa Villacres');

insert into prestamo values('');

CREATE TABLE transacciones(
    codigo int primary key,
    numero_cuenta char(5) not null,
    monto money not null,
    tipo char(1) not null,
    fecha date,
    hora time
);


CREATE TABLE banco(
    codigo_banco int primary key,
    codigo_transaccion int references transacciones(codigo),
    detalle varchar(100)
);

insert into banco values(1,1,null);
insert into banco values(2,2,null);
insert into banco values(3,3,null);
insert into banco values(4,4,null);
insert into banco values(5,5,null);
insert into banco values(6,6,null);
insert into banco values(7,6,null);
insert into banco values(8,7,null);
insert into banco values(9,8,null);
insert into banco values(10,9,null);