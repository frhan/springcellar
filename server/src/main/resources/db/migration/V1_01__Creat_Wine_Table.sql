
CREATE TABLE wines(
  id SERIAL PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  year VARCHAR(4),
  grapes VARCHAR(100),
  country VARCHAR(100),
  region VARCHAR(100),
  description text,
  picture VARCHAR(100)
);
