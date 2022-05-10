package pl.zaawansowanetechnikiobiektowe;

import devices.Car;

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

        human.car = car;
        System.out.println(human.car.Model + human.car.Producer);

        human.getSalary();

        human.setSalary(100D);
        System.out.println("Kwota wynosi :" + human.getSalary());


        human.setCar(car);
        System.out.println(human.getCar().Model + human.getCar().Producer);
        human.setValueOfTheCar(200D);
        human.getValueOfTheCar();

        Car car1 = new Car("octavia", "skoda");
        Car car2 = new Car("octavia", "skoda");

        if(car1 == car2) {
            System.out.println("To ten sam samochód");
        }
        else {
            System.out.println("To są różne samochody");
        }

        System.out.println(car.toString());
        System.out.println(human.getCarToString());
    }
}
