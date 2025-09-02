SELECT 
  p.product_id,
  ROUND(
    COALESCE(SUM(u.units * p.price) / NULLIF(SUM(u.units), 0), 0),
    2
  ) AS average_price
FROM 
  prices p
LEFT JOIN (
  SELECT 
    product_id, 
    purchase_date, 
    units 
  FROM 
    unitssold
  WHERE 
    purchase_date IS NOT NULL
) u ON p.product_id = u.product_id
     AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY 
  p.product_id;