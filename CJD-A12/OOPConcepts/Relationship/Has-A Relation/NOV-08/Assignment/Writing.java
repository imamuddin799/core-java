class Writing{
	public static void main(String[] args){
		Pen pen = new Pen("Red", new Cap("Blue"));
		pen.cap.openCap();
		pen.writes();
		pen.cap.closeCap();
	}
}