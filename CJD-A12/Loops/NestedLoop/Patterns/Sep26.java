class Sep26{
	public static void main(String[] args){

//DATE-26/09/2024

/**	//PATTERN

      *
    * *
  * * * * * * *
* * * * * * * *
  * * * * * * *
    * *
      *

*/

		int space=3, star=1;
		for(int i=1; i<=7; i++){
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++){
				System.out.print("* ");
			}
			for(int j=1; j<=6; j++){
				if(i>=3 && i<=5)
					System.out.print("* ");
			}
			System.out.println();
			if(i<=3){
				space--;
				star++;	
			}
			else{
				space++;
				star--;
			}
			
		}
		System.out.println();

/**	//PATTERN

        *
        * *
* * * * * * *
* * * * * * * *
* * * * * * *
        * *
        *

*/
		space=4;
		star=1;
		for(int i=1; i<=7; i++){
			for(int j=1; j<=4; j++){
				if(i>=3 && i<=5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int j=1; j<=star; j++){
				System.out.print("* ");
			}
			System.out.println();
			if(i<=3){
				star++;	
			}
			else{
				star--;
			}
		}
		System.out.println();

/**	//PATTERN

      *         *
    * *         * *
  * * * * * * * * * *
* * * * * * * * * * * *
  * * * * * * * * * *
    * *         * *
      *         *

*/
		space=3;
		star=1;
		for(int i=1; i<=7; i++){
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++){
				System.out.print("* ");
			}
			for(int j=1; j<=4; j++){
				if(i>=3 && i<=5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int j=1; j<=star; j++){
				System.out.print("* ");
			}
			System.out.println();
			if(i<=3){
				space--;
				star++;	
			}
			else{
				space++;
				star--;
			}
			
		}
		System.out.println();

/**	//PATTERN

*						*
*	*				*	*
*	*	*		*	*	*
*	*	*	*	*	*	*
*	*	*		*	*	*
*	*				*	*
*						*

*/

		star=1;
		space=5;
		for(int i=1; i<=7; i++){
			for(int j=1; j<=star; j++){
				System.out.print("* ");
			}
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++){
				if(j!=4)
					System.out.print("* ");
			}
			System.out.println();
			if(i<=3){
				star++;
				space-=2;
			}
			else{
				star--;
				space+=2;
			}
		}
		System.out.println();
	}
}
