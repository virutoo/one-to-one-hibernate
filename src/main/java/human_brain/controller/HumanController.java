package human_brain.controller;

import human_brain.dao.HumanDao;
import human_brain.dto.Brain;
import human_brain.dto.Human;

public class HumanController {
	
	public static void main(String[] args) {
		Human human = new Human();
		Brain brain = new Brain();
		
		brain.setId(1);
		brain.setSize(2);
		
		human.setBrain(brain);
		human.setId(1);
		human.setName("einstein");
		
		HumanDao dao = new HumanDao();
		dao.saveHuman(human);
		System.out.println("data saved");
	}

}
