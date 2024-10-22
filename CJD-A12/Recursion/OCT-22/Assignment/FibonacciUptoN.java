import java.util.Scanner;
class FibonacciUptoN{
	public static long fib(long n, long a, long b, long c){
		if(a<=n){
			System.out.println(a);
			return fib(n,a=b,b=c,c=a+b);
		}
		return 0;
	}
	public static void fibonacci(long n){
		fib(n,0,1,1);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number upto you want fibonacci series : ");
		long n = sc.nextLong();
		fibonacci(n);
	}
}