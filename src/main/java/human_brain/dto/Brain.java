package human_brain.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Brain {

	@Id
	private int id;

	@Override
	public String toString() {
		return "Brain [id=" + id + ", size=" + size + "]";
	}

	private int size;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
