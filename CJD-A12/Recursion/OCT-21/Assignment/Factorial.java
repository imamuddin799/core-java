import java.util.Scanner;
class  Factorial{
	public static long factorial(long n){
		if(n>=1){
			return n * factorial(n - 1);
		}
		return 1;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find its factorial : ");
		long n = sc.nextLong();
		System.out.println("The Factorial for the given number "+ n +" is : "+ factorial(n));
	}
}