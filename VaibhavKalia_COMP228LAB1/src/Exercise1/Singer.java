package Exercise1;

public class Singer {
    private String name;
    private String address;
    private int numAlbumsPublished;
    private int id;
    private String dateOfBirth;


    public Singer() {
        this.name = "Unknown";
        this.address = "Unknown";
        this.numAlbumsPublished = 0;
        this.id = 0;
        this.dateOfBirth = "Unknown";

    }
    public Singer(int id) {
        this.id = id;
    }
    public Singer(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Singer(int id, String name, String address) {
        this(id, name);
        this.address = address;
    }
    public Singer(int id, String name, String address, String dateOfBirth) {
        this(id, name, address);
        this.dateOfBirth = dateOfBirth;
    }

    // Constructor with 5 arguments
    public Singer(int id, String name, String address, String dateOfBirth, int numAlbumsPublished) {
        this(id, name, address, dateOfBirth);
        this.numAlbumsPublished = numAlbumsPublished;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumAlbumsPublished() {
        return numAlbumsPublished;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setNumAlbumsPublished(int numAlbumsPublished) {
        this.numAlbumsPublished = numAlbumsPublished;
    }
    public void setAll(int id, String name, String address, String dateOfBirth, int numAlbumsPublished) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.numAlbumsPublished = numAlbumsPublished;
    }
}