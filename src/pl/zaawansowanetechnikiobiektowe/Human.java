package pl.zaawansowanetechnikiobiektowe;

import devices.Car;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {

    public Car car;
    private Double salary;
    private Double valueOfTheCar;

        public Double getSalary() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        Date date = new Date();
        System.out.println("Dane pobrano w czasie: " + simpleDateFormat.format(date));
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary < 0) {
            System.out.println("Nie można przypisać ujemnej wartości");
        }
        System.out.println("Nowe dane zostały wysłane do systemu księgowego");
        System.out.println("Proszę udać się po odbiór aneksu do umowy do pani Hani z kadr");
        System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
        this.salary = salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Double getValueOfTheCar() {
        return valueOfTheCar;
    }

    public void setValueOfTheCar(Double valueOfTheCar) {
        if(valueOfTheCar < this.salary) {
            System.out.println("Udało się kupić za gotówkę");
            car = new Car("Golf", "Volkswagen");
        }
        else if(valueOfTheCar / 12 < this.salary) {
            System.out.println("Udało się kupić na kredyt (no trudno)");
            car = new Car("Golf", "Volkswagen");
        }
        else {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }

    public String getCarToString() {
            return car.toString();
    }
}

