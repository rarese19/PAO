package test;

import animal.*;

public class TestInheritance {

    public static void main(String[] args) {
        Animal animal = new Animal("dog", 4);
        animal.move();

        Ape ape = new Ape(2, "gorilla", "big");
        ape.move();
    }

}