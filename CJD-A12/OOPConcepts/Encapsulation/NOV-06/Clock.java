class Clock{
	private int secs;
	private int mins;
	private int hrs;
	Clock(){}
	Clock(int secs, int mins, int hrs){
		if(secs >= 0 && secs <= 59)
			this.secs = secs;
		else
			System.out.println("Invalid Seconds..!!!");
		if(mins >= 0 && mins <= 59)
			this.mins = mins;
		else
			System.out.println("Invalid Minutes..!!!");
		if(hrs >= 1 && hrs <= 12)
			this.hrs = hrs;
		else
			System.out.println("Invalid Hours..!!!");
	}
	public int getSecs(){
		return secs;
	}
	public void setSecs(int secs){
		if(secs >=0 && secs <= 59)
			this.secs = secs;
		else
			System.out.println("Invalid Seconds..!!!");
	}
	public int getMins(){
		return mins;
	}
	public void setMins(int mins){
		if(mins >= 0 && mins <= 59)
			this.mins = mins;
		else
			System.out.println("Invalid Seconds..!!!");
	}
	public int getHrs(){
		return hrs;
	}
	public void setHrs(int hrs){
		if(hrs >= 1 && hrs <= 12)
			this.hrs = hrs;
		else
			System.out.println("Invalid Seconds..!!!");
	}
	public void time(){
		System.out.println(hrs +":"+ mins +":"+ secs);
	}
}
