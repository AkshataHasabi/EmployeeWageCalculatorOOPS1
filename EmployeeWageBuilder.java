package com.bridgelab.empwages;

public class EmployeeWageBuilder {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	
	private final String company; 
	private final int empRatePerHour;
	private final int numberOfWorkingDays;
	private final int maximumHrsInMonth;
	private int totalEmpWage;
	
	public EmployeeWageBuilder(String company, int empRatePerHour, int numberOfWorkingDays, int maximumHrsInMonth) {
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numberOfWorkingDays=numberOfWorkingDays;
		this.maximumHrsInMonth=maximumHrsInMonth;
	}

	public static void main(String[] args) {
		System.out.println("welcome to employee wage programms");
		EmployeeWageBuilder dMart=new EmployeeWageBuilder("DMart", 20, 2, 10);
		EmployeeWageBuilder reliance=new EmployeeWageBuilder("Reliance", 20, 2, 10);
		dMart.computeEmpWage();
		System.out.println(dMart);
		reliance.computeEmpWage();
		System.out.println(reliance);
	}
	
	public void computeEmpWage() {
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
		totalEmpWage = totalEmpHrs * empRatePerHour;
	}
	@Override
	public String toString() {
		return "Total Emp Wage for a company: "+company +" "+ "is: "  + totalEmpWage;
	}
}
