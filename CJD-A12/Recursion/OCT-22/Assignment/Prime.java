import java.util.Scanner;
class Prime{
	public static int prime(int n, int i, int c){
		if(i<=n/2){
			if(n%i==0){
				c++;
				return prime(n, ++i, c);
			}
			else{
				return prime(n, ++i, c);
			}
		}
		else{
			return c;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check given number is a Prime number or not : ");
		int n = sc.nextInt();
		int c = 0;
		c = prime(n, 1, 0);
		if(c==1){
			System.out.println("Given Number "+ n +" is a Prime number.");
		}
		else{
			System.out.println("Given Number "+ n +" is not a Prime number.");
		}
	}
}