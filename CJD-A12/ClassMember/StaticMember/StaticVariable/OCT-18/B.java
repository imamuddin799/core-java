class B{
	static boolean b;
	public static void main(String[] args){
		System.out.println(b);//false
		System.out.println(a);//35
		int a=10;
		System.out.println(a);//10
		boolean b=true;
		System.out.println(b);//true
		System.out.println(B.a);//35
		System.out.println(B.b);//false
	}
	static int a=35;
}