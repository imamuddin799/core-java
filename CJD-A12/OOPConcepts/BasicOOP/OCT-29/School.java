class School{
	public static void main(String[] args){
		Students s1 = new Students();
		s1.name = "Dingri";
		s1.id = 420;
		s1.marks = 36;
		s1.branch = "Gutta";
		s1.gender = "female";
		s1.age = 16;
		s1.details();
		s1.attendingClass();
		s1.studying();
		s1.goingHome();
		s1.sleeping();
		System.out.println("\n**********************************\n");
		Students s2 = new Students();
		s2.name = "Dumbri";
		s2.id = 220;
		s2.marks = 47;
		s2.branch = "Hills";
		s2.gender = "male";
		s2.age = 17;
		s2.details();
		s2.attendingClass();
		s2.studying();
		s2.goingHome();
		s2.sleeping();
	}
}