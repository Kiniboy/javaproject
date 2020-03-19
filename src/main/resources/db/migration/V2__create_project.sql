CREATE TABLE Project (
    id LONG IDENTITY,
    titre VARCHAR(255),
    description VARCHAR(255),
    mode VARCHAR(50),
    budget VARCHAR(255),
    startDate TIMESTAMP,
    workDays INT
)