CREATE DATABASE invoicesystem;
use invoicesystem;
CREATE TABLE clients (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    email VARCHAR(255)
);

CREATE TABLE services (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    billed_hours INT
);

CREATE TABLE invoices (
    id INT PRIMARY KEY AUTO_INCREMENT,
    client_id INT,
    amount DOUBLE,
    FOREIGN KEY (client_id) REFERENCES clients(id)
);