package animal;

import java.util.Objects;

public class Duck extends Bird{

    private int length;

    public Duck(int noOfLegs, String name, String colour, int length) {
        super(noOfLegs, name, colour);
        this.length = length;
    }

    @Override
    public void move() {
        System.out.println("I can swim!");
    }

    @Override
    public void sing() {
        System.out.println("I can quack!");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Duck duck)) return false;
        return length == duck.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }
}
