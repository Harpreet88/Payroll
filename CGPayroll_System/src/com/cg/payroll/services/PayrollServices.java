package com.cg.payroll.services;

import java.util.List;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.daoservices.AssociateDAOImpl;
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;

public interface PayrollServices {
	
	
	int acceptAssociateDetails(String firstName,String lastName,String department,String designaton,String pancard,
			String emailId,int yearlyInvestmentUnder80C, int basicSalary,int epf, int companyPf, int accountNumber,
			String bankName,String ifscCode);
	
	int calculateNetSalary(int assiciateId)throws AssociateDetailNotFoundException;
	
	Associate getAssociateDetails(int associateId)throws AssociateDetailNotFoundException;
	
	List<Associate> getAllAssociatesDetails();
	
}
