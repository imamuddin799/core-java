import java.util.Scanner;
class PrintMToN{
	public static void printMToN(int m, int n){
		if(m==n){
			System.out.println(m);
		}
		else if(m<n){
			System.out.println(m);
			printMToN(m+1,n);
		}
		else{
			System.out.println(m);
			printMToN(m-1,n);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range from M to N");
		System.out.print("Enter Value of M : ");
		int m = sc.nextInt();
		System.out.print("Enter Value of N : ");
		int n = sc.nextInt();
		printMToN(m,n);
	}
}