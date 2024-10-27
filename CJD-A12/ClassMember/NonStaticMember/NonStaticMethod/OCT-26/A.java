class A{
	int a = 10;
	static int b =20;
	public void m1(){
		System.out.println("M1 Starts");
		System.out.println(a);
		System.out.println(b);
		int a = 100;
		int b = 200;
		System.out.println(this.a);
		System.out.println(this.b);
		this.a = 150;
		this.b =250;
		System.out.println("M1 Ends");
	}
	public static void main(String[] args){
		System.out.println("Main Starts");
		A ob = new A();
		System.out.println(ob.a);
		System.out.println(ob.b);
		ob.m1();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println("Main Ends");
	}
}