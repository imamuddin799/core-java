class CarObject{
	public static Car maxPrice(Car a, Car b, Car c){
		System.out.println("The Details of Maxed Priced Car : ");
		if(a.price>b.price && a.price>c.price){
			return a;
		}
		else if(b.price>c.price){
			return b;
		}
		else{
			return c;
		}
	}
	public static void main(String[] args){
		Car c1 = new Car();
		c1.brand = "Marooti 800";
		c1.color = "Red";
		c1.price = 500000;
		c1.topSpeed = 120;
		c1.details();
		System.out.println("\n**********************************\n");
		Car c2 = new Car();
		c2.brand = "Scorpio";
		c2.color = "Black";
		c2.price = 2500000;
		c2.topSpeed = 220;
		c2.details();
		System.out.println("\n**********************************\n");
		Car c3 = new Car();
		c3.brand = "Thar";
		c3.color = "White";
		c3.price = 1500000;
		c3.topSpeed = 160;
		c3.details();
		System.out.println("\n**********************************\n");
		Car c4 = maxPrice(c1, c2, c3);
		c4.details();
	}
}