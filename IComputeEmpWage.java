package com.bridgelab.empwages;

public interface IComputeEmpWage {
	public void  addCompanyEmpWage(String company, int empRatePerHour, int numberOfWorkingDays, int maximumHrsInMonth);
	public void computeEmpWage();
	public int getTotalWage(String company);
}
