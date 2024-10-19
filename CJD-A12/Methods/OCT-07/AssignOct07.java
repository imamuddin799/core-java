class AssignOct07{

//DATE-07/10/2024

	//MAIN METHOD

	public static void main(String[] args){
		int factorial=factorial(5);
		System.out.println(factorial);
		int power=power(4,5);
		System.out.println(power);
	}

	//CREATE A METHOD FACTORIAL, IT HAS TO TAKE ONE INT PARAMETER
	//N AND IT HAS TO FACTORIAL FOR N AND RETURN THAT N!

	public static int factorial(int n){
		int factorial=1;
		for(int i=n; i>=1; i--){
			factorial*=i;
		}
		return factorial;
	}

	//CREATE A METHOD POWER WHICH TAKES TWO INT PARAMETER AS
	//A,B AND IT HAS RETURN A^B;

	public static int power(int a, int b){
		int p=1;
		for(int i=b; i>=1; i--){
			p=p*a;
		}
		return p;
	}
	
/**	//PROGRAM FOR REVERSE ORDER

	public static void main(String[] args){
		int n=231;
		int rev=0;
		while(n!=0){
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println(rev);	//132
	}
*/
}