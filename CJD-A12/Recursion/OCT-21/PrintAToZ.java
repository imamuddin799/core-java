class PrintAToZ{
	public static void printAToZ(char a){
		if(a<='Z'){
			System.out.println(a++);
			printAToZ(a);
		}
	}
	public static void main(String[] args){
		printAToZ('A');
	}
}