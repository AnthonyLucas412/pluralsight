use northwind;

-- question 1:
select p.productid, p.productname, p.unitprice, c.categoryname
from products p
inner join categories c on p.categoryid = c.categoryid
order by c.categoryname, p.productname;

-- question 2 

select p.productID, p.Productname, p.UnitPrice, s.CompanyName
from products p 
INNER JOIN suppliers s ON p.SupplierID = s.SupplierID;

-- question 5 
Select o.orderID, o.shipname, o.shipaddress, s.companyname as shippingcompany
from orders o 
inner join shippers s on o.shipvia = s.shipperid
where o.shipcountry = 'germany';

-- question 6

SELECT o.orderID , o.orderDate, o.shipname, o.shipaddress
from orders o
INNER JOIN `order details` od ON o.order.id = od.orderID
INNER JOIN products p ON p.productID = od.ProductID
WHERE ProductName = 'Sasquatch Ale';
