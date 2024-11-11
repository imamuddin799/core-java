class A1 {
    static int a = 10;
    int b = 20;
}
class B extends A1 {
    static int c = 30;
    int d = 40;
}
class Main {
    public static void main(String[] args) {
        B ob = new B();
        System.out.println(ob.a);
        System.out.println(ob.b);
        System.out.println(ob.c);
        System.out.println(ob.d);
    }
}