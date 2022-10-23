package Abstract;

public abstract class Vehicle {

    private String nameVehicle;
    protected Brand brand;

    public Vehicle(String nameVehicle, Brand brand) {
        this.nameVehicle = nameVehicle;
        this.brand = brand;
    }

    public String getNameVehicle() {
        return nameVehicle;
    }

    public void setNameVehicle(String nameVehicle) {
        this.nameVehicle = nameVehicle;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getNameBrand (){
        return this.brand.getNameBrand();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "nameVehicle='" + nameVehicle + '\'' +
                ", brand=" + brand +
                '}';
    }

    public void active (){
        System.out.println("Active.........");
    }

    public void turnOff (){
        System.out.println("Game over.........");
    }

    public abstract void speed ();

}
