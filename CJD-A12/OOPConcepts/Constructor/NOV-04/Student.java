class Student{
	String name;
	int id;
	double tenth;
	double twelth;
	double degree;
	Student(String name, int id, double tenth){
		this.name = name;
		this.id = id;
		this.tenth = tenth;
	}
	Student(String name, int id, double tenth, double twelth){
		this.name = name;
		this.id = id;
		this.tenth = tenth;
		this.twelth = twelth;
	}
	Student(String name, int id, double tenth, double twelth, double degree){
		this.name = name;
		this.id = id;
		this.tenth = tenth;
		this.twelth = twelth;
		this.degree = degree;
	}
	public void details(){
		System.out.println("Name : "+ name);
		System.out.println("ID : "+ id);
		System.out.println("Tenth : "+ tenth);
		if(twelth != 0.0){
			System.out.println("Twelth : "+ twelth);
		}
		if(degree == 0.0){
			System.out.println("Degree : "+ degree);
		}
	}
}