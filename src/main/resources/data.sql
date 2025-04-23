INSERT INTO Employees (emp_Id, emp_Name) VALUES
('EMP001', 'John Doe'),
('EMP002', 'Jane Smith');

INSERT INTO leave_Types (leave_Type, leave_Disc) VALUES
('CASUAL', 'Casual Leave'),
('SICK', 'Sick Leave'),
('EARNED', 'Earned Leave');

INSERT INTO leave_Count (leave_Id,employee_Id, leave_Type, total_Leave) VALUES
(1,'EMP001', 'CASUAL', 12),
(2,'EMP001', 'SICK', 8),
(3,'EMP001', 'EARNED', 15),
(4,'EMP002', 'CASUAL', 10),
(5,'EMP002', 'SICK', 5),
(6,'EMP002', 'EARNED', 20);
