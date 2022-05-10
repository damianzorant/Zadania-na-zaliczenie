package pl.zaawansowanetechnikiobiektowe;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {

    public Car car;
    private Double salary;

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
}

