package company_gst.controller;

import company_gst.dao.Dao;

public class GetGstById {
	
	public static void main(String[] args) {
		int id = 1;
		Dao dao = new Dao();
		System.out.println(dao.getGstById(id)); 
	}
}
