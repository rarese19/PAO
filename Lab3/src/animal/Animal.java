package animal;

import java.util.Objects;

public class Animal {
    private String name;
    private int noOfLegs;

    public Animal() {
    }

    public Animal(String name, int noOfLegs) {
        this.name = name;
        this.noOfLegs = noOfLegs;
    }

    public void eat(){
        System.out.println("Animal(" + this.name + ") wants to eat");
    }

    public void move(){
        System.out.println("Animal(" + this.name + ") is moving");
    }

    public void eat(String food) {
        System.out.println("Animal(" + this.name + ") is eating " + food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

}
