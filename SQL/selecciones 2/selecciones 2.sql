--productos
select * from productos where stock = 10 and precio < '10';
select nombre, stock from productos where nombre like '%m%' or descripcion like '% %';
select nombre from productos where descripcion is null or stock = 0;
--cuentas
select numero_cuenta, saldo from cuentas where saldo>'100' and saldo<'1000';
select * from cuentas where fecha_creacion > '2022-09-26' and fecha_creacion < '2023-09-26';
select * from cuentas where saldo = 0 or cedula like '%2';
--estudiantes
select * from estudiantes;
select nombre, apellido from estudiantes where nombre like 'M%' or apellido like '%Z';
select nombre from estudiantes where cedula like '%32%' and cedula like '18%';
select nombre, apellido from estudiantes where cedula like '%06' and cedula like '17%';
--registros entradas
select * from registros_entrada where (fecha between '01-09-2023' and '30-09-2023') or cedula_empleado like '17%';
select * from registros_entrada where (fecha between '01-08-2023' and '31-08-2023') and cedula_empleado like '17%' and (hora between '8:00' and '12:00');
select * from registros_entrada where ((fecha between '01-08-2023' and '31-08-2023') and cedula_empleado like '17%' and (hora between '8:00' and '12:00')) or ((fecha between '01-09-2023' and '30-09-2023') and cedula_empleado like '08%' and (hora between '9:00' and '13:00'));
--videojuegos
select * from videojuegos where nombre like '%C%' or valoracion = 7;
select * from videojuegos where codigo between 3 and 7 or valoracion = 7;
select * from videojuegos where (valoracion > 7 and nombre like 'C%') or (valoracion > 8 and nombre like 'D%');
--transacciones
select * from transacciones
select * from transacciones where tipo = 'C' and (numero_cuenta between '222001' and '22004');
select * from transacciones where tipo = 'D' and fecha = '25-05-2023' and (numero_cuenta between '22007' and '22010');
select * from transacciones where (codigo between 1 and 5) and (numero_cuenta between '22002' and '22004') and fecha = '26-05-2023' and fecha = '29-05-2023';