public class Paciente {
    // Atributos
    String nombre;
    int edad;
    String expediente;

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + expediente);
    }
}
