CREATE DATABASE lims;
USE lims;
CREATE TABLE user (
                      id INT AUTO_INCREMENT PRIMARY KEY,
                      name VARCHAR(100) NOT NULL,
                      phone VARCHAR(20),
                      email VARCHAR(100),
                      person_type VARCHAR(50),
                      created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
# 测试数据
INSERT INTO user (name, phone, email, person_type) VALUES
                                                       ('Alice Smith', '123-456-7890', 'alice.smith@example.com', '0'),
                                                       ('Bob Johnson', '234-567-8901', 'bob.johnson@example.com', '1'),
                                                       ('Charlie Brown', '345-678-9012', 'charlie.brown@example.com', '2'),
                                                       ('Diana Prince', '456-789-0123', 'diana.prince@example.com', '3'),
                                                       ('Ethan Hunt', '567-890-1234', 'ethan.hunt@example.com', '4');