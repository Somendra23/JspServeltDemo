package net.sam.context;

public class AddressBean {

	String addressLine1;
	String state;
	String zip;

	public AddressBean() {
	}

	@Override
	public String toString() {
		return "AddressBean [addressLine1=" + addressLine1 + ", state=" + state + ", zip=" + zip + "]";
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
