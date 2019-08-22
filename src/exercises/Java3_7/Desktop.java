package exercises.Java3_7;

public class Desktop extends Computer {

    private String color;

    public Desktop(String cpu, String storage, String brand, int ramInGigabytes, String color) {
        super(cpu, storage, brand, ramInGigabytes);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
