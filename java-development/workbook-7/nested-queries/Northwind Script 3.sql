use northwind;

-- question 1

SELECT productName
FROM Products
where UnitPrice = (SELECT max(UnitPrice)
From products);

-- question 2
SELECT orderID , Shipname, ShipAddress
from orders
where ShipVia = ( 
SELECT ShipperID
from shippers
where Companyname = "Federal Shipping")

