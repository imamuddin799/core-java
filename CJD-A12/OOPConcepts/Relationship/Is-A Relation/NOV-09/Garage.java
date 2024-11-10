class Garage{
	public static void main(String[] args){
		Car car = new Car();
		car.brand = "Maruthi Suzuki";
		car.wheelType = "tyres";
		car.tyres = 4;
		car.fuelType = "Diesel";
		car.lights = 6;
		car.seats = 5;
		car.move();
		car.steeringLeft();
		car.steeringRight();
		car.breaks();
	}
}