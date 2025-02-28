CREATE DATABASE IF NOT EXISTS lims;
USE lims;

CREATE TABLE sample (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        project_name VARCHAR(100) NOT NULL,
                        model VARCHAR(100) NOT NULL,
                        number INT,
                        initiator VARCHAR(100) NOT NULL,
                        initiator_department VARCHAR(100),
                        receiver VARCHAR(100) NOT NULL,
                        receiver_department VARCHAR(100),
                        initiate_date TIMESTAMP,
                        receive_date TIMESTAMP
);

INSERT INTO sample (project_name, model, number, initiator, initiator_department, receiver,
                    receiver_department, initiate_date, receive_date) VALUES
    ('项目A', '型号001', 2, '发起人A', '部门A', '接受人B', '部门B', '2025-01-21 00:00:00', '2025-02-01 00:00:00'),
('项目B', '型号002', 1, '发起人B', '部门B', '接受人C', '部门C', '2025-01-10 00:00:00', '2025-02-02 00:00:00'),
('项目C', '型号015', 3, '发起人C', '部门C', '接受人B', '部门B', '2025-01-29 00:00:00', '2025-02-11 00:00:00'),
('项目D', '型号111', 5, '发起人D', '部门D', '接受人A', '部门A', '2025-01-23 00:00:00', '2025-02-18 00:00:00');