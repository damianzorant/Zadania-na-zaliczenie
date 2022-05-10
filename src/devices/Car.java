package devices;

public class Car extends Device {
    String Colour;
    public String Model;
    public String Producer;
    public Double Value;

    public Car(String model, String producer) {
        Model = model;
        Producer = producer;
    }

    public String toString() {
        return Model + Producer + Value;
    }

    @Override
    public void turnOn() {

    }
}
