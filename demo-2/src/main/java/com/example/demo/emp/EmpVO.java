package com.example.demo.emp;

import java.util.Date;

import lombok.Data;

@Data
public class EmpVO {
	String employeeId;
	String firstName;
	String lastName;
	int salary;
	Date hireDate; // 날짜 포맷팅할게 아니면 String이 편함
	String departmentId;
}
