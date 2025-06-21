public class Main {
    public static void main(String[] args) {
        // Create a passenger and a flight
        Pasajero pasajero1 = new Pasajero("Lalisa Manoban", "X23");
        Vuelo vuelo1 = new Vuelo("X23", "Japon", "15:33");

        // Reserve a seat using a Passenger object
        if (vuelo1.asientoReserva
        ut.println("✅ Reservación exitosa.\n");
        }

        // Show itinerary
        System.out.println(vuelo1.obtenerItinerario());

        // Cancel reservation
        vuelo1.cancelarReserva();

        // Show itinerary again
        System.out.println(vuelo1.obtenerItinerario());

        // Reserve a seat using name and passport (overloaded method)
        vuelo1.asientoReservado("Lalisa Manoban", "8123");

        // Show final itinerary
        System.out.println(vuelo1.obtenerItinerario());

    }
}