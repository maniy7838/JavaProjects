package com.deloitte.payroll.main;

import com.deloitte.payroll.Accounts;
import com.deloitte.payroll.Employee;
import com.deloitte.payroll.HR;

public class MainClass {

	public static void main(String[] args) {
		
		Employee employee ;
		Accounts accounts = new Accounts();
		HR hr = new HR();
		
		employee = hr.recruit('I');
		accounts.processSalary(employee);
		
		employee = hr.recruit('P');
		accounts.processSalary(employee);
		
		employee = hr.recruit('C');
		accounts.processSalary(employee);
		


		
	}
}
