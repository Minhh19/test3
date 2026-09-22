public class trip {
    private String name;
    private String email;
    private String phone;
    private String destination;
    private static int tripCount = 0;

    public trip(String name, String email, String phone, String destination, int tripCount) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.destination = destination;
        this.tripCount = tripCount;
    }   
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDestination() {
        return destination;
    }
    public static int getTripCount() {
        return tripCount;
    }
}
