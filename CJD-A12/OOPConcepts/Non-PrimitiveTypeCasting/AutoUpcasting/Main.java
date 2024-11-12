class A {
    int a = 10;
}
class B extends A {
    int b = 20;                           
}
class Main {
    public static void main(String[] args) {
        A ob = new B();
        System.out.println(ob.a);
        //System.out.println(ob.b); //CTE
    }
}