package pl.zaawansowanetechnikiobiektowe;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("canis", "Szarik");
        System.out.println("pies nazywa się " + dog.name);

        System.out.println("pies waży " + dog.getWeight());
        dog.feed();
        dog.feed();
        dog.feed();
        System.out.println("pies waży " +dog.getWeight());

        Human me = new Human("Damian", "Zorant");
        System.out.println(me.getWeight());
        System.out.println(me.spacies);
        System.out.println(me.name);
    }
}
