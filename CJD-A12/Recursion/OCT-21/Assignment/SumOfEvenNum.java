import java.util.Scanner;
class SumOfEvenNum{
	public static int sumOfEvenNum(int m, int n){
		if(m<=n){
			if(m%2==0){
				return m + sumOfEvenNum(m + 1, n);
			}
			else{
				return sumOfEvenNum(m +1, n);
			}
		}
		return 0;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range from M to N to find Sum of Even Numbers");
		System.out.print("Enter value of M : ");
		int m = sc.nextInt();
		System.out.print("Enter value of N : ");
		int n = sc.nextInt();
		System.out.println("The sum of even numbers from "+ m +" to "+ n +" is : "+ sumOfEvenNum(m, n));
	}
}