package exercises.Java3_7;

public class Smartphone extends Computer {
    String typeOfNetwork;
    int sizeInInches;

    public Smartphone(String cpu, String storage, String brand, int ramInGigabytes, String typeOfNetwork, int sizeInInches) {
        super(cpu, storage, brand, ramInGigabytes);
        this.typeOfNetwork = typeOfNetwork;
        this.sizeInInches = sizeInInches;
    }

    public String getTypeOfNetwork() {
        return typeOfNetwork;
    }

    public void setTypeOfNetwork(String typeOfNetwork) {
        this.typeOfNetwork = typeOfNetwork;
    }

    public int getSizeInInches() {
        return sizeInInches;
    }

    public void setSizeInInches(int sizeInInches) {
        this.sizeInInches = sizeInInches;
    }

}
