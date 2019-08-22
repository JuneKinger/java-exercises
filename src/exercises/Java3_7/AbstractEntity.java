package exercises.Java3_7;

public abstract class AbstractEntity {

    public static int nextId = 1;
    public int id;

    public AbstractEntity() {
        this.id = nextId;
        nextId++;
    }

}
