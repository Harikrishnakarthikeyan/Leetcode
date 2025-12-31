WITH filtered AS (
    SELECT *
    FROM Stadium
    WHERE people >= 100
),
grouped AS (
    SELECT *,
           id - ROW_NUMBER() OVER (ORDER BY id) AS grp
    FROM filtered
),
final AS (
    SELECT *
    FROM grouped
    WHERE grp IN (
        SELECT grp
        FROM grouped
        GROUP BY grp
        HAVING COUNT(*) >= 3
    )
)
SELECT id, visit_date, people
FROM final
ORDER BY visit_date;