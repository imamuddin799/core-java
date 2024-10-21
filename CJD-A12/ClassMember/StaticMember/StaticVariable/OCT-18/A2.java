class A2{
	static int a=10;
	static double b;
	public static void main(String[] args){
		System.out.println(a);//10
		System.out.println(b);//0.0
		int a=50;
		System.out.println(a);//50
		System.out.println(A2.a);//10
		A2.b=20;
		System.out.println(b);//20
	}
}