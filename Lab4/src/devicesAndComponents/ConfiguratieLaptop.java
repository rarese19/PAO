package devicesAndComponents;

public final class ConfiguratieLaptop {
    private OperatingSystem OS;

    public ConfiguratieLaptop(OperatingSystem os) {
        OperatingSystem cloneOs = new OperatingSystem(os.getOperatingSystemName());
        this.OS = cloneOs;
    }

    @Override
    public String toString() {
        return "ConfiguratieLaptop{" +
                "OS=" + OS +
                '}';
    }
}
