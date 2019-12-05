package exercises.athletes;

public abstract class Athlete {

    private String name;
    private int dedication;

    public Athlete(String name, String sport) {
        this.name = name;
        this.dedication = 100;
    }

    public abstract void train();

}
