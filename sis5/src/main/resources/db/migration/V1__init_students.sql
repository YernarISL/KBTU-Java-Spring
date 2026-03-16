CREATE TABLE students (
    id UUID PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    specialization VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    year INTEGER,
    age INTEGER,
    gender VARCHAR(255),
    date_of_birth DATE
)