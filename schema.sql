CREATE DATABASE busbooking;
USE busbooking;
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100)
);

CREATE TABLE buses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    bus_name VARCHAR(100),
    source VARCHAR(100),
    destination VARCHAR(100),
    departure_time VARCHAR(100),
    arrival_time VARCHAR(10),
    price INT,
    seats INT
);

CREATE TABLE bookings (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    bus_id INT,
    seat_no INT
);


SHOW TABLES;
DESCRIBE users;
INSERT INTO buses (bus_name,source,destination,departure_time,arrival_time,price,seats)
VALUES
('SR Tourist','Siruguppa','Bengaluru','21:30','05:30',600,40),
('Nagashree Travels','Siruguppa','Bengaluru','22:20','06:00',549,40),
('VRL Travels','Siruguppa','Bengaluru','20:45','04:45',750,40);

DROP TABLE buses;
CREATE TABLE buses (
 id INT AUTO_INCREMENT PRIMARY KEY,
 bus_name VARCHAR(100),
 source VARCHAR(100),
 destination VARCHAR(100),
 departure_time VARCHAR(10),
 arrival_time VARCHAR(10),
 price INT,
 seats INT
);
SHOW TABLES;
DESCRIBE buses;
SHOW DATABASES;