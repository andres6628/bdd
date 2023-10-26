create table usuarios(
    id int primary key,
    nombre varchar(25) not null,
    apellido varchar(25) not null,
    fecha_nacimiento date
);
create table grupo(
    id int primary key,
    nombre varchar(25) not null,
    descripcion varchar(75),
    fecha_creacion date
);

create table usuario_grupo(
    us_id int not null,
    gr_id int not null,
	constraint usuario_fk foreign key (us_id) references usuarios(id),
	constraint grupo_fk foreign key (gr_id) references grupo(id),
    constraint id_us_gr primary key (us_id,gr_id)
);


create table habitaciones(
    habitacion_numero int primary key,
    precio_por_noche decimal not null,
    piso int not null,
    max_personas int
);

create table huespedes(
    id int primary key,
    nombre varchar(40) not null,
    apellidos varchar(45) not null,
    telefono char(10),
    correo varchar(45),
    direccion varchar(45),
    ciudad varchar(45),
    pais varchar(45)
);

create table reservas(
    inicio_fecha date,
    fin_fecha date,
    habitacion_numero int not null,
    id_huesped int not null,
    constraint fk_habitacion_numero foreign key (habitacion_numero) references habitaciones(habitacion_numero),
    constraint fk_huesped foreign key (id_huesped) references huespedes(id),
    constraint id_reserva primary key (habitacion_numero,id_huesped)
);

create table ciudad(
    id int primary key,
    nombre varchar(45) not null
);

create table municipio(
    id int primary key,
    nombre varchar(45),
    ciudad_id int references ciudad(id)
);

create table proyecto(
    id int primary key,
    proyecto varchar(50) not null,
    monto money not null,
    fecha_inicio date,
    fecha_fin date
);

create table proyecto_municipio(
    municipio_id int not null,
    proyecto_id int not null,
    constraint fk_municipio_id foreign key (municipio_id) references municipio(id),
    constraint fk_proyecto_id foreign key (proyecto_id) references proyecto(id),
    constraint id_proyecto_municipio primary key (proyecto_id,municipio_id)
);


select us.nombre, gr.nombre from usuarios us, grupo gr
where us.id in (select us_id from usuario_grupo);

select us.nombre from usuarios us
where us.id in (select us_id from usuario_grupo where gr_id = 1);

select gr.nombre, COUNT(ug.us_id) from grupo gr, usuario_grupo ug
group by gr.nombre

select us.nombre, gr.nombre from usuarios us, grupo gr
where us.id in (select ug.us_id from usuario_grupo ug)
and gr.id in (select ug.gr_id from usuario_grupo ug)
and gr.nombre like '%intensivo%'

select nombre from usuarios
where id in (select us_id from usuario_grupo
            where us_id = 2)

select g.nombre, MAX(ug.us_id) from grupo g, usuario_grupo ug
where g.id = ug.gr_id
group by g.nombre

select u.nombre, g.fecha_creacion from usuarios u, grupo g, usuario_grupo ug
where u.id = ug.us_id
and g.id = ug.gr_id
and g.fecha_creacion between '2020-03-08' and '2022-03-08'

select nombre from usuarios
where id in (select us_id from usuario_grupo where gr_id = 3)

select g.descripcion, COUNT(ug.us_id) from grupo g, usuario_grupo ug
where g.id = ug.gr_id
and g.descripcion like '%matutino%'
group by g.descripcion

select h.habitacion_numero, hu.nombre, hu.apellidos from habitaciones h, huespedes hu, reservas r
where h.habitacion_numero = r.habitacion_numero
and hu.id = r.id_huesped

select nombre, apellidos from huespedes 
where id in (select id_huesped from reservas
            where habitacion_numero = 2)

select h.habitacion_numero, COUNT(r.id_huesped) from habitaciones h, reservas r
where h.habitacion_numero = r.habitacion_numero
group by h.habitacion_numero

select h.habitacion_numero, h.piso, hu.nombre, hu.apellidos from habitaciones h, huespedes hu, reservas r
where h.piso = 4
and h.habitacion_numero = r.habitacion_numero
and hu.id = r.id_huesped

select nombre, apellidos from huespedes
where id in (select id_huesped from reservas 
            where habitacion_numero = 3)

select h.habitacion_numero, AVG(r.id_huesped) from habitaciones h, reservas r
where h.habitacion_numero = r.habitacion_numero
group by h.habitacion_numero

select h.habitacion_numero, hu.nombre, hu.apellidos from habitaciones h, huespedes hu, reservas r
where  h.habitacion_numero = r. habitacion_numero
and hu.id = r.id_huesped

select nombre, apellidos from huespedes
where id in (select id_huesped from reservas 
            where habitacion_numero = 4);

select h.habitacion_numero, SUM(h.precio_por_noche) from habitaciones h, reservas r
where h.habitacion_numero = r.habitacion_numero
group by h.habitacion_numero

select m.nombre, p.proyecto from municipio m, proyecto p, proyecto_municipio pm 
where m.id = pm.municipio_id
and p.id = pm.proyecto_id

select proyecto from proyecto
where id in (select proyecto_id from proyecto_municipio
            where proyecto_id = 1)

select m.nombre, COUNT(pm.proyecto_id) from municipio m, proyecto_municipio pm
where m.id = pm.municipio_id
group by m.nombre

select m.nombre, p.proyecto from municipio m , proyecto p, proyecto_municipio pm
where m.id = pm.municipio_id
and p.id = pm.proyecto_id
and m.nombre like '%GAD%'

select m.nombre, MIN(pm.proyecto_id) from municipio m, proyecto_municipio pm 
where m.id = pm.municipio_id
group by m.nombre

select m.nombre,c.nombre from municipio m, ciudad c
where m.ciudad_id = c.id

select proyecto from proyecto
where id in (select proyecto_id from proyecto_municipio 
            where municipio_id = 3);

select m.nombre, MAX(pm.proyecto_id) from municipio m, proyecto_municipio pm
where m.id = pm.municipio_id
group by m.nombre