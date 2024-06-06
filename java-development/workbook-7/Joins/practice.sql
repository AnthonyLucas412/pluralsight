use join_customer_order;

SELECT o.id , o.sold_date,c.name, c.email
from `order` AS o
Left JOIN customer AS c ON o.customer_id = c.id