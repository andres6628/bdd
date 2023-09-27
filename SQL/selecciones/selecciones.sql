--productos
Select * from productos where nombre like 'Q%';
Select * from productos where descripcion is null;
Select * from productos where precio >= '€50' and precio <= '€100';
--cuentas
select numero_cuenta as "Nro Cuenta", saldo from cuentas;
select * from registros_entrada where fecha between '23-09-2023' and '23-07-2023';
select numero_cuenta as "Nro Cuenta", saldo from cuentas where fecha_creacion between '23-09-2023' and '23-07-2023';
--estudiantes
select nombre, cedula from estudiantes;
select nombre from estudiantes where cedula like '17%';
select nombre, apellido from estudiantes where nombre like 'A%';
--registro_entradas
select cedula_empleado,fecha,hora from registros_entrada;
select * from registros_entrada where hora between '7:00' and '14:00';
select * from registros_entrada where hora > '8:00';
--videojuegos
select * from videojuegos where nombre like 'C%';
select * from videojuegos where valoracion between 9 and 10;
select * from videojuegos where descripcion is null;
--transacciones
select * from transacciones where tipo = 'D';
select * from transacciones where monto between '200' and '2000';
select codigo, monto, tipo, fecha from transacciones where fecha is not null;