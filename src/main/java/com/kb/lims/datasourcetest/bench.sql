CREATE DATABASE IF NOT EXISTS lims;
USE lims;

CREATE TABLE bench (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(100) NOT NULL,
                        location VARCHAR(2),
                        project VARCHAR(50),
                        date_of_purchase TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        manager VARCHAR(100),
                        state VARCHAR(20)
);

INSERT INTO bench (name, location, project, date_of_purchase, manager, state) VALUES
        ('abc', '苏州', '项目1', 2020-01-01 00:00:00, '张三', '损坏'),
        ('idk', '大连', '项目2', 2022-12-19 00:00:00, '李四', '修理中'),
        ('qwerty', '重庆', '项目1', 2023-05-07 00:00:00, '王五', '正在使用'),
        ('xyz', '苏州', '项目3', 2024-04-06 00:00:00, '张三', '空闲');