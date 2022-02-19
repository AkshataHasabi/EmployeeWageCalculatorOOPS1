package com.bridgelab.empwages;

import java.util.ArrayList;
import java.util.*;

public class EmployeeWageBuilder implements IComputeEmpWage {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	
	private int numOfCompany=0;
	private ArrayList<CompanyEmpWage> arrayList;
	private Map<String, CompanyEmpWage> hashMap;
	
	public EmployeeWageBuilder() {
		arrayList = new ArrayList<>();
		hashMap = new HashMap<>();
	}
	
	public void  addCompanyEmpWage(String company, int empRatePerHour, int numberOfWorkingDays, int maximumHrsInMonth) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numberOfWorkingDays, maximumHrsInMonth);
		arrayList.add(companyEmpWage);
		hashMap.put(company, companyEmpWage);
		numOfCompany++;
	}
	
	public void computeEmpWage() {
		for (int i=0; i<numOfCompany; i++) {
			CompanyEmpWage companyEmpWage= arrayList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(arrayList.get(i)));
			System.out.println(companyEmpWage);
		}
	}

	public  int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHrs=0;
		int totalWorkingDays=0;
	    int totalEmpHrs=0;
	
		while (totalEmpHrs <= companyEmpWage.getMaximumHrsInMonth()  && totalWorkingDays < companyEmpWage.getNumberOfWorkingDays()) {
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
		return totalEmpHrs * companyEmpWage.getEmpRatePerHour();
	}
	
	public static void main(String[] args) {
		System.out.println("welcome to employee wage programms");
		EmployeeWageBuilder employeeWageBuilder =new EmployeeWageBuilder();
		employeeWageBuilder.addCompanyEmpWage("DMart", 20, 2, 10); 
		employeeWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
		employeeWageBuilder.computeEmpWage();
	}
}
