package Abstract;

public class Oto extends  Vehicle {

    private String typeEnergy;

    public Oto(String nameVehicle, Brand brand, String typeEnergy) {
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
        return "Oto{" + super.toString() +
                "typeEnergy='" + typeEnergy + '\'' +
                ", brand=" + brand +
                '}';
    }

    @Override
    public void speed() {
        System.out.println("100km/1h");
    }
}
