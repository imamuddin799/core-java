class Circle{
	double radius;
	static double pi = 3.14;
	Circle(double r){
		this.radius = r;
	}
	public double area(){
		return pi*radius*radius;
	}
	public double perimeter(){
		return 2*pi*radius;
	}
}
