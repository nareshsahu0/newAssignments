package day24Programming;

public class Contact {
	 private String firstName;
	    private String lastName;
	    private String phoneNumber;
	    private String email;
	    private String city;
	    private String zip;
	    private String state;

	    public Contact(String firstName, String lastName, String phoneNumber, String email, String city, String zip,
				String state) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.city = city;
			this.zip = zip;
			this.state = state;
		}

		public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public String getZip() {
	        return zip;
	    }

	    public void setZip(String zip) {
	        this.zip = zip;
	    }

	    public String getState() {
	        return state;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

	    @Override
	    public String toString() {
	        return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
	                + ", email=" + email + ", city=" + city + ", zip=" + zip + ", state=" + state + "]";
	    }

		public static void add(Contact contact1) {
			// TODO Auto-generated method stub
			
		}


}
