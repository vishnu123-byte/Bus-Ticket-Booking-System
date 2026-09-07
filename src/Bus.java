public class Bus {
    int busNo;
    String source;
    String destination;
    int totalSeats;
    int availableSeats;

    Bus(int busNo, String source, String destination, int totalSeats) {
        this.busNo = busNo;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    void displayBus() {
        System.out.println(
            "Bus No: " + busNo +
            " | " + source + " -> " + destination +
            " | Available Seats: " + availableSeats
        );
    }
}
