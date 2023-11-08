
public class User {
	
private String name;
private String address;
private String ccNumber;
private String address1;
private String address2;

public User(String name, String address, String ccNumber, String address1, String address2) {

	this.name = name;
	this.address = address;
	this.ccNumber = ccNumber;
	this.address1 = address1;
	this.address2 = address2;
}
public User(String name, String address) {

	this.name = name;
	this.address = address;
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

public String getCcNumber() {
	return ccNumber;
}

public void setCcNumber(String ccNumber) {
	this.ccNumber = ccNumber;
}

public String getAddress1() {
	return address1;
}

public void setAddress1(String address1) {
	this.address1 = address1;
}

public String getAddress2() {
	return address2;
}

public void setAddress2(String address2) {
	this.address2 = address2;
}

}
