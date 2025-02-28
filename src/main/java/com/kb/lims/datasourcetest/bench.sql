CREATE DATABASE IF NOT EXISTS lims;
USE lims;

CREATE TABLE bench (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(100) NOT NULL,
                        location VARCHAR(2),
                        project_name VARCHAR(50),
                        date_of_purchase TIMESTAMP,
                        manager VARCHAR(100),
                        state VARCHAR(20),
                        user VARCHAR(100),
                        last_calibration_date TIMESTAMP,
                        calibration_period INT
);

INSERT INTO bench (name, location, project_name, date_of_purchase, manager, state, user, last_calibration_date, calibration_period) VALUES
        ('abc', '苏州', '项目1', '2020-01-01 00:00:00', '张三', '损坏', '使用人A', '2019-01-01 00:00:00', 365),
        ('idk', '大连', '项目2', '2022-12-19 00:00:00', '李四', '修理中', '使用人C', '2020-01-01 00:00:00', 30),
        ('qwerty', '重庆', '项目1', '2023-05-07 00:00:00', '王五', '正在使用', '使用人B', '2020-01-01 00:00:00', 730),
        ('xyz', '苏州', '项目3', '2024-04-06 00:00:00', '张三', '空闲', null, '2020-01-01 00:00:00', 15);