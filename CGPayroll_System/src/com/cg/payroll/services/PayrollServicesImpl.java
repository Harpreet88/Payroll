package com.cg.payroll.services;

import java.util.List;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.daoservices.AssociateDAOImpl;
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;

public class PayrollServicesImpl implements PayrollServices{

	private AssociateDAO associateDao=new AssociateDAOImpl();



	@Override
	public int acceptAssociateDetails(String firstName, String lastName, String department, String designaton,
			String pancard, String emailId, int yearlyInvestmentUnder80C, int basicSalary,int epf, int companyPf,
			int accountNumber, String bankName, String ifscCode) {
		//BankDetails bankDetails = new  BankDetails(.....);
		//Salary salary = new Salary(....);
		//Associate associate=new Associate(....,salary,bankDetails);

		/*/Associate associate=new Associate(.....,  new Salary(....)  , new  BankDetails(.....));

		//associate = associateDao.save(associate);

		//return associate.getAssociateId();*/

		/*
		 * return  associateDao.save(new Associate(.....,  new Salary(....)  , new  BankDetails(.....)).getAssociateId);
		 */
		Associate associate= new Associate(yearlyInvestmentUnder80C, firstName, lastName, department, designaton, pancard, emailId,new Salary(basicSalary, epf, companyPf),new BankDetails(accountNumber, bankName, ifscCode));
		System.out.println(new Salary(basicSalary, epf, companyPf));
		associate = associateDao.save(associate);
		return associate.getAssociateId();

	}

	@Override
	public int calculateNetSalary(int associateId) throws AssociateDetailNotFoundException {
		Associate associate=associateDao.findOne(associateId);
		int netSalary=0;
		if(associate==null)
		{
			throw new AssociateDetailNotFoundException("Not found"+associateId);
		}
		else
		{
			System.out.println(associate.getSalary());
			associate.getSalary().setHra((int)(associate.getSalary().getBasicSalary()*0.3));
			associate.getSalary().setConveyenceAllowance((int)(associate.getSalary().getBasicSalary()*0.3));
			associate.getSalary().setPersonalAllowance((int)(associate.getSalary().getBasicSalary()*0.2));
			associate.getSalary().setOtherAllowance((int)(associate.getSalary().getBasicSalary()*0.25));

			int monthlyGrossSalary= associate.getSalary().getBasicSalary()+associate.getSalary().getCompanyPf()+associate.getSalary().getHra()+
					associate.getSalary().otherAllowance+associate.getSalary().personalAllowance+
					associate.getSalary().getConveyenceAllowance()+associate.getSalary().getEpf();

			int annualGrossSalary=12* monthlyGrossSalary;

			int investment=associate.getYearlyInvestmentUnder80C()+associate.getSalary().getEpf()+associate.getSalary().getCompanyPf();
			if(investment>=150000)
				investment=150000;

			if(annualGrossSalary<=250000)
			{
				netSalary=(int)(annualGrossSalary-associate.getSalary().getEpf()-associate.getSalary().getCompanyPf());
			}
			else if(monthlyGrossSalary>250000 && annualGrossSalary<=500000)
			{
				netSalary=(int)(annualGrossSalary-((annualGrossSalary-investment)*0.1)-associate.getSalary().getEpf()-associate.getSalary().getCompanyPf());
			}
			else if(annualGrossSalary>500000 && annualGrossSalary<=1000000)
			{
				int tax2 = (int)((annualGrossSalary-500000*0.2));
				int tax1=(int)((25000-investment)*0.1);
				netSalary=annualGrossSalary-tax1-tax2-associate.getSalary().getEpf()-associate.getSalary().getCompanyPf();
			}
			else if(annualGrossSalary>1000000)
			{
				int tax3=(int)((annualGrossSalary-1000000)*0.3);
				int tax2=10000;
				int tax1=(int)((25000-investment)*0.1);
				netSalary=annualGrossSalary-tax1-tax2-tax3-associate.getSalary().getEpf()-associate.getSalary().getCompanyPf();
			}
		}
			return netSalary;
	}


	@Override
	public Associate getAssociateDetails(int associateId) throws AssociateDetailNotFoundException {
		Associate associate = associateDao.findOne(associateId);
		if(associate==null)
			throw new AssociateDetailNotFoundException("Associate Details not found for Id " +associateId);
		return associate;
	}

	@Override
	public List<Associate> getAllAssociatesDetails() {
		return associateDao.findAll();
	}

}
