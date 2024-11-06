class Student{
	String name;
	int id;
	private int marks;
	public int getMarks(){
		return marks;
	}
	public void setMarks(int marks){
		if(marks>=0 && marks <=100)
			this.marks = marks;
		else
			System.out.println("Invalid Marks.!!!");
	}
	public void details(){
		System.out.println("Name : "+ name);
		System.out.println("ID : "+ id);
		System.out.println("Marks : "+ marks);
	}
}