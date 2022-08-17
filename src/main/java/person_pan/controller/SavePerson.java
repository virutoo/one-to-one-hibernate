package person_pan.controller;

import person_pan.dao.PersonDao;
import person_pan.dto.Pan;
import person_pan.dto.Person;

public class SavePerson {
	
	public static void main(String[] args) {
		Person person = new Person();
		person.setId(1);
		person.setName("tom");
		person.setAge(20);
		
		Pan pan = new Pan();
		pan.setPanNumber("abcd1234");
		pan.setFatherName("cat");
		
		person.setPan(pan);
		
		PersonDao dao = new PersonDao();
		dao.savePerson(person);
		System.out.println("data saved");
	}

}
