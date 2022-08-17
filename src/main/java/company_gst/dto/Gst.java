package company_gst.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Gst {

	@Override
	public String toString() {
		return "Gst [id=" + id + ", gstNumber=" + gstNumber + ", status=" + status + ", company=" + company + "]";
	}

	@Id
	private int id;
	private String gstNumber;
	private String status;

	@OneToOne
	private Company company;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
