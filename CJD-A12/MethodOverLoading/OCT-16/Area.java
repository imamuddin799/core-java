import java.util.Scanner;
class Area{
	public static void area(int side){
		System.out.println("Area of Square : "+ side*side);
	}
	public static void area(int h, int b){
		System.out.println("Area of Rectangle : "+ h*b);
	}
	public static void area(double radius){
		System.out.println("Area of Circle : "+ (3.14*radius*radius));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("WELCOME TO THE WORLD OF AREA FINDING");
		System.out.print("Enter side of Square to find its Area : ");
		int side=sc.nextInt();
		System.out.println("Enter length and breadth of Rectangle to find its Area : ");
		System.out.print("Enter length : ");
		int h=sc.nextInt();
		System.out.print("Enter breadth : ");
		int b=sc.nextInt();
		System.out.print("Enter radius of Circle to find its Area : ");
		double r=sc.nextDouble();
		area(side);
		area(h,b);
		area(r);
		//area(10);
		//area(10, 20);
		//area(7.0);
	}
}
