package com.bridgelab.empwages;

public class CompanyEmpWage {
	private final String company; 
	private final int empRatePerHour;
	private final int numberOfWorkingDays;
	private final int maximumHrsInMonth;
	private int totalEmpWage;
	
	public CompanyEmpWage(String company, int empRatePerHour, int numberOfWorkingDays, int maximumHrsInMonth) {
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numberOfWorkingDays=numberOfWorkingDays;
		this.maximumHrsInMonth=maximumHrsInMonth;
	}
	
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage=totalEmpWage;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for a company: "+company +" "+ "is: "  + totalEmpWage;
	}

	public int getEmpRatePerHour() {
		return empRatePerHour;
	}

	public int getNumberOfWorkingDays() {
		return numberOfWorkingDays;
	}

	public int getMaximumHrsInMonth() {
		return maximumHrsInMonth;
	}
}
