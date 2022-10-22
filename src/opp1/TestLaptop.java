package opp1;

public class TestLaptop {
    public static void main(String[] args) {
        DateLaptop date1 = new DateLaptop(26,10,2003);
        DateLaptop date2 = new DateLaptop(12,9,1998);
        DateLaptop date3 = new DateLaptop(29,11,2000);

        NationLaptop nation1 = new NationLaptop("VN", "Viet Nam");
        NationLaptop nation2 = new NationLaptop("USA", "United State");
        NationLaptop nation3 = new NationLaptop("EN", "England");

        BrandLaptop brand1 = new BrandLaptop("Macbook", nation2);
        BrandLaptop brand2 = new BrandLaptop("Dell", nation1);
        BrandLaptop brand3 = new BrandLaptop("Asus", nation3);

        Laptop laptop1 = new Laptop(brand2, date1, 3000, 2);
        Laptop laptop2 = new Laptop(brand1, date2, 5000, 3);
        Laptop laptop3 = new Laptop(brand3, date3, 2000, 1);

        System.out.println("Laptop1 vs Laptop2: " + laptop1.testLaptop(laptop2));
        System.out.println("Laptop1 vs Laptop3: " + laptop1.testLaptop(laptop3));
        System.out.println("Laptop2 vs Laptop: " + laptop2.testLaptop(laptop3));

        System.out.println("Name nation laptop 1 : " + laptop1.getNameNation());
        System.out.println("Name nation laptop 2 : " + laptop2.getNameNation());
        System.out.println("Name nation laptop 3 : " + laptop3.getNameNation());

    }
}
