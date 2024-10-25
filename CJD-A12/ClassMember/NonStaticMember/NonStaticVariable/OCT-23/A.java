class A{
	int a;
	int b = 30;
	public static void main(String[] args){
		A ob = new A();
		System.out.println(ob.a);
		System.out.println(ob.b);
		ob.a = 200;
		System.out.println(ob.a);
	}
}