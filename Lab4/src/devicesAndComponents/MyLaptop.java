package devicesAndComponents;

public class MyLaptop {
    protected ConfiguratieLaptop config;

    public MyLaptop(ConfiguratieLaptop config) {
        this.config = config;
    }

    @Override
    public String toString() {
        return "MyLaptop{" +
                "config=" + config +
                '}';
    }
}
