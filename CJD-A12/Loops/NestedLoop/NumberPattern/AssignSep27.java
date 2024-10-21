class Sep27{
	public static void main(String[] args){

//DATE-27/09/2024

/**	PATTERN

 1
 2  3
 4  5  6
 7  8  9 10
11 12 13 14 15

*/

		int n=1;
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.printf("%2d ", n++);
			}
			System.out.println();
		}
		System.out.println();

/**	PATTERN

 1
 1  2
 1  2  3
 1  2  3  4
 1  2  3  4  5

*/

		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.printf("%2d ", j);
			}
			System.out.println();
		}
		System.out.println();

/**	PATTERN

       1
     1 2 3
   1 2 3 4 5
 1 2 3 4 5 6 7

*/

		int space=3, digit=1;
		for(int i=1; i<=4; i++){
			for(int j=1; j<=space; j++){
				System.out.printf("  ");
			}
			for(int j=1; j<=digit; j++){
				System.out.printf("%2d",j);
			}
			System.out.println();
			space--;
			digit+=2;
		}
		System.out.println();

/**	PATTERN

 2  4  6  8
10 12 14 16
18 20 22 24
26 28 30 32

*/
		n=2;
		for(int i=1; i<=4; i++){
			for(int j=1; j<=4; j++){
				System.out.printf("%2d ", n);
				n+=2;
			}
			System.out.println();
		}
		System.out.println();

/**	PATTERN

          1
       2  3
    4  5  6
 7  8  9 10
    1  2  3
       4  5
          6

*/

		space=3;
		digit=1;
		n=1;
		for(int i=1; i<=7; i++){
			for(int j=1; j<=space; j++){
				System.out.printf("   ");
			}
			for(int j=1; j<=digit; j++){
				System.out.printf("%2d ", n++);
			}
			
			if(i==4)
				n=1;
			System.out.println();
			if(i<=3){
				space--;
				digit++;
			}
			else{
				space++;
				digit--;
			}
		}
		System.out.println();

/**	PATTERN

          1
       2  3  4
    5  6  7  8  9
10 11 12 13 14 15 16
   17 18 19 20 21
      22 23 24
         25

*/

		space=3;
		digit=1;
		n=1;
		for(int i=1; i<=7; i++){
			for(int j=1; j<=space; j++){
				System.out.printf("   ");
			}
			for(int j=1; j<=digit; j++){
				System.out.printf("%2d ", n++);
			}
			System.out.println();
			if(i<=3){
				space--;
				digit+=2;
			}
			else{
				space++;
				digit-=2;
			}
		}
		System.out.println();


/**	PATTERN

      1
    1 2 1
  1 2 3 2 1
1 2 3 4 3 2 1

*/

		space=3; digit=1;
		for(int i=1; i<=4; i++){
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=1; j<=digit; j++){
				System.out.print(j+" ");
			}
			for(int j=i-1; j>=1; j--){
				System.out.print(j+" ");
			}
			System.out.println();
			space--;
			digit++;
		}
		System.out.println();

/**	PATTERN

			1
		2	1	2
	3	2	1	2	3
4	3	2	1	2	3	4

*/

		space=3;
		for(int i=1; i<=4; i++){
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=i; j>=1; j--){
				System.out.print(j+" ");
			}
			for(int j=2; j<=i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
			space--;

		}
		System.out.println();

	//OR

		digit=1; n=4; space=n-1; 
		for(int i=1; i<=n; i++){
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=i; j>=1; j--){
				System.out.print(j+" ");
			}
			for(int j=2; j<=i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
			space--;
			digit++;
		}
		System.out.println();

/**	PATTERN

1  2  3  4
2  3  4  1
3  4  1  2
4  1  2  3

*/

		for(int i=1; i<=4; i++){
			for(int j=i; j<=4; j++){
				System.out.print(j+"  ");
			}
			for(int j=1; j<i; j++){
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		System.out.println();

	//OR

		n=5;
		for(int i=1; i<=n; i++){
			for(int j=i; j<=n; j++){
				System.out.print(j+"  ");
			}
			for(int j=1; j<i; j++){
				System.out.print(j+"  ");
			}
			System.out.println();
			space--;
			digit++;
		}
		System.out.println();
	}
}