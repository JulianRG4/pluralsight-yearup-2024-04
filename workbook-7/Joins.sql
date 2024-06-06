USE northwind;

-- 1.
SELECT p.ProductID
	, p.ProductName
    , p.UnitPrice
    , c.CategoryName
FROM Products AS p
INNER JOIN categories AS c
	ON p.CategoryID = c.CategoryID
ORDER BY c.CategoryName	
	,p.ProductName;

-- 2.
SELECT p.ProductID
	, p.ProductName
    , p.UnitPrice
    , s.CompanyName AS SuplierName
    FROM Products AS p
    INNER JOIN suppliers AS s 
		ON p.SupplierID = s.SupplierID
WHERE p.unitPrice > 75
ORDER BY p.ProductName;

-- 3.
SELECT p.ProductID
	, p.ProductName
    , p.UnitPrice
    , c.CategoryName
    , s.CompanyName AS SupplierName
FROM Products p
JOIN Categories c 
	ON p.CategoryID = c.CategoryID
JOIN Suppliers s 
	ON p.SupplierID = s.SupplierID
ORDER BY p.ProductName;

-- 4. 
SELECT p.ProductName
	, c.CategoryName
FROM Products AS p
INNER JOIN Categories AS c
	On p.CategoryID = c.CategoryID
WHERE p.UnitPRICE = (SELECT MAX(UnitPrice)
FROM products);

-- 5.
SELECT o.OrderID
	, o.ShipName
	,o.ShipAddress
    ,s.CompanyName As ShippingCompanyName
FROM Orders As o
INNER JOIN Shippers AS s 
	ON o.ShipVia = s.ShipperID
WHERE o.ShipCountry = 'Germany';

-- 6.
SELECT o.OrderID
     , o.OrderDate
     , o.ShipName
     , o.ShipAddress
FROM Orders AS o
INNER JOIN `Order Details` AS od 
    ON o.OrderID = od.OrderID
INNER JOIN Products AS p 
    ON od.ProductID = p.ProductID
WHERE p.ProductName = 'Sasquatch Ale';