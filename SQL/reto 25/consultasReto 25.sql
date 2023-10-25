select AVG(saldo::numeric) as promedio from cuentas 
where cedula = (select cedula from ususario 
                where cedula = '0000000001');


alter table cuentas
add tipo_cuenta varchar(20);

update cuentas
set tipo_cuenta = 'Corriente'
where cedula between '0000000005' and '0000000010'

select tipo_cuenta, COUNT(numero_cuenta) from cuentas
group by tipo_cuenta

select cedula, COUNT(monto) as "total monto" from compras
group BY cedula

select fecha_compra, COUNT(monto) from compras 
where fecha_compra = '2023-10-23'
group by fecha_compra

select codigo_profesor, COUNT(cedula) from estudiantes
group by codigo_profesor

select * from estudiantes

select ROUND(AVG(EXTRACT(YEAR from AGE(CURRENT_DATE,fecha_nacimiento)))) from estudiantes

select SUM(monto) from prestamo
group by cedula

select * from personas

select COUNT(cedula) as "total personas" from personas where numero_hijos > 1

select MAX(precio) as "precio maximo" from productos

select SUM(cantidad) from ventas

select * from transacciones

select COUNT(codigo) from transacciones where tipo = 'C'

select numero_cuenta, ROUND(AVG(monto::decimal)) from transacciones group by numero_cuenta

select codigo_videojuegos, COUNT(id_plataforma) from plataformas 
group by codigo_videojuegos

select ROUND(AVG(valoracion)) as "Promedio valoracion" from videojuegos

select cedula_empleado, COUNT(codigo_registro) from registros_entrada
group by cedula_empleado

select MAX(fecha) as "fecha maxima", MIN(fecha) as "fecha minima" from registros_entrada