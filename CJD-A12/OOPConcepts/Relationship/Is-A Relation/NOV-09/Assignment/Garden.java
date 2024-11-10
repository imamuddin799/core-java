class Garden {
    public static void main(String[] args) {
        Rose rose = new Rose();
        rose.name = "Rose";
        rose.color = "Red";
        rose.fragrance = "Sweet";
        rose.isBlooming = true;
        rose.thornSize = "Small";
        rose.bloomPeriod = 3;

        Rose r = new Rose();
        r.name = "Rose";
        r.color = "Yellow";
        r.fragrance = "Strong";
        r.isBlooming = false;
        r.thornSize = "Medium";
        r.bloomPeriod = 2;

        rose.display();
        r.display();
        System.out.println();
        rose.grow();
        r.grow();
        System.out.println();
        rose.bloom();
        r.bloom();
        System.out.println();
        rose.wither();
        r.wither();
        System.out.println();
        rose.bloomPeriod();
        r.bloomPeriod();
        System.out.println();
        rose.watered();
        r.watered();
    }
}