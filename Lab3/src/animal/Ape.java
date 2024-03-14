package animal;

import java.util.Objects;

public class Ape extends Animal{
    private String size;

    @Override
    public void move() {
        System.out.println("I am an Ape and I move really hard!");
    }

    public Ape(int noOfLegs, String name, String size) {
        super(name, noOfLegs);
        this.size = size;
    }

}
