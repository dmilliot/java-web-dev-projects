package technology;

public abstract class Abstract {
    private static int nextId = 1;
    private int id;

    public Abstract() {
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }
}
