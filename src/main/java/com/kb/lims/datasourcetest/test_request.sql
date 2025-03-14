CREATE DATABASE IF NOT EXISTS lims;
USE lims;

CREATE TABLE test_request (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(50) NOT NULL,
                        status INT,
                        target VARCHAR(50),
                        cost_center VARCHAR(50),
                        project_number VARCHAR(50),
                        sample_id INT,
                        drawing_including_revision VARCHAR(50),
                        individual_requests VARCHAR(100),
                        dvp_id INT,
                        task_number INT,
                        task_name VARCHAR(50),
                        comments VARCHAR(500),
                        due_date TIMESTAMP,
                        samples_available_from TIMESTAMP,
                        rd_manager VARCHAR(50),
                        division VARCHAR(50),
                        creator_id INT,
                        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        CONSTRAINT sample_id_foreign_key FOREIGN KEY (sample_id) REFERENCES sample (id),
                        CONSTRAINT dvp_id_foreign_key FOREIGN KEY (dvp_id) REFERENCES dvp (id),
                        CONSTRAINT creator_id_foreign FOREIGN KEY (creator_id) REFERENCES user (id)
);

INSERT INTO test_request (name, status, target, cost_center, project_number, sample_id,
    drawing_including_revision, individual_requests, dvp_id, task_number, task_name, comments,
    due_date, samples_available_from, rd_manager, division, creator_id)
    VALUES
    ('name1', 1, 'target', 'cost center', 'project #', 2, 'drawing including revision', 'individual requests', 9, 0, 'task name', 'comments', '2020-01-01 00:00:00', '2022-07-20 00:00:00', 'r&d manager', 'COC 1.1', 2),
    ('name2', 0, 'target', 'cost center', 'project #', 2, 'drawing including revision', 'individual requests', 10, 0, 'task name', 'comments', '2020-01-01 00:00:00', '2022-07-20 00:00:00', 'r&d manager', 'COC 1.1', 3),
    ('name3', 2, 'target', 'cost center', 'project #', 2, 'drawing including revision', 'individual requests', 13, 0, 'task name', 'comments', '2020-01-01 00:00:00', '2022-07-20 00:00:00', 'r&d manager', 'COC 1.1', 4),
    ('name4', 1, 'target', 'cost center', 'project #', 2, 'drawing including revision', 'individual requests', 12, 0, 'task name', 'comments', '2020-01-01 00:00:00', '2022-07-20 00:00:00', 'r&d manager', 'COC 1.1', 5);
