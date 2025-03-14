CREATE DATABASE IF NOT EXISTS lims;
USE lims;

CREATE TABLE IF NOT EXISTS dvp (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(50) NOT NULL,
                        status INT,
                        plan_creator VARCHAR(50),
                        creator_id INT,
                        rd_manager VARCHAR(50),
                        supervisor VARCHAR(50),
                        dvp_number VARCHAR(50),
                        product VARCHAR(50),
                        revision INT,
                        coc DOUBLE(2, 1),
                        verification_and_validation_scope VARCHAR(50),
                        kb_part_number VARCHAR(50),
                        customer_part_number VARCHAR(50),
                        customer_project VARCHAR(50),
                        rd_approval VARCHAR(50),
                        rd_date TIMESTAMP,
                        individual_test_request VARCHAR(50),
                        task_number INT,
                        task_summary VARCHAR(50),
                        task_name VARCHAR(50),
                        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        CONSTRAINT creator_id_foreign_key FOREIGN KEY (creator_id) REFERENCES user (id)
);

INSERT INTO dvp (name, status, plan_creator, creator_id, rd_manager, supervisor, dvp_number, product, revision, coc,
    verification_and_validation_scope, kb_part_number, customer_part_number,customer_project,
    rd_approval, rd_date, individual_test_request, task_number, task_summary, task_name)
    VALUES
    ('name1', 0, 'plancreator', 2, 'r&d manager', 'supervisor', 'dvp_number', 'product', 2, 3.2, 'Demo', 'kb part number', 'customer part number', 'customer project', 'r&d manager', '2020-01-01 00:00:00', 'Test', 1, 'summary', 'task name'),
    ('name2', 0, 'plancreator', 3, 'r&d manager', 'supervisor', '123', 'Test', 2, 3.2, 'Demo', 'Demo', 'Demo', 'Demo', 'r&d manager', '2020-01-01 00:00:00', 'Test', 1, 'summary', 'name'),
    ('name3', 0, 'plancreator', 4, 'r&d manager', 'supervisor', '123', 'Test', 2, 3.2, 'Demo', 'Demo', 'Demo', 'Demo', 'r&d manager', '2020-01-01 00:00:00', 'Test', 1, 'summary', 'name'),
    ('name4', 0, 'plancreator', 2, 'r&d manager', 'supervisor', '123', 'Test', 2, 3.2, 'Demo', 'Demo', 'Demo', 'Demo', 'r&d manager', '2020-01-01 00:00:00', 'Test', 1, 'summary', 'name');