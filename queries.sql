--Part 1 List the columns and their data types in the table as a SQL comment.
-- skills VARCHAR(255)
-- name VARCHAR(255)
-- id INT
-- employer VARCHAR(255)


--Part 2
SELECT name FROM employer WHERE location = "St. Louis City";

--Part 3
DROP TABLE job;


--Part 4
SELECT * FROM skill INNER JOIN job_skills ON skill.id = job_skills.skills_id WHERE job_skills.jobs_id IS NOT NULL ORDER BY name ASC;
