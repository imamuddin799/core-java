class Box{
	double length;
	double breadth;
	double height;
	Box(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	Box(double length, double breadth, double height){
		this(length, breadth);
		this.height = height;
	}
	public void area(){
		if(height == 0.0){
			double area = length * breadth;
			System.out.println("Area of the 2D box is : "+ area);
		}
		else{
			double volume = length * breadth * height;
			System.out.println("Volume of the 3D box is : "+ volume);
		}
	}
}