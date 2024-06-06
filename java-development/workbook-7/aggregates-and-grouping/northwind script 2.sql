-- how many suppliers?
use northwind;

select count(*)
from suppliers
-- 29 

-- the sum of all employees salary 
SELECT sum(salary) as totalsalary
from employees;

-- 20362.929931640625

-- what is the price of the cheapest item northwind sells ?
SELECT min(unitprice) as cheapestprice
from products;
-- geitost , 2.5

-- What is the average price northwind sells?
select avg(unitprice) as averageprice
from products
-- 28.86

-- What is the most expensive item northwind sells?
select max(unitprice) as mostexpensiveprice
from products
-- CTE de blaye , 263.5

-- question 6

select supplierid , count(*) as itemcount
from products
group by supplierid;

-- question 7
SELECT categoryID , avg(unitprice) as Averageprice
from products
group by CategoryID;

-- question 8 
select supplierid , count(*) as itemcount
from products
group by supplierid
having itemcount >= 5;

-- question 9 
Select ProductID, ProductName, unitprice * UnitsInStock as InventoryValue
from products
order by InventoryValue desc , ProductName asc;