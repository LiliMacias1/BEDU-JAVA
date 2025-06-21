public class Vuelo package S03.CHALLENGE_01;

public class Vuelo {
    final String codigoVuelo;
    String destino;
    String salidaHora;
    Pasajero asientoReservado;

    public Vuelo (String codigoVuelo, String destino, String salidaHora) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.salidaHora = salidaHora;
        this.asientoReservado = null;
    }


    public boolean asientoReservado(Pasajero p) {
        if (asientoReservado == null) {
            this.asientoReservado = p;
            return true;
        }
        return false;
    }


    public boolean asientoReservado(String nombre, String pasaporte) {
        return asientoReservado(new Pasajero(nombre, pasaporte));
    }

    void cancelarReserva() {
        this.asientoReservado = null;
        System.out.println("❌ Cancelar reservacion...");
    }

    String obtenerItinerario() {
        String informacionPasajero = (this.asientoReservado != null)
                ? this.asientoReservado.getName()
                : "[Sin reservación]";

        return "✈️ Itinerario de vuelos:\n" +
                "Código de vuelo: " + this.codigoVuelo + "\n" +
                "Destino: " + this.destino + "\n" +
                "Horario de salida: " + this.salidaHora + "\n" +
                "Pasajero: " + informacionPasajero + "\n";
    }
}{
}
