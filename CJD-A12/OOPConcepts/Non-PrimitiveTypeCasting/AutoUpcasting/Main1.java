class A1 {
    int a = 10;
}
class B1 extends A1 {
    int b = 20;
}
class C extends B1 {
    int c = 30;
}
class Main1 {
    public static void main(String[] args) {
        A1 ob = new C();
        B1 ob1 = new C();
        A1 ob2 = new B1();

        System.out.println(ob.a);
        System.out.println(ob1.b);
        System.out.println(ob2.a);
        System.out.println(ob1.a);

        // System.out.println(ob.c);   //CTE
        // System.out.println(ob1.c);  //CTE
        // System.out.println(ob2.c);  //CTE
    }
}