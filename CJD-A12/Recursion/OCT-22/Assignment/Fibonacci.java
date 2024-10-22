import java.util.Scanner;
class Fibonacci{
	public static long fib(long n, long a, long b, long c){
		if(n!=0){
			System.out.println(a);
			return fib(--n,a=b,b=c,c=a+b);
		}
		return 0;
	}
	public static void fibonacci(long n){
		fib(n,0,1,1);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of iteration of fibonacci : ");
		long n = sc.nextLong();
		fibonacci(n);
	}
}


/** From Gimini
class Fib{
	public static int fib(int n){
		if(n<=0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fib(n-1) + fib(n-2);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of fibonacci terms : ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			System.out.println(fib(i));
		}
	}
}
*/