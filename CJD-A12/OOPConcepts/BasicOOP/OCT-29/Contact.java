class Contact{
	String name;
	long number;
	String email;
	String address;
	public void save(){
		System.out.println("Contact Saved");
		System.out.println("Name : "+ name +"\nNumber : "+ number +"\nEmail : "+ email +"\nAddress : "+ address);
	}
}