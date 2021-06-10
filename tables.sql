CREATE TABLE car (
	chassis_nr VARCHAR(50) PRIMARY KEY not NULL,
    weight INTEGER not NULL,
    model  VARCHAR(50)
);
    
CREATE TABLE pallet (
	id INTEGER PRIMARY KEY auto_increment,
    max_weight_cap INTEGER,
    type_of_parts VARCHAR(50)
);
    
CREATE TABLE package (
	id INTEGER PRIMARY KEY auto_increment,
    type VARCHAR(50),
	destination VARCHAR(50)
); 

CREATE TABLE part (
    chassis_nr VARCHAR(50),
	part_name VARCHAR(50),
    weight INTEGER,
    quantity INTEGER DEFAULT 1,
    
	FOREIGN KEY (chassis_nr) REFERENCES car(chassis_nr),
    PRIMARY KEY(part_name, chassis_nr)
);

CREATE TABLE pallet_parts(
		pallet_id INTEGER,
        part_chassis_nr VARCHAR(50),
        part_name VARCHAR(50),
        part_quantity INTEGER DEFAULT 1,
        
        FOREIGN KEY (pallet_id) REFERENCES 
        pallet(id),
        FOREIGN KEY (part_chassis_nr, part_name) REFERENCES
        part(chassis_nr, part_name),
        
        PRIMARY KEY(part_chassis_nr, part_name, pallet_id)
);

CREATE TABLE package_parts(
		package_id INTEGER,
        part_chassis_nr VARCHAR(50),
        part_name VARCHAR(50),
        part_quantity INTEGER DEFAULT 1,
        
        FOREIGN KEY (package_id) REFERENCES package(id),
        FOREIGN KEY (part_chassis_nr, part_name) REFERENCES
        part(chassis_nr, part_name),
        
		PRIMARY KEY(part_chassis_nr, part_name, package_id)
);
