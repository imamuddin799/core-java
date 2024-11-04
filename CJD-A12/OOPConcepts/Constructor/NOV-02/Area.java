class Area{
	public static void main(String[] args){
		Circle c1 = new Circle(7);
		double area = c1.area();
		double perimeter = c1.perimeter();
		System.out.println("Area of circle is : "+ area);
		System.out.println("Perimeter of circle is : "+ perimeter);
		
		Circle c2 = new Circle(17);
		area = c2.area();
		perimeter = c2.perimeter();
		System.out.println("Area of circle is : "+ area);
		System.out.println("Perimeter of circle is : "+ perimeter);
	}
}
