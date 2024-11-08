class  Garage{
	public static void main(String[] args){
		Bike bike = new Bike("Hero", "Teal", 150000, new Engine(45, 20, 70, "BS6"));
		System.out.println(bike.brand);
		System.out.println(bike.color);
		System.out.println(bike.cost);
		System.out.println(bike.engine.hp);
		System.out.println(bike.engine.torque);
		System.out.println(bike.engine.milage);
		System.out.println(bike.engine.type);
	}
}