package animal;

import java.util.Objects;

public class Bird extends Animal {
    private String colour;

    public Bird() {

    }

    public Bird(int noOfLegs, String name, String colour) {
        super(name, noOfLegs);
        this.colour = colour;
    }

    @Override
    public void move() {
        System.out.println("I fly!");
    }

    public void sing() {
        System.out.println("I can chirp!");
    }

}
