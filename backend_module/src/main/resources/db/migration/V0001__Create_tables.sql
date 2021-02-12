CREATE TABLE Point (id INT AUTO_INCREMENT NOT NULL,
    coordinates POINT NOT NULL,
    count INT,
    adress VARCHAR(200),
    PRIMARY KEY(id));

CREATE TABLE DatePoint (id INT AUTO_INCREMENT NOT NULL,
    description VARCHAR(300),
    photo VARCHAR(300),
    date DATE,
    links VARCHAR(200),
    point_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (point_id) REFERENCES Point(id));

CREATE TABLE User (id INT AUTO_INCREMENT NOT NULL,
    email VARCHAR(200),
    inAdmin BOOL,
    authData VARCHAR(300),
    PRIMARY KEY (id));