public class trip {
    private String name;
    private String email;
    private String phone;
    private String destination;
    private static int tripCount = 0;
    private int tripId;

    public trip(String name, String email, String phone, String destination, int tripCount, int tripId) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.destination = destination;
        this.tripCount = tripCount;
        this.tripId = tripId;
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
    public int getTripId() {
        return tripId;
    }
}
