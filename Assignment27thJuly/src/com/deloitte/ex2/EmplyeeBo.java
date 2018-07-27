package com.deloitte.ex2;



public class EmplyeeBo {

	public EmplyeeBo() {
	}

	void CalincomeTax(EmplyeeVo e) {
		double annualincome = e.getAnnualincome();
		double tax = 0;
		if (annualincome > 1000000) {
			tax = 0.4 * annualincome;
		} else if (annualincome > 500000) {
			tax = 0.3 * annualincome;
		} else {
			tax = 0.2 * annualincome;
		}
		e.setIncometa(tax);

	}

}
