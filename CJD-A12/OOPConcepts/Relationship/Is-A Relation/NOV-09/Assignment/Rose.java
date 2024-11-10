class Rose extends Flower{
    String thornSize;
    int bloomPeriod;
    public void bloomPeriod(){
        System.out.println("The blooming period of "+ color +" "+ name +" is "+ bloomPeriod +" months.");
    }
    public void watered(){
        System.out.println("The "+ color +" "+ name +" is watered");
    }
}