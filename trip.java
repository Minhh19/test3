public class trip {
    private String name;
    private String email;
    private String phone;
    private String destination;

    public trip(String name, String email, String phone, String destination) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.destination = destination;
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
}
