class AssignSep30{
	public static void main(String[] args){

//DATE-30/09/2024

/**	PATTERN

*						*
*	*				*	*
*	*	*		*	*	*
*	*	*	*	*	*	*
*	*	*		*	*	*
*	*				*	*
*						*

*/
		int mid;

		int r=17;	//r=row
		int c=r;	//c=column
		for(int i=1; i<=r; i++){
			for(int j=1; j<=c; j++){
				if((i-j>=0 && i+j<=r+1) || (i+j>=r+1 && i-j<=0))
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
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

		r=17;	//r=row
		c=r;	//c=column
		mid=r/2+1;
		for(int i=1; i<=r; i++){
			for(int j=1; j<=c; j++){
				if(i+j<=mid+1 || i-j>=mid-1)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
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

		r=17;	//r=row
		c=r;	//c=column
		mid=r/2+1;
		for(int i=1; i<=r; i++){
			for(int j=1; j<=mid; j++){
				if(i-j>=0 && i+j<=r+1)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
		System.out.println();

/**	PATTERN

			*
		*	*
	*	*	*
*	*	*	*
	*	*	*
		*	*
			*

*/

		r=17;	//r=row
		c=r;	//c=column
		mid=r/2+1;
		for(int i=1; i<=r; i++){
			for(int j=1; j<=mid; j++){
				if(i+j>=mid+1 && i-j<=mid-1)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
		System.out.println();

/**	PATTERN

*	*	*	*
	*	*	*
		*	*
			*
		*	*
	*	*	*
*	*	*	*

*/

		r=17;	//r=row
		c=r;	//c=column
		mid=r/2+1;
		for(int i=1; i<=r; i++){
			for(int j=1; j<=mid; j++){
				if((i-j<=0) || (i+j>=mid*2))
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
		System.out.println();
	}
}