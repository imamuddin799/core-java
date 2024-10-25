class A{
	int a = 10;
	{
		System.out.println("IIB Starts");
		System.out.println(a);
		System.out.println("IIB Ends");
	}
	public static void main(String[] args){
		System.out.println("Main Starts");
		A ob = new A();
		System.out.println(ob.a);
		System.out.println("Main Ends");
	}
}