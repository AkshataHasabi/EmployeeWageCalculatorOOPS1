package com.bridgelab.empwages;

public class EmployeeWageBuilder {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public int EMP_RATE_PER_HOUR;
	public int NUM_OF_WORKING_DAYS;
	public int MAX_HRS_IN_MONTH;

	public static void main(String[] args) {
		System.out.println("welcome to employee wage programms");
		EmployeeWageBuilder employeeCheckObject=new EmployeeWageBuilder();
		employeeCheckObject.computeEmpWage(20, 20, 100);
	}
	
	public void computeEmpWage(int empRatePerHour, int numberOfWorkingDays, int maximumHrsInMonth) {
		this.EMP_RATE_PER_HOUR=empRatePerHour;
		this.NUM_OF_WORKING_DAYS=numberOfWorkingDays;
		this.MAX_HRS_IN_MONTH=maximumHrsInMonth;
		int empHrs=0;
		int totalWorkingDays=0;
	    int totalEmpHrs=0;
	
		while (totalEmpHrs <= maximumHrsInMonth  && totalWorkingDays < numberOfWorkingDays) {
			totalWorkingDays++;
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
			totalEmpHrs += empHrs;
			System.out.println("Day: " + totalWorkingDays + "Emp Hr: " + empHrs);   	
		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage: " + totalEmpWage);
	}
}
