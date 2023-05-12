import java.util.*;

public class Flight {
    private String flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private Date departureTime;
    private Date arrivalTime;
    private double price;

    public Flight(String flightNumber, String departureAirport, String arrivalAirport,
                  Date departureTime, Date arrivalTime, double price) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
    }

    // Getters and setters
    // ...

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", price=" + price +
                '}';
    }
}

public class Passenger {
    private String name;
    private String email;

    public Passenger(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and setters
    // ...

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

public class Booking {
    private Flight flight;
    private Passenger passenger;

    public Booking(Flight flight, Passenger passenger) {
        this.flight = flight;
        this.passenger = passenger;
    }

    // Getters and setters
    // ...

    @Override
    public String toString() {
        return "Booking{" +
                "flight=" + flight +
                ", passenger=" + passenger +
                '}';
    }
}

public class AirlineTicketBookingSystem {
    private List<Flight> flights;
    private List<Booking> bookings;

    public AirlineTicketBookingSystem() {
        flights = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void bookTicket(Flight flight, Passenger passenger) {
        Booking booking = new Booking(flight, passenger);
        bookings.add(booking);
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public static void main(String[] args) {
        AirlineTicketBookingSystem bookingSystem = new AirlineTicketBookingSystem();

        // Create flights
        Flight flight1 = new Flight("F123", "Airport A", "Airport B",
                new Date(), new Date(), 100.0);
        Flight flight2 = new Flight("F456", "Airport C", "Airport D",
                new Date(), new Date(), 150.0);

        // Add flights to the booking system
        bookingSystem.addFlight(flight1);
        bookingSystem.addFlight(flight2);

        // Create passengers
        Passenger passenger1 = new Passenger("John", "john@example.com");
        Passenger passenger2 = new Passenger("Jane", "jane@example.com");

        // Book tickets
        bookingSystem.bookTicket(flight1, passenger1);
        bookingSystem.bookTicket(flight2, passenger2);

        // Retrieve bookings
        List<Booking> bookings = bookingSystem.getBookings();

        // Print bookings
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }
}

