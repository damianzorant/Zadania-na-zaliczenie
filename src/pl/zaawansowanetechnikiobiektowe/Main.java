package pl.zaawansowanetechnikiobiektowe;

public class Main {

    public static void main(String[] args) {
//        Animal dog = new Animal("canis", "Szarik");
//        System.out.println("pies nazywa się " + dog.name);
//
//        System.out.println("pies waży " + dog.getWeight());
//        dog.feed();
//        dog.feed();
//        dog.feed();
//        System.out.println("pies waży " +dog.getWeight());
//
//        Human me = new Human("Damian", "Zorant");

        Human human = new Human();

        Car car = new Car("Golf", "Volkswagen");
        car.Colour = "Black";

        human.car = car;
        System.out.println(human.car.Model + human.car.Producer + human.car.Colour);

        human.getSalary();

        human.setSalary(100D);
        System.out.println("Kwota wynosi :" + human.getSalary());
    }
}
