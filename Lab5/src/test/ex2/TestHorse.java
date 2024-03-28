package test.ex2;

import interfaces.ex2.Horse;
import interfaces.ex2.Sticlete;

public class TestHorse {

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.move();
        System.out.println(horse.hasFur());

        Sticlete sticletel = new Sticlete();
        sticletel.move();
        System.out.println(sticletel.hasFeathers());
    }
}
