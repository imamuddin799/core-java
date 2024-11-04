class JobMela{
	/**
	String name;
	int id;
	double tenth;
	double twelth;
	double degree;
	*/
	public static void main(String[] args){
		Student s1 = new Student("Imam", 1, 64.0);
		s1.details();
		
		Student s2 = new Student("Uddin", 2, 64.0, 55.0);
		s2.details();
		
		Student s3 = new Student("Ansari", 3, 64.0, 55.0, 55.7);
		s3.details();
	}
}