# Gabingueva
This a Invoice Management System Java code that allows you to
Add, Delete, View, Edit Services, Client, and Invoice.

FIRST STEP is to launch your MYSQL SERVER
change the directory to the location of your MYSQL folder
>cd (your file path of mysql server)

Then run the your server
>mysqld --console
If your server is starting and good to go, leave it for now.

SECOND STEP is to launch your MYSQL Database
Open another CMD
change the directory to the location of your MYSQL folder
>cd (your file path of mysql)

launch your mysql server using your user name and input the password of it

>mysql -u (your username) -p

Enter password: (enter your password)
If your mysql is good and running then create the database

THIRD STEP
CREATE DATABASE invoicesystem;

Use the database
>use invoicesystem;

FOURTH STEP
2ND STEP
Input this lines of code to create the tables and columns of your database.
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

After that, leave it open.

FIFTH STEP
Run your Visual Studio Code
git clone the code to your visual studio code
connect the jdbc driver to your referenced libraries
then run the code

The code should be running perfectly.






