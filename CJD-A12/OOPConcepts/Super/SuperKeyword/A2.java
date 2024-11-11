class A {
    int a = 10;
}
class B extends A {
    int a = 20;
    public void m1(){
        int a = 30;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
class Main {
    public static void main(String[] args) {
        B ob = new B();
        ob.m1();
    }
}