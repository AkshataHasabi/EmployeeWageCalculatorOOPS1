package com.bridgelab.empwages;

public class EmployeeWageBuilder {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public int EMP_RATE_PER_HOUR;
	public int NUM_OF_WORKING_DAYS; 

	public static void main(String[] args) {
		System.out.println("welcome to employee wage programms");
		EmployeeWageBuilder employeeCheckObject=new EmployeeWageBuilder();
		employeeCheckObject.computeEmpWage(20, 20);
	}
	
	public void computeEmpWage(int empRatePerHour, int numberOfWorkingDays) {
		this.EMP_RATE_PER_HOUR=empRatePerHour;
		this.NUM_OF_WORKING_DAYS=numberOfWorkingDays;
		int empHrs=0;
		int empWage=0;
		int totalEmpWage=0;
		for (int day = 0; day < numberOfWorkingDays; day++) {
			int empCheck =(int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
					empHrs = 4;
					break;
			case IS_FULL_TIME:
        			empHrs = 8;
        			break;
			default:
					empHrs = 0;
			}
			empWage = empHrs * empRatePerHour;
			totalEmpWage += empWage;
			System.out.println("Emp Wage: " + empWage);   	
		}
		System.out.println("Total Emp Wage: " + totalEmpWage);
	}
}
