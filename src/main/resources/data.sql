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


INSERT INTO Attendance (attendance_Id, emp_Id, attendance_Date, check_In_Time, check_Out_Time, status) VALUES
(101,'EMP002', '2025-04-27', '2025-04-27 09:20:00', '2025-04-27 18:10:00', 'Present'),
(102,'EMP001', '2025-04-29', '2025-04-29 08:55:00', null, 'Pending Checkout'),
(103,'EMP001', '2025-04-26', null, null, 'Absent'),
(104,'EMP002', '2025-04-29', null, null, 'Absent'),
(105,'EMP002', '2025-04-28', '2025-04-28 09:30:00', null, 'Pending Checkout'),
(106,'EMP001', '2025-04-27', '2025-04-27 09:10:00', '2025-04-27 17:45:00', 'Present'),
(107,'EMP001', '2025-04-28', '2025-04-28 08:50:00', '2025-04-28 17:35:00', 'Present'),
(108,'EMP002', '2025-04-26', '2025-04-26 10:00:00', '2025-04-26 17:50:00', 'Present');
