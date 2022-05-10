package creatures;

import pl.zaawansowanetechnikiobiektowe.Human;
import pl.zaawansowanetechnikiobiektowe.sellable;

public class Animal {
    private static final Double DEFAULT_DOG_WEIGHT = 3.0;
    private static final Double DEFAULT_CAT_WEIGHT = 1.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 2.0;

    String spacies = "dog";
    String owner;
    String name;
    Integer age;
    private Double weight;
    private Boolean alive;

    Animal(String spacies){
        this.alive = true;
        this.spacies = spacies;
        this.name = name;
        if(spacies.equals("canis")){
            this.weight = DEFAULT_DOG_WEIGHT;}
        else if (spacies.equals("felis")){
            this.weight = DEFAULT_CAT_WEIGHT;}
        else {
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public Double getWeight(){
        return this.weight;
    }

    public void feed(){
        this.weight += 0.1;
        System.out.println("thx for foood");
    }

    public pl.zaawansowanetechnikiobiektowe.sellable sellable = new sellable() {
        @Override
        public boolean sell(Human seller, Human buyer, Double price) {
            buyer.salary = 50D;
            if (buyer.animal.species != seller.animal.species) {
                System.out.println("Sprzedający nie posiada tego zwierzęcia");
                return false;
            }
            if (price > buyer.salary) {
                System.out.println("Kupujący nie ma dość gotówki");
                return false;
            }
            if (buyer.animal.species == Human || seller.animal.species == Human){
                System.out.println("Handel ludźmi jest niemożliwy")
            }
            buyer.salary = buyer.salary - price;
            seller.salary = seller.salary + price;
            owner = seller.name;
            return true;
        }
    }
}