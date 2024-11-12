class A {
    public void m1(){
        System.out.println("A m1");
    }
}
class B extends A {
    public void m2(){
        System.out.println("B m2");
    }
}
class Main {
    public static void main(String[] args) {
        A ob = new B();
        B ob1 = (B) ob;
        ob1.m1();
        ob1.m2();
    }
}