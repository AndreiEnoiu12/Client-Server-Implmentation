/*

SELECT DATABASE();

*/
 CREATE DATABASE dissasembly_system;
USE dissasembly_system;
DROP DATABASE dissasembly_system;

 DELETE FROM package_parts WHERE package_id = 1;
 DELETE FROM package WHERE id = 1;

SELECT chassis_nr, weight, model FROM car;
SELECT * FROM pallet_parts;
SELECT * FROM package_parts;
SELECT * FROM car;
SELECT quantity FROM part WHERE chassis_nr = "123ABC" AND part_name = "wheel";

SELECT part.chassis_nr, part.part_name, part.weight, pallet_parts.part_quantity FROM pallet_parts
JOIN part ON part.chassis_nr = pallet_parts.part_chassis_nr AND part.part_name = pallet_parts.part_name
WHERE pallet_parts.pallet_id = 2;

SELECT part.chassis_nr, part.part_name, part.weight, package_parts.part_quantity FROM package_parts 
JOIN part ON part.chassis_nr = package_parts.part_chassis_nr AND part.part_name = package_parts.part_name 
WHERE package_parts.package_id = 1;



SELECT * FROM pallet_parts;

INSERT INTO car(chassis_nr, model, weight) values ("123ABC", "Ford", 128988);
INSERT INTO car(chassis_nr, model, weight) values ("123BCD", "Tesla", 1231);
INSERT INTO package(type,destination) values ("radio system", "Nevada");

INSERT INTO package_parts(package_id, part_chassis_nr, part_name) VALUES (1,"123ABC","wheel")
ON DUPLICATE KEY UPDATE part_quantity = part_quantity+1;

INSERT INTO part(part_name, weight, chassis_nr) values ("wheel", 123, "123ABC")
ON DUPLICATE KEY UPDATE quantity = quantity+1;

INSERT INTO part(part_name, weight, chassis_nr) values ("wheel", 112, "123BCD")
ON DUPLICATE KEY UPDATE quantity = quantity+1;

INSERT INTO pallet (max_weight_cap, type_of_parts) values (100000, "Wheels2");

INSERT INTO pallet_parts(pallet_id, part_chassis_nr,part_name, part_quantity) values (2,"123ABC","wheel",2);
INSERT INTO pallet_parts(pallet_id, part_chassis_nr,part_name, part_quantity) values (2,"123BCD","wheel",2);

DELETE FROM pallet_parts WHERE pallet_id = 2 AND part_chassis_nr = "123ABC" AND part_name = "wheel";



SELECT SUM(weight) FROM (SELECT part.weight * part.quantity AS weight FROM pallet_parts 
INNER JOIN part ON pallet_parts.part_chassis_nr = part.chassis_nr
INNER JOIN pallet ON pallet_parts.pallet_id = pallet.id WHERE pallet_parts.pallet_id = 1) AS newTable;

SELECT max_weight_cap FROM pallet WHERE id = 1;
UPDATE pallet_parts SET quantity = quantity - 3 WHERE pallet_id = 1;
SELECT weight, quantity FROM part WHERE chassis_nr = "123ABC" AND part_name = "wheel";

SELECT max_weight_cap, part_quantity FROM pallet_parts 
JOIN pallet ON pallet_id = pallet.id
JOIN part ON pallet_parts.part_chassis_nr = part.chassis_nr WHERE pallet.id = 1 AND part_chassis_nr = "123ABC"
AND part.part_name = "wheel";

SELECT car.chassis_nr, part.part_name, pallet_parts.pallet_id, package.destination, package.part_quantity FROM part
JOIN car on car.chassis_nr = part.chassis_nr
JOIN pallet_parts on part.chassis_nr = pallet_parts.part_chassis_nr AND part.part_name = pallet_parts.part_name
JOIN package_parts on package_parts.part_chassis_nr = part.chassis_nr AND part.part_name = package_parts.part_name
JOIN package on package_parts.package_id = package.id WHERE car.chassis_nr = "123BCD";

SELECT * FROM pallet;

SELECT id FROM pallet WHERE ID = (SELECT MAX(ID) FROM pallet);
SELECT part_name, weight, chassis_nr, quantity FROM part;
/*
- add/get/remove: car, part, pallet, package,

- track parts from stolen car

- add/get/remove:  parts on the pallet
		check if max_weight_cap is ok
        
    