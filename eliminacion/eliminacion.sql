delete from productos where descripcion is null;
delete from cuentas where cedula_propietario like '10%';
delete from estudiantes where cedula like '%05';
delete from registros_entrada where fecha between '01-06-2023' and '30-06-2023';
delete from videojuegos where valoracion < 7;
delete from transacciones where hora between '14:00' and '18:00';

