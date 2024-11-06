class WallClock{
	public static void main(String[] args){
		Clock c1 = new Clock();
		c1.setSecs(28);
		c1.setMins(20);
		c1.setHrs(7);
		c1.time();
		System.out.println(c1.getHrs() +":"+ c1.getMins());
		Clock c2 =  new Clock(45, 23, 7);
		c2.time();
	}
}
