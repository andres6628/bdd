select cu.numero_cuenta, us.nombre
from cuentas cu, ususario us 
where cu.saldo between '100' and '1000'

select cu.numero_cuenta, cu.fecha_creacion, cu.saldo, 
cu.cedula ,us.nombre from cuentas cu, ususario us
where cu.fecha_creacion between '2022-09-21' and '2023-10-23'

select nombre, apellido from clientes
where cedula like '%7%'

select * from clientes where
cedula = (select cedula from clientes where nombre = 'Monica');

select codigo_profesor, nombre, apellido from estudiantes
where apellido like '%n%'

select * from estudiantes 
where codigo_profesor = (select codigo from profesores where
						nombre = 'Franciso')

select pe.cantidad_ahorrada, pr.monto,pr.garante from personas pe, prestamo pr
where monto between '100' and '10000'

select * from personas 
where cedula = (select cedula from personas 
				where nombre = 'Sean')
				
select pr.nombre, pr.stock, ve.cantidad from productos pr, ventas ve
where  pr.nombre like '%m%' 
or pr.descripcion = '0' 

select nombre, stock from productos
where codigo in (select codigo_producto from ventas 
                where codigo_producto = 5);
				
select * from transacciones 
    where tipo = 'C'
    and numero_cuenta between '22001' and '22004'
	
select * from transacciones 
    where codigo = (select codigo_transaccion from banco 
                    where codigo_banco = 1)
					
select vi.nombre, vi.descripcion, vi.valoracion, pl.nombre_plataforma from videojuegos vi, plataformas pl
where (vi.descripcion = 'Guerra' and vi.valoracion > 7) 
or (vi.nombre like 'c%' and vi.valoracion >8 )
or vi.nombre like 'd%'					

select * from plataformas 
where codigo_videojuegos = (select codigo from videojuegos
                            where nombre = 'God of war')
					
select re.cedula_empleado, re.fecha, em.nombre from registros_entrada re, empleado em
where (re.fecha between '2023-08-01' and '2023-08-31')
or (re.cedula_empleado like '17%' and re.hora between '8:00' and '12:00')
or (re.fecha between '2023-10-20' and '2023-10-20')
and (re.cedula_empleado like '08%' and re.hora between '9:00' and '13:00')

select re.codigo_registro, em.nombre from registros_entrada re,  empleado em
where re.codigo_empleado in (select re.codigo_empleado from registros_entrada re
                            where re.cedula_empleado like '2201%' )
					