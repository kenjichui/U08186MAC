package hospital.model;

import java.util.Calendar;
import java.util.Date;

public class Person {

	private String name;
	private String id;

	private String gender;
	private Date birthday;

	private String address;
	private String phone;

	public Person(String name, String id, String gender, Date birthday,
			String address, String phone) throws Exception {

		this.name = name;
		this.id = id;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getGender() {
		return gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void setBirthdayDate(int birthYear, int birthMonth, int birthDay) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(birthYear, birthMonth, birthDay);
		this.birthday = calendar.getTime();
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", gender=" + gender
				+ ", birthday=" + birthday + ", address=" + address
				+ ", phone=" + phone + "]";
	}

}
