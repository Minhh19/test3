public class tripservice {
    
    public static void main(String[] args) {
        trip trip1 = new trip("quoc hung", "quoc.hung@example.com", "123-456-7890", "ha noi", 1);
        System.out.println("Name: " + trip1.getName());
        System.out.println("Email: " + trip1.getEmail());
        System.out.println("Phone: " + trip1.getPhone());
        System.out.println("Destination: " + trip1.getDestination());
        System.out.println("Trip Count: " + trip1.getTripCount());
    }
}
