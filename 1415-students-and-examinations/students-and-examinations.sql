SELECT ss.student_id,
       ss.student_name,
       ss.subject_name,
       COUNT(e.subject_name) AS attended_exams
FROM (
  SELECT s.student_id, s.student_name, sub.subject_name
  FROM Students AS s
  CROSS JOIN Subjects AS sub
) AS ss
LEFT JOIN Examinations AS e
  ON ss.student_id = e.student_id AND ss.subject_name = e.subject_name
GROUP BY ss.student_id, ss.student_name, ss.subject_name
ORDER BY ss.student_id, ss.subject_name;
