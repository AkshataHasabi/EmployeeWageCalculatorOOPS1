package com.bridgelab.empwages;

public class EmployeeWageBuilder {
	public static final int IS_FULL_TIME=1;

	public static void main(String[] args) {
		System.out.println("welcome to employee wage programms");
		EmployeeWageBuilder employeeCheckObject=new EmployeeWageBuilder();
		employeeCheckObject.computeEmpWage();
	}
	
	public void computeEmpWage() {
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck==IS_FULL_TIME) { 
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is Absent");
		}
	}
}
