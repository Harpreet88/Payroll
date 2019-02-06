package com.cg.payroll.client;

import java.util.Scanner;

import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

public class MainClass {

	public static void main(String[] args)
	{
		PayrollServices services=new PayrollServicesImpl();
		

		int associateId=services.acceptAssociateDetails("Kirito", "bbbbb", "testing", "tester", "56433", "abc@gmail.com", 1000, 25000,200, 1000, 12345, "citi bank", "245445");


		System.out.println("Associate id : "+ associateId);
		//System.out.println(services.getAssociateDetails(00));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		int netSalary = services.calculateNetSalary(id);
		System.out.println(netSalary);


	}

}
