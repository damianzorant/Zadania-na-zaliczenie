package devices;

public abstract class Car extends Device {
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

    abstract void refuel();


    // z zajec 11
    public void sell(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            throw new Exception("sorry, kupujący nie ma kasy");
        }
        if(!seller.hasACar(this)){
            throw new Exception("Sorry, sprzedający nie ma auta");
        }
        if(!buyer.hasFreeParkingLot()){
            throw new Exception("kupujący nie ma gdzie trzymać auta");
        }

        buyer.addCar(this);
        seller.removeCar(this);
        buyer.cash -= price;
        seller.cash += price;

        System.out.println("Transakcja zakończona pomyślnie");
    }
}
