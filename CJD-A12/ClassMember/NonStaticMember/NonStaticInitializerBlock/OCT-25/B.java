class B{
	int a = 10;
	int b;
	{
		System.out.println("IIB1 Starts");
		System.out.println(a);
		System.out.println(b);
		a = 100;
		b = 20;
		System.out.println("IIB1 Ends");
	}
	public static void main(String[] args){
		System.out.println("Main Starts");
		B ob = new B();
		B ob1 = new B();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		ob.a=500;
		System.out.println(ob1.a);
		System.out.println(ob.a);
		System.out.println(new B().a);
		System.out.println("Main Ends");
	}
	{
		System.out.println("IIB2 Starts");
		System.out.println(a);
		System.out.println(b);
		a = b;
		System.out.println("IIB2 Ends");
	}
}