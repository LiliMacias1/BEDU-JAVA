public class CentralEmergencias {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Juan");
        Patrulla patrulla = new Patrulla("Laura");
        UnidadBomberos bomberos = new UnidadBomberos("Marco");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }
}