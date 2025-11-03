public class User {

    private int id;
    private String name;

    // Constructor
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters (getName is the one we will "bug" test)
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
