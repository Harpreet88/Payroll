package com.cg.payroll.beans;

public class Salary {
	private int basicSalary, hra, conveyenceAllowance;
	public int otherAllowance, personalAllowance, monthlyTax, epf;
	private int companyPf, grossSalary, netSalary;
	
	public Salary(int basicSalary, int epf, int companyPf) {
		super();
		this.basicSalary = basicSalary;
		this.epf = epf;
		this.companyPf = companyPf;
	}

	
	public Salary(int basicSalary, int hra, int conveyenceAllowance, int otherAllowance, int personalAllowance,
			int monthlyTax, int epf, int companyPf, int grossSalary, int netSalary) {
		super();
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.conveyenceAllowance = conveyenceAllowance;
		this.otherAllowance = otherAllowance;
		this.personalAllowance = personalAllowance;
		this.monthlyTax = monthlyTax;
		this.epf = epf;
		this.companyPf = companyPf;
		this.grossSalary = grossSalary;
		this.netSalary = netSalary;
	}

	
	public Salary() {	
		
	}
	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public int getConveyenceAllowance() {
		return conveyenceAllowance;
	}

	public void setConveyenceAllowance(int conveyenceAllowance) {
		this.conveyenceAllowance = conveyenceAllowance;
	}
	public int getOtherAllowance() {
		return otherAllowance;
	}

	public void setOtherAllowance(int otherAllowance) {
		this.otherAllowance = otherAllowance;
	}

	public int getPersonalAllowance() {
		return personalAllowance;
	}

	public void setPersonalAllowance(int personalAllowance) {
		this.personalAllowance = personalAllowance;
	}

	public int getMonthlyTax() {
		return monthlyTax;
	}

	public void setMonthlyTax(int monthlyTax) {
		this.monthlyTax = monthlyTax;
	}

	public int getEpf() {
		return epf;
	}

	public void setEpf(int epf) {
		this.epf = epf;
	}

	public int getCompanyPf() {
		return companyPf;
	}

	public void setCompanyPf(int companyPf) {
		this.companyPf = companyPf;
	}

	public int getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(int grossSalary) {
		this.grossSalary = grossSalary;
	}

	public int getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(int netSalary) {
		this.netSalary = netSalary;
	}


	@Override
	public String toString() {
		return "Salary [basicSalary=" + basicSalary + ", hra=" + hra + ", conveyenceAllowance=" + conveyenceAllowance
				+ ", otherAllowance=" + otherAllowance + ", personalAllowance=" + personalAllowance + ", monthlyTax="
				+ monthlyTax + ", epf=" + epf + ", companyPf=" + companyPf + ", grossSalary=" + grossSalary
				+ ", netSalary=" + netSalary + ", getBasicSalary()=" + getBasicSalary() + ", getHra()=" + getHra()
				+ ", getConveyenceAllowance()=" + getConveyenceAllowance() + ", getOtherAllowance()="
				+ getOtherAllowance() + ", getPersonalAllowance()=" + getPersonalAllowance() + ", getMonthlyTax()="
				+ getMonthlyTax() + ", getEpf()=" + getEpf() + ", getCompanyPf()=" + getCompanyPf()
				+ ", getGrossSalary()=" + getGrossSalary() + ", getNetSalary()=" + getNetSalary() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}
