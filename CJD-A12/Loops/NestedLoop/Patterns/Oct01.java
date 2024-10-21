class Oct01{
	public static void main(String[] args){

//DATE-01/10/2024

/**

aaaa
bbbb
cccc
dddd

*/

		int r=4;	//r=row
		int c=r;	//c=column
		char ch='a';	//ch=character
		for(int i=1; i<=r; i++){
			for(int j=1; j<=c; j++){
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}
		System.out.println();

/**

abcd
abcd
abcd
abcd

*/

		r=4;
		c=r;
		for(int i=1; i<=r; i++){
			ch='a';
			for(int j=1; j<=c; j++){
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
		System.out.println();

/**

a				a
	b		b
		c
	d		d
e				e

*/

		r=5;
		c=r;
		ch='a';
		for(int i=1; i<=r; i++){
			for(int j=1; j<=c; j++){
				if(i-j==0 || i+j==r+1)
					System.out.print(ch+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
			ch++;
		}
		System.out.println();

/**

abcd
efgh
iabc
defg
hiab

*/

		r=5;
		c=4;
		ch='a';
		for(int i=1; i<=r; i++){
			for(int j=1; j<=c; j++){
				System.out.print(ch++ +" ");
				if(ch=='j')
					ch='a';
			}
			System.out.println();
		}
		System.out.println();

/**

aaaa
1111
bbbb
2222
cccc
3333

*/

		r=6;
		c=4;
		ch='a';
		for(int i=1; i<=r; i++){
			for(int j=1; j<=c; j++){
				if(i%2!=0)
					System.out.print(ch+" ");
				else
					System.out.print(i/2+" ");
			}
			System.out.println();
			if(i%2!=0)
				ch++;
		}
		System.out.println();

/**

abcd
1234
efgh
5678

*/

		r=4;
		c=r;
		ch='a';
		int n=1;
		for(int i=1; i<=r; i++){
			for(int j=1; j<=c; j++){
				if(i%2!=0)
					System.out.print(ch++ +" ");
				else
					System.out.print(n++ +" ");
			}
			System.out.println();
		}
		System.out.println();

/**

  1   2   3   4   5
  6   7   8   9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

*/

		r=5;
		c=r;
		ch='a';
		n=1;
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
	}
}