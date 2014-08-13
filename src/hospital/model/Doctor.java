package hospital.model;

import java.util.Date;

public class Doctor extends Person {

	private String department;
	private String employeeID;

	public Doctor(String name, String id, String gender, Date birthday,
			String phone, String address, String department, String employeeID)
			throws Exception {
		super(name, id, gender, birthday, phone, address);

		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getSepcialty() {
		return department;
	}

	public void setSpecialty(String department) {
		this.department = department;
	}

}
