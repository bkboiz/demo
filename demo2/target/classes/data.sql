CREATE TABLE tbl_user (
                          id INT AUTO_INCREMENT  PRIMARY KEY,
                          username VARCHAR(250) NOT NULL,
                          password VARCHAR(250) NOT NULL
);
INSERT INTO
    tbl_user (username, password)
VALUES
('stackjava', 'stackjava'),
('admin', 'admin1234'),
('root', 'root');