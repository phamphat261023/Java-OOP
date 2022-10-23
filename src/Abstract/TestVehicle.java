package Abstract;

public class TestVehicle {
    public static void main(String[] args) {
        Brand br1 = new Brand("VietNam eline", "Viet Nam");
        Brand br2 = new Brand("CheVoLet", "USA");
        Brand br3 = new Brand("Yamaha", "Japan");

        Plane vh1 = new Plane("Plane", br1, "Oil");
        Vehicle vh2 = new Oto("O to", br2, "gasoline");
        Vehicle vh3 = new Cycle("Cycle", br3);


        System.out.println("Vh1: " + vh1.getNameVehicle());
        System.out.println("Brand: " + vh1.getNameBrand());
        vh1.active();
        vh1.takeOff();
        vh1.landing();
        vh1.speed();
        vh1.getTypeEnergy();

        System.out.println("-----------------------------------");
        System.out.println("Vh2: "+vh2.getNameVehicle());
        System.out.println("Brand: "+vh2.getNameBrand());
        vh2.active();
        vh2.turnOff();
        vh2.speed();

        System.out.println("------------------------------------");
        System.out.println("Vh3: "+vh3.getNameBrand());
        System.out.println("Brand: "+vh3.getNameBrand());
        vh3.active();
        vh3.turnOff();
        vh3.speed();
    }
}
