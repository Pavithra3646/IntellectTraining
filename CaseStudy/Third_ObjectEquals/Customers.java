package case_Studys;

import java.util.Objects;

public class Customers {
	private String name;
	private Address address;

	public Customers() {
	}

	public Customers(String name, Address address) {
		this.name = name;
		this.address = address;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		Customers other = (Customers) obj;
		return Objects.equals(name, other.name) && this.address.equals(other.getAddress());
	}

	@Override
	public String toString() {
		return "Name:" + name + "\nAddress:" + address.getStreet() + "," + address.getCity() + "-"
				+ address.getPincode();
	}


}
