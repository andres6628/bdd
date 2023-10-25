select numero_cuenta 


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
or (vi.nombre like 'C%' and vi.valoracion >8 )
and vi.nombre like 'D%'

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