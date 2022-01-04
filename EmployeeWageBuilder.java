package com.bridgelab.empwages;

public class EmployeeWageBuilder {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

	public static void main(String[] args) {
		System.out.println("welcome to employee wage programms");
		EmployeeWageBuilder employeeCheckObject=new EmployeeWageBuilder();
		employeeCheckObject.computeEmpWage("DMart", 20, 20, 100);
		employeeCheckObject.computeEmpWage("Reliance", 10, 4, 100);
	}
	
	public void computeEmpWage(String company, int empRatePerHour, int numberOfWorkingDays, int maximumHrsInMonth) {
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
		System.out.println("Total Emp Wage for a company: "+company +" "+ "is: "  + totalEmpWage);
	}
}
