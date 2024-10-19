class AssignSep24{
	public static void main(String[] args){

//DATE-24/09/2024

/**	PATTERN

*****
****
***
**
*

*/

		int star=5;
		for(int i=1; i<=5; i++){
			for(int j=5; j>=i; j--){
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
		System.out.println();

	//OR

		int n=5;
		star=n;
		for(int i=1; i<=n; i++){
			for(int j=n; j>=i; j--){
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
		System.out.println();

/**	PATTERN

****
***
**
*
**
***
****

*/

		star=4;
		for(int i=1; i<=4; i++){
			for(int j=1; j<=star; j++){
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
		star=2;
		for(int i=1; i<=3; i++){
			for(int j=1; j<=star; j++){
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
		System.out.println();

	//OR

		n=4;
		star=n;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=star; j++){
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
		star=2;
		for(int i=1; i<=n-1; i++){
			for(int j=1; j<=star; j++){
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
		System.out.println();

/**	PATTERN

*
**
***
****
***
**
*

*/

		star =1;
		for(int i=1; i<=4; i++){
			for(int j=1; j<=star; j++){
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
		star=star-2;
		for(int i=1; i<=3; i++){
			for(int j=1; j<=star; j++){
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
		System.out.println();

	//OR

		n=4;
		star =1;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=star; j++){
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
		star=star-2;
		for(int i=1; i<=n-1; i++){
			for(int j=1; j<=star; j++){
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
		System.out.println();

/**	PATTERN

        *
      * *
    * * *
 * * * *
    * * *
      * *
         *

*/

		int space= 3;
		star=1;
		for(int i=1; i<=4; i++){
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++){
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;
		}
		star=star-2;
		space=space+2;
		for(int i=1; i<=4; i++){
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++){
				System.out.print("* ");
			}
			System.out.println();
			space++;
			star--;
		}
		System.out.println();

	//OR

		n=14;
		space= n-1;
		star=1;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++){
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;
		}
		star=star-2;
		space=space+2;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++){
				System.out.print("* ");
			}
			System.out.println();
			space++;
			star--;
		}
		System.out.println();

/**	PATTERN

 * * * *
   * * *
     * *
       *
     * *
   * * *
 * * * *

*/

		space= 0;
		star=4;
		for(int i=1; i<=4; i++){
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++){
				System.out.print("* ");
			}
			System.out.println();
			space++;
			star--;
		}
		star=star+2;
		space=space-2;
		for(int i=1; i<=3; i++){
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++){
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;
		}
		System.out.println();

	//OR

		n=14;
		space= 0;
		star=n;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++){
				System.out.print("* ");
			}
			System.out.println();
			space++;
			star--;
		}
		star=star+2;
		space=space-2;
		for(int i=1; i<=n-1; i++){
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++){
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;
		}
		System.out.println();

/**	PATTERN

1                      1
1 2                2 1
1 2 3          3 2 1
1 2 3 4    4 3 2 1
1 2 3 4 5 4 3 2 1

*/
		space=7;
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j+" ");
			}
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=i; j>=1; j--){
				if(j!=5)
					System.out.print(j+" ");
			}
			System.out.println();
			space=space-2;
		}
		System.out.println();

	//OR

		n=9;
		int a=n;
		space=(n*2)-3;
		for(int i=1; i<=a; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j+" ");
			}
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=i; j>=1; j--){
				if(j!=a)
					System.out.print(j+" ");
			}
			System.out.println();
			space=space-2;
		}
		System.out.println();

/**	PATTERN

1                         1
1 2                   2 1
1 2 3             3 2 1
1 2 3 4       4 3 2 1
1 2 3 4 5 5 4 3 2 1

*/
		space=8;
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j+" ");
			}
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=i; j>=1; j--){
					System.out.print(j+" ");
			}
			System.out.println();
			space=space-2;
		}
		System.out.println();

	//OR

		n=9;
		space=(n*2)-2;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j+" ");
			}
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=i; j>=1; j--){
					System.out.print(j+" ");
			}
			System.out.println();
			space=space-2;
		}
		System.out.println();
	}
}