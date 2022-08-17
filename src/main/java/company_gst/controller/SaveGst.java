package company_gst.controller;

import company_gst.dao.Dao;
import company_gst.dto.Company;
import company_gst.dto.Gst;

public class SaveGst {
	
	public static void main(String[] args) {
		Gst gst = new Gst();
		Company company = new Company();
		company.setId(1);
		company.setName("company1");
		company.setPhone(1234);
		
		gst.setCompany(company);
		gst.setGstNumber("123sd");
		gst.setId(1);
		gst.setStatus("ok");
		
		Dao dao = new Dao();
		dao.saveGst(gst);
		System.out.println("data saved");
	}

}
