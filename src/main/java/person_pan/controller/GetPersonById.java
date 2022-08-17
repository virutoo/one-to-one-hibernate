package person_pan.controller;

import person_pan.dao.PersonDao;
import person_pan.dto.Person;

public class GetPersonById {
	
	public static void main(String[] args) {
		int id = 1;
		
		PersonDao dao = new PersonDao();
		Person person = dao.getPersonById(id);
		if(person != null) {
			System.out.println(person);
		}
		else {
			System.out.println("data not found");
		}
	}

}
