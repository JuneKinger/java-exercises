package exercises.Java3_7;

public class Laptop extends Computer{

    private String color;
    private double screenSize;
    private int numOfPorts;

    public Laptop(String cpu, String storage, String brand, int ramInGigabytes, String color, double screenSize, int numOfPorts) {
        super(cpu, storage, brand, ramInGigabytes);
        this.color = color;
        this.screenSize = screenSize;
        this.numOfPorts = numOfPorts;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getNumOfPorts() {
        return numOfPorts;
    }

    public void setNumOfPorts(int numOfPorts) {
        this.numOfPorts = numOfPorts;
    }

}
