insert into ususario values('0000000000','Andres','Villacres','C',6000);
insert into ususario values('0000000001','Jose','Villacis','A',5000);
insert into ususario values('0000000002','Martin','Villares','C',7000);
insert into ususario values('0000000003','Andres1','Villa','A',8000);
insert into ususario values('0000000004','Jose1','Villanueva','C',6000);
insert into ususario values('0000000005','Carlos','Viteri','A',2000);
insert into ususario values('0000000006','Pedro','Viteri','C',1000);
insert into ususario values('0000000007','Maria','Paucar','A',6000);
insert into ususario values('0000000008','Carla','Paucar','C',2000);
insert into ususario values('0000000009','Andrea','Jerez','A',3000);
insert into ususario values('0000000010','Andy','Jerez','C',4000);

insert into cuentas values('C01', '0000000001', '2023-10-22',25);
insert into cuentas values('C02', '0000000002', '2023-10-22',25);
insert into cuentas values('C03', '0000000003', '2023-10-22',25);
insert into cuentas values('C04', '0000000004', '2023-10-22',25);
insert into cuentas values('C05', '0000000005', '2023-10-22',25);
insert into cuentas values('C06', '0000000006', '2023-10-22',25);
insert into cuentas values('C07', '0000000007', '2023-10-22',25);
insert into cuentas values('C08', '0000000008', '2023-10-22',25);
insert into cuentas values('C09', '0000000009', '2023-10-22',25);
insert into cuentas values('C10', '0000000010', '2023-10-22',25);

insert into clientes values('1000000000','Andres','Villacres');
insert into clientes values('2000000000','Andrea','Villacis');
insert into clientes values('3000000000','Andy','Villares');
insert into clientes values('4000000000','Anderson','Villa');
insert into clientes values('5000000000','Andres','Villamarin');
insert into clientes values('6000000000','Maria','Villanueva');
insert into clientes values('7000000000','Mario','Viteri');
insert into clientes values('8000000000','Pedro','Jerez');
insert into clientes values('9000000000','Pepe','Paucar');
insert into clientes values('1100000000','Armando','Arias');

insert into compras values(1,'1000000000','2023-10-23',100);
insert into compras values(2,'1000000000','2023-10-23',200);
insert into compras values(3,'1000000000','2023-10-23',10);
insert into compras values(4,'2000000000','2023-10-23',10);
insert into compras values(5,'2000000000','2023-10-23',400);
insert into compras values(6,'2000000000','2023-10-23',1);
insert into compras values(7,'3000000000','2023-10-23',2);
insert into compras values(8,'3000000000','2023-10-23',500);
insert into compras values(9,'3000000000','2023-10-23',400);
insert into compras values(10,'3000000000','2023-10-23',100);

insert into productos values(1,'celular',null,500,25);
insert into productos values(2,'teclado',null,200,25);
insert into productos values(3,'laptop',null,100,25);
insert into productos values(4,'mouse',null,150,25);
insert into productos values(5,'case',null,10,25);
insert into productos values(6,'carcasa',null,1,25);
insert into productos values(7,'mica',null,1,25);
insert into productos values(8,'silla',null,125,25);
insert into productos values(9,'mouspad',null,1,25);
insert into productos values(10,'telefono',null,250,25);

insert into ventas values(1,1,'2023-10-23',2);
insert into ventas values(2,1,'2023-10-23',1);
insert into ventas values(3,1,'2023-10-23',1);
insert into ventas values(4,2,'2023-10-23',2);
insert into ventas values(5,3,'2023-10-23',2);
insert into ventas values(6,4,'2023-10-23',1);
insert into ventas values(7,5,'2023-10-23',1);
insert into ventas values(8,5,'2023-10-23',1);
insert into ventas values(9,6,'2023-10-23',1);
insert into ventas values(10,6,'2023-10-23',1);

insert into videojuegos values(1,'Pes',null,4);
insert into videojuegos values(2,'fifa',null,4);
insert into videojuegos values(3,'last of us',null,4);
insert into videojuegos values(4,'crash',null,4);
insert into videojuegos values(5,'mario',null,4);
insert into videojuegos values(6,'mario kart',null,1);
insert into videojuegos values(7,'wwe',null,1);
insert into videojuegos values(8,'snake',null,1);
insert into videojuegos values(9,'dragon ball',null,1);
insert into videojuegos values(10,'tarzan',null,1);

insert into plataformas values(1,'X1',1);
insert into plataformas values(2,'X2',1);
insert into plataformas values(3,'X3',2);
insert into plataformas values(4,'X4',2);
insert into plataformas values(5,'X5',3);
insert into plataformas values(6,'C1',4);
insert into plataformas values(7,'C2',5);
insert into plataformas values(8,'C3',6);
insert into plataformas values(9,'C4',7);
insert into plataformas values(10,'C5',7);

insert into colegio values('bolivar','ambato','0000000000');
insert into colegio values('ambato','ambato','0000000001');
insert into colegio values('la salle','ambato','0000000002');
insert into colegio values('bolivar 1','ambato','0000000000');
insert into colegio values('bolivar 2','ambato','0000000000');
insert into colegio values('bolivar 3','ambato','0000000000');
insert into colegio values('bolivar 4','ambato','0000000000');
insert into colegio values('bolivar 5','ambato','0000000000');
insert into colegio values('bolivar 6','ambato','0000000000');
insert into colegio values('bolivar 7','ambato','0000000000');

insert into profesores values(1,'Mario');
insert into profesores values(2,'Maria');
insert into profesores values(3,'Pedro');
insert into profesores values(4,'Pepe');
insert into profesores values(5,'Marta');
insert into profesores values(6,'Marco');
insert into profesores values(7,'Marcos');
insert into profesores values(8,'Andres');
insert into profesores values(9,'Andrea');
insert into profesores values(10,'Andy');

insert into empleado values(1,'Pedro','2023-10-23','8:30');
insert into empleado values(2,'Pepe','2023-10-23','8:30');
insert into empleado values(3,'Pablo','2023-10-23','8:30');
insert into empleado values(4,'Andres','2023-10-23','8:30');
insert into empleado values(5,'Andrea','2023-10-23','8:30');
insert into empleado values(6,'Anderson','2023-10-23','8:30');
insert into empleado values(7,'Mario','2023-10-23','8:30');
insert into empleado values(8,'Maria','2023-10-23','8:30');
insert into empleado values(9,'Marlon','2023-10-23','8:30');
insert into empleado values(10,'Maribel','2023-10-23','8:30');

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


insert into transacciones values(1,'00001',100,'A','2023-10-23','8:30');
insert into transacciones values(2,'00002',100,'A','2023-10-23','8:30');
insert into transacciones values(3,'00003',100,'A','2023-10-23','8:30');
insert into transacciones values(4,'00004',100,'A','2023-10-23','8:30');
insert into transacciones values(5,'00005',100,'A','2023-10-23','8:30');
insert into transacciones values(6,'00006',100,'A','2023-10-23','8:30');
insert into transacciones values(7,'00007',100,'A','2023-10-23','8:30');
insert into transacciones values(8,'00008',100,'A','2023-10-23','8:30');
insert into transacciones values(9,'00009',100,'A','2023-10-23','8:30');
insert into transacciones values(10,'00010',100,'A','2023-10-23','8:30');

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