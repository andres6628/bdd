--productos
update productos set stock = 0 where stock is null;
--cuentas
update cuentas set saldo = 10 where cedula_propietario like '17%';
--estudiantes
update estudiantes set apellido = 'Hernández' where cedula like '17%';
--registros_entrada
update registros_entrada set cedula_empleado = '082345679' where fecha between '01-09-2023' and '30-09-2023';
--videojuegos
update videojuegos set descripcion = 'mejor puntuado' where valoracion > 9;
--transacciones
update transacciones set tipo = 'D' where (monto > '100' and monto <'500') and (fecha between '01-09-2023' and '30-09-2023') and (hora between '14:00' and '20:00'); 