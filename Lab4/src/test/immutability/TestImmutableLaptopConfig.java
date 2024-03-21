package test.immutability;

import devicesAndComponents.*;

public class TestImmutableLaptopConfig {

    public static void main(String[] args) {
        OperatingSystem os = new OperatingSystem("Windows 10");
        ConfiguratieLaptop config = new ConfiguratieLaptop(os);
        MyLaptop laptop = new MyLaptop(config);
        System.out.println(laptop);
        os.setOperatingSystemName("Windows 11");
        System.out.println(laptop);

    }
}
