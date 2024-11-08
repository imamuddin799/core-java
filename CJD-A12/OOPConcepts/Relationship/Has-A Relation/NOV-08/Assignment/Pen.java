class Pen{
	Cap cap;
	String color;
	Pen(String color, Cap cap){
		this.color = color;
		this.cap = cap;
	}
	public void writes(){
		System.out.println("Pen Color : "+ color);
		System.out.println("Write java program");
	}
}