class AssignOct01{
	public static void main(String[] args){

//DATE-01/10/2024

/**

  1   2   3   4   5
  6   7   8   9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

*/

		int r=5;	//r=row
		int c=r;	//c=column
		char ch='a';	//ch=character
		int n=1;	//n=number
		for(int i=1; i<=r; i++){
			for(int j=1; j<=c; j++){
				System.out.printf("%2d ",n++);
			}
			System.out.println();
		}
		System.out.println();

/**

  1
  2  3
  4  5  6
  7  8  9 10
11 12 13 14 15

*/

		r=5;
		c=r;
		ch='a';
		n=1;
		for(int i=1; i<=r; i++){
			for(int j=1; j<=i; j++){
				System.out.printf("%2d ",n++);
			}
			System.out.println();
		}
		System.out.println();

/**

a***b
*c*d*
**f**
*g*h*
i***j

*/

		r=5;
		c=r;
		ch='a';
		n=1;
		for(int i=1; i<=r; i++){
			for(int j=1; j<=c; j++){
				if(i-j==0 || i+j==r+1){
					System.out.print(ch++ +" ");
						if(ch=='e')
							ch='f';
				}	
				else{
					System.out.print('*'+" ");
				}
			}
			System.out.println();
		}
		System.out.println();

/**

1a$b2
3c$d4
5e$f6
7g$h8
9i$j10

*/

		r=5;
		c=r;
		ch='a';
		n=1;
		for(int i=1; i<=r; i++){
			for(int j=1; j<=c; j++){
				if(j==1 || j==r)
					System.out.print(n++ +" ");
				else if(j==2 || j==r-1)
					System.out.print(ch++ +" ");
				else
					System.out.print("$"+" ");
			}
			System.out.println();
		}
		System.out.println();

/**

   a
   b
12c34
   d
   e

*/

		r=5;
		c=r;
		ch='a';
		n=1;
		for(int i=1; i<=r; i++){
			for(int j=1; j<=c; j++){
				if(j==r/2+1)
					System.out.print(ch);
				else if(i==r/2+1)
					System.out.print(n++);
				else
					System.out.print(" ");
			}
			System.out.println();
			ch++;
		}
		System.out.println();

/**



*/

		r=5;
		c=r;
		ch='a';
		n=1;
		for(int i=1; i<=r; i++){
			for(int j=1; j<=c; j++){
				if(j==r/2+1)
					System.out.print(ch);
				else if(i==r/2+1)
					System.out.print(n++);
				else
					System.out.print(" ");
			}
			System.out.println();
			ch++;
		}
		System.out.println(); 

/**

			a
		a	b	a
	a	b	c	b	a
a	b	c	d	c	b	a
	a	b	c	b	a
		a	b	a
			a

*/

		r=7;
		c=r;
		n=1;
		int mid=(r/2)+1;
		for(int i=1; i<=r; i++){
			ch='a';
			for(int j=1; j<=c; j++){
				if((i+j>=mid+1 && j-i<=r/2 && i<=mid)||(i-j<=r/2 && j+i<=(mid*3)-1 && i>=mid)){
					System.out.print(ch);
					if(j<=r/2)
						ch++;
					else
						ch--;
				}
				else
					System.out.print(' ');
			}
			System.out.println();
		}
		System.out.println();

/**

   a
  bcd
 efghi
jklmnop
  123
  456
  789

*/

		r=7;
		c=r;
		n=1;
		mid=(r/2)+1;
		ch='a';
		for(int i=1; i<=r; i++){
			for(int j=1; j<=c; j++){
				if((i+j>=mid+1 && j-i<=r/2 && i<=mid)||(j>=mid/2+1 && j<=(mid/2+1)*(mid/2+1) && i>=mid)){
					if(i<=mid)
						System.out.print(ch++ +"\t");
					else
						System.out.print(n++ +"\t");
				}
				else
					System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}