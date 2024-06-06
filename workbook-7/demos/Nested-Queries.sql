USE northwind;

-- 1.
SELECT ProductName
FROM Products
WHERE UnitPrice = (SELECT MAX(UnitPrice)
FROM Products);