class Cap{
	String color;
	Cap(String color){
		this.color = color;
	}
	public void openCap(){
		System.out.println("Cap Color : "+ color);
		System.out.println("Cap Opened...");
	}
	public void closeCap(){
		System.out.println("Cap Closed...");
	}
}