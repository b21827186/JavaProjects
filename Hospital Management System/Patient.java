
public class Patient {
	private String id; 
	private String surname;
	private String name;
	private String address;
	private String phone_number;
	
	public Patient(String id, String name, String surname,String phone_number , String address) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.address = address;
		this.phone_number = phone_number;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
}
