import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear objeto Paciente
        Paciente paciente = new Paciente();

        // Solicitar y asignar datos
        System.out.print("Paciente: Lena Marie ");
        paciente.nombre = sc.nextLine();

        System.out.print("Ingresa la edad del paciente: ");
        paciente.edad = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        System.out.print("Ingresa el número de expediente: ");
        paciente.expediente = sc.nextLine();

        // Mostrar la información
        paciente.mostrarInformacion();

        sc.close();
    }
}
