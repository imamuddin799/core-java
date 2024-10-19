class AssignOct09{
	
//DATE-09-10-2024

//HAPPY NUMBER

	public static boolean isHappyNumber(int n){
		//System.out.print(n+"\t");
		while(n!=1 && n!=4){
			int sum=sumOfSquareOfEachDigit(n);
			n=sum;
		}
		return n==1;
	}
	public static int sumOfSquareOfEachDigit(int n){
		int sum=0;
		while(n!=0){
			int remainder=n%10;
			sum+=remainder*remainder;
			n/=10;
		}
		//System.out.print(sum+"\t");
		return sum;
	}
	
//AUTOMORPHIC NUMBER

	public static boolean isAutomorphic(int n){
		int count=count(n);
		int square=square(n);
		return n==remainder(square, count);
	}
	public static int remainder(int n, int count){
		int result=0, position=1;
		while(count!=0){
			int remainder=n%10;
			result=result+remainder*position;
			position*=10;
			n/=10;
			count--;
		}
		return result;
	}
	public static int square(int n){
		int square=n*n;
		return square;
	}
	public static int count(int n){
		int count=0;
		while(n!=0){
			count++;
			n/=10;
		}
		return count;
	}
	
	//SUNNY NUMBER
	
	public static boolean isSunny(int n){
		int sum=n+1;
		return squareroot(sum);
	}
	public static boolean squareroot(int n){
		for(int i=1; i<=n; i++){
			if(n==i*i)
				return true;
		}
		return false;
	}
	
	//MAIN METHOD-----------------------
	public static void main(String[] args){
		
		//HAPPY NUMBER
		int m=1, n=1000, count=0;
		for(int i=m; i<=n; i++){
			if(isHappyNumber(i)){
				System.out.println(i+" IS A HAPPY NUMBER");
				count++;
			}
			else{
				System.out.println(i+" IS NOT A HAPPY NUMBER");
			}
		}
		System.out.println("No. of Happy Numbers is : "+count);
		
		//AUTOMORPHIC NUMBER
		for(int i=m; i<=n; i++){
			if(isAutomorphic(i)){
				System.out.println(i+" IS A AUTOMORPHIC NUMBER");
			}
			else{
				//System.out.println(i+" IS NOT A AUTOMORPHIC NUMBER");
			}
		}
		
		//SUNNY NUMBER
		for(int i=m; i<=n; i++){
			if(isSunny(i)){
				System.out.println(i+" IS A SUNNY NUMBER");
			}
			else{
				//System.out.println(i+" IS NOT A SUNNY NUMBER");
			}
		}
	}
}
