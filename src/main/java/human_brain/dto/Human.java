package human_brain.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Human {

	@Id
	private int id;
	private String name;
	@OneToOne
	private Brain brain;

	public Brain getBrain() {
		return brain;
	}

	public void setBrain(Brain brain) {
		this.brain = brain;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Human [id=" + id + ", name=" + name + ", brain=" + brain + "]";
	};

}