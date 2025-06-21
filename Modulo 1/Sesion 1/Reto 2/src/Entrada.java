public class entrada {
    String nombre_evento;
    double precio_entrada;

    //constructor
    public entrada(String evento, double precio) {
        this.nombre_evento = evento;
        this.precio_entrada = precio;
    }

    //metodo para mostrar datos de entrada
    public void mostrarInformacion(){
        System.out.println("Evento: " + nombre_evento + " | Precio: $" + precio_entrada);
    }
}
