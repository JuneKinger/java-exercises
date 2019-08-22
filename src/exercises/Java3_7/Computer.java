package exercises.Java3_7;

public class Computer extends AbstractEntity{
    private String cpu;
    private String storage;
    private String brand;
    private int ramInGigabyes;

    public Computer(String cpu, String storage, String brand, int ramInGigabyes) {
        this.cpu = cpu;
        this.storage = storage;
        this.brand = brand;
        this.ramInGigabyes = ramInGigabyes;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ramInGigabyes;
    }

    public void setRam(int ram) {
        this.ramInGigabyes = ramInGigabyes;
    }

    @Override
    public String toString() {
        return ("Id: " + id + " Cpu: " + cpu + " Storage: " + storage + " Brand: " + brand + " Ram: "+ ramInGigabyes);
    }
}

