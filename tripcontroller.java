public class tripcontroller {
    public static void main(String[] args) {
        trip trip1 = new trip("quoc hung", "john@example.com", "123-456-7890", "Ha noi");

        System.out.println("Name: " + trip1.getName());
        System.out.println("Email: " + trip1.getEmail());
        System.out.println("Phone: " + trip1.getPhone());
        System.out.println("Destination: " + trip1.getDestination());
    }
}
