class MaxOf7{
	public static void main(Stringp[] args){
		int a=5,b=10,c=15,d=20,e=25,f=30,g=35;
		int max=(a>b)?
				((a>c)?
					((a>d)?
						((a>e)?
							((a>f)?((a>g)?a:g):(f>g?f:g))
							:(e>f)?())):()):()):()
	}
}