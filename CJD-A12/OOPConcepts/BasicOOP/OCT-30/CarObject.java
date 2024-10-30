class CarObject{
	public static Car max(Car a, Car b, Car c){
		if(a.price>b.price && a.price>c.price)
			return a;
		else if(b.price>c.price)
			return b;
		else
			return c;
	}
	public static Car min(Car a, Car b, Car c){
		if(a.price<b.price && a.price<c.price)
			return a;
		else if(b.price<c.price)
			return b;
		else
			return c;
	}
	public static Car sec(Car a, Car b, Car c){
		Car max = max(a,b,c);
		Car min = min(a,b,c);
		if(a.price>min.price && a.price<max.price)
			return a;
		else if(b.price>min.price && b.price<max.price)
			return b;
		else
			return c;
	}
	public static void main(String[] args){
		/**
		Car c1 = new Car();
		c1.brand = "Marooti 800";
		c1.color = "Red";
		c1.price = 500000;
		c1.topSpeed = 120;
		//System.out.println("\n**********************************\n");
		Car c2 = new Car();
		c2.brand = "Scorpio";
		c2.color = "Black";
		c2.price = 2500000;
		c2.topSpeed = 220;
		//System.out.println("\n**********************************\n");
		Car c3 = new Car();
		c3.brand = "Thar";
		c3.color = "White";
		c3.price = 1500000;
		c3.topSpeed = 160;
		*/
		
		Car c1 = new Car();
		c1.brand = "RollsRoyce";
		c1.color = "Gold";
		c1.topSpeed = 280;
		c1.price = 2000000000;
		
		Car c2 = new Car();
		c2.brand = "Ferrari";
		c2.color = "Red";
		c2.topSpeed = 340;
		c2.price = 8000000000.0;
		
		Car c3 = new Car();
		c3.brand = "Nano";
		c3.color = "Yellow";
		c3.topSpeed = 100;
		c3.price = 100000;
		
		System.out.println("\n**********************************\n");
		Car max = max(c1, c2, c3);
		Car min = min(c1, c2, c3);
		Car secMax = sec(c1, c2, c3);
		min.details();
		System.out.println("\n**********************************\n");
		secMax.details();
		System.out.println("\n**********************************\n");
		max.details();
	}
}