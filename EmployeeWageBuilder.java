package com.bridgelab.empwages;

public class EmployeeWageBuilder {
	public static final int IS_FULL_TIME=1;
	public int EMP_RATE_PER_HOUR;

	public static void main(String[] args) {
		System.out.println("welcome to employee wage programms");
		EmployeeWageBuilder employeeCheckObject=new EmployeeWageBuilder();
		employeeCheckObject.computeEmpWage(20);
	}
	
	public void computeEmpWage(int empRatePerHour) {
		this.EMP_RATE_PER_HOUR=empRatePerHour;
		int empHrs=0;
		int empWage=0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck==IS_FULL_TIME) {
			empHrs = 8;
		}else {
			System.out.println("Employee is Absent");
		}
		 empWage = empHrs * empRatePerHour;
	     System.out.println("Emp Wage: " + empWage);
	}
}
