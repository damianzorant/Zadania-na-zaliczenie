package pl.zaawansowanetechnikiobiektowe;

public class Animal {
    private static final Double DEFAULT_DOG_WEIGHT = 3.0;
    private static final Double DEFAULT_CAT_WEIGHT = 1.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 2.0;

    final String spacies;
    String name;
    Integer age;
    private Double weight;
    private Boolean alive;

    Animal(String spacies, String name){
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


}