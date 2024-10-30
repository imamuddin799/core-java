class Student{	//Blue Print / Business Logic Class
	
	//Declaring all the veriables
	String name;
	int id;
	int english;
	int maths;
	int science;
	int socialScience;
	int totalMarks;
	
	//Declaring details method to display all the details
	public void details(){
		System.out.println("Name : "+ name);
		System.out.println("Marks in English : "+ english);
		System.out.println("Marks in Maths : "+ maths);
		System.out.println("Marks in Science : "+ science);
		System.out.println("Marks in Social Science : "+ socialScience);
		System.out.println("Total Marks : "+ totalMarks);
	}
	
	//Declaring totalMarks method to find sum of all the subject marks
	public int totalMarks(){
		return english+maths+science+socialScience;
	}
}