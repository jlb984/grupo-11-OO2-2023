create schema if not exists `tp_smart_city`;
use `tp_smart_city`;

-- user_role

insert into `tp_smart_city`.`user_role`(`id_role`, `name`)
values('1', "ADMIN");
insert into user_role(`id_role`, `name`)
values('2', "AUDIT");

-- usuario = admin , password = 1234

INSERT INTO `tp_smart_city`.`user` (`id_user`, `document`, `email`, `enabled`, `name`, `password`, `surname`, `type`, `user_name`, `id_role`)
 VALUES ('1', '11111111', 'ABC@GMAIL.COM', b'1', 'JUAN', '$2a$10$dpeJJWGeZBFgPwQLT4Sf4OQKK7lvOA0C4p3DN/H7jhb.mMH56GbGK', 'JUAN', 'DNI', 'admin', '1');

INSERT INTO `tp_smart_city`.`user` (`id_user`, `document`, `email`, `enabled`, `name`, `password`, `surname`, `type`, `user_name`, `id_role`)
VALUES ('2', '22222222', 'DEF@GMAIL.COM', b'1', 'GIMENA', '$2a$10$dpeJJWGeZBFgPwQLT4Sf4OQKK7lvOA0C4p3DN/H7jhb.mMH56GbGK', 'GIMENA', 'DNI', 'audit', '2');

-- lugar

insert into lugar(id_lugar, ciudad,nombre_lugar,posiciongps)
values(1, 'Buenos Aires','Lanus','12334');

insert into lugar(id_lugar, ciudad,nombre_lugar,posiciongps)
values(2, 'Buenos Aires','Quilmes','56789');

insert into lugar(id_lugar, ciudad,nombre_lugar,posiciongps)
values(3, 'Buenos Aires','La Plata','012356');

-- dispositivos
insert into dispositivoiot(id_dispositivo, descripcion, esta_activo, nombre, id_lugar) values ('1', "zona norte", b'1', "banio juana manso", '1');
insert into dispositivoiot(id_dispositivo, descripcion, esta_activo, nombre, id_lugar) values ('2', "zona sur", b'1', "banio juana manso", '1');
insert into dispositivoiot(id_dispositivo, descripcion, esta_activo, nombre, id_lugar) values ('3', "zona oeste", b'1', "banio juana manso", '2');
insert into dispositivoiot(id_dispositivo, descripcion, esta_activo, nombre, id_lugar) values ('4', "zona norte", b'1', "banio juana manso", '2');
-- banios publicos


insert into banios_publicos(hora_ultima_limpieza, nivel_deposito, ocupado, id_banios_publicos) values( '2023-04-03 09:10:00','100',b'1','1');
insert into banios_publicos(hora_ultima_limpieza, nivel_deposito, ocupado, id_banios_publicos) values( '2023-04-03 12:10:00','80',b'1','2');

-- insert RiegoAutomatico
insert into riego_automatico(nivel_humedad, niveluv, temperatura, id_riego_automatico) values(122,22,34,3);
insert into riego_automatico(nivel_humedad, niveluv, temperatura, id_riego_automatico) values(111,90,45,4);

SELECT * from user_role;
SELECT * from user ;
SELECT * from lugar;
SELECT * from banios_publicos;
SELECT * from riego_automatico;