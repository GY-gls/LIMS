CREATE DATABASE IF NOT EXISTS lims;
USE lims;

CREATE TABLE ticket (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        initiator VARCHAR(100) NOT NULL,
                        receiver VARCHAR(100) NOT NULL,
                        auditor VARCHAR(100) NOT NULL,
                        bench_id INT,
                        request_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        start_date TIMESTAMP,
                        end_date TIMESTAMP,
                        state VARCHAR(20),
                        CONSTRAINT bench_id_foreign_key FOREIGN KEY (bench_id) REFERENCES bench (id)
);

INSERT INTO ticket (initiator, receiver, auditor, bench_id, request_date, start_date, end_date, state) VALUES
    ('发起人A', '对接人A', '审核人A', 2, '2025-01-21 00:00:00', '2025-02-01 00:00:00', '2025-03-01 00:00:00', '发起'),
    ('发起人B', '对接人A', '审核人B', 3, '2025-01-21 00:00:00', '2025-01-23 00:00:00', '2025-01-24 00:00:00', '完成'),
    ('发起人C', '对接人B', '审核人B', 4, '2025-01-21 00:00:00', '2025-01-21 00:00:00', '2025-01-22 00:00:00', '审核至工程师端'),
    ('发起人D', '对接人D', '审核人C', 5, '2025-01-21 00:00:00', '2025-01-21 00:00:00', '2025-02-21 00:00:00', '取消');