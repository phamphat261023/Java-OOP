package Abstract;

public class Cycle extends  Vehicle{

    public Cycle(String nameVehicle, Brand brand) {
        super(nameVehicle, brand);
    }

    @Override
    public String toString() {
        return "Cycle{" + super.toString() +
                "brand=" + brand +
                '}';
    }

    @Override
    public void speed() {
        System.out.println("40km/1h");
    }
}
