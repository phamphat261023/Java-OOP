package Abstract;

public class Plane extends Vehicle{

    private String typeEnergy;

    public Plane(String nameVehicle, Brand brand, String typeEnergy) {
        super(nameVehicle, brand);
        this.typeEnergy = typeEnergy;
    }

    public String getTypeEnergy() {
        return typeEnergy;
    }

    public void setTypeEnergy(String typeEnergy) {
        this.typeEnergy = typeEnergy;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "typeEnergy='" + typeEnergy + '\'' +
                ", brand=" + brand +
                '}';
    }

    public void takeOff (){
        System.out.println("Take off.........");
    }

    public void landing (){
        System.out.println("Landing..........");
    }

    @Override
    public void speed() {
        System.out.println("200km/1h....");
    }
}
