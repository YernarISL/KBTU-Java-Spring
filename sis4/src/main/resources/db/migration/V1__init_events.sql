CREATE TABLE init_events (
    id UUID PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    location VARCHAR(255) NOT NULL,
    date TIMESTAMP NOT NULL,
    price REAL NOT NULL,
    organization_name VARCHAR(255) NOT NULL
)