CREATE TABLE teachers
(
    id             UUID PRIMARY KEY,
    first_name     VARCHAR(255) NOT NULL,
    last_name      VARCHAR(255) NOT NULL,
    specialization VARCHAR(255) NOT NULL,
    email          VARCHAR(255)
);

CREATE TABLE courses
(
    id          UUID PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL
)