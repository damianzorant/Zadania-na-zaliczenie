package pl.zaawansowanetechnikiobiektowe;

import devices.Car;
import devices.Device;
import devices.Phone;

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

        Car car = new Car("Golf", "Volkswagen") {
            public void refuel() {
                System.out.println("Refuel...");
            }
        }

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

        Phone phone = new Phone();
        phone.turnOn();

        Human buyer = new Human();
        Human seller = new Human();
        }
    }


    // z zajec 11
    public static void main(String[] args) {

        Car fiat = new Car();
        fiat.value = 10000.0;
        Car alfa = new Car();
        alfa.value = 30000.0;
        Car pasat = new Car();
        pasat.value = 100000.0;

        Human me = new Human ("Kacper", 3);
        me.setCar(fiat, 0);
        me.setCar(alfa, 1);
        me.setCar(pasat,2);

        System.out.println("Suma wartości aut wynosi:");
        System.out.println(me.getValueOfGarage());
    }

}
