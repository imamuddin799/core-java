class Save{
	public static void main(String[] args){
		Contact c = new Contact();
		c.name = "Raj";
		c.number = 9876543210l;
		c.email = "Raj@gmail.com";
		c.address = "Gutta";
		c.save();
		System.out.println("\n**********************************\n");
		Contact c1 = new Contact();
		c1.name = "Rani";
		c1.number = 7896543210l;
		c1.email = "Rani@gmail.com";
		c1.address = "Hills";
		c1.save();
	}
}