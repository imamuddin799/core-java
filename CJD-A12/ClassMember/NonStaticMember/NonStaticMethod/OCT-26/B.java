class B{
	int a = 10;
	static int b =20;
	static{
		System.out.println("SIB Starts");
		System.out.println(b);
		B ob = new B();
		System.out.println(ob.a);
		System.out.println("SIB Ends");
	}
	{
		System.out.println("IIB Starts");
		System.out.println(a);
		System.out.println(b);
		a = 150;
		b =250;
		System.out.println("IIB Ends");
	}
	public void m1(){
		System.out.println("M1 Starts");
		System.out.println(a);
		System.out.println(b);
		int a = 100;
		int b = 200;
		System.out.println(this.a);
		System.out.println(this.b);
		B ob = new B();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println("M1 Ends");
	}
	public static void main(String[] args){
		System.out.println("Main Starts");
		B ob = new B();
		System.out.println(ob.a);
		System.out.println(ob.b);
		ob.a = 500;
		ob.b = 1000;
		ob.m1();
		System.out.println("Main Ends");
	}
}