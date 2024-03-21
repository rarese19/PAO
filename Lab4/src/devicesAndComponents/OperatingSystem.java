package devicesAndComponents;

public class OperatingSystem {
    protected String operatingSystemName;

    public OperatingSystem(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
    }

    public String getOperatingSystemName() {
        return this.operatingSystemName;
    }

    public void setOperatingSystemName(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
    }

    @Override
    public String toString() {
        return "OperatingSystem{" +
                "operatingSystemName='" + operatingSystemName + '\'' +
                '}';
    }
}
