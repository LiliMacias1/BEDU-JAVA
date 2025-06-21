import java.util.Optional;
public class Factura {
    private double monto;
    private String descripcion;
    private String rfc;

    public Factura(double monto, String description, String RFC)
        this.monto = monto;
    this.descripcion = descripcion;
     this.rfc = (rfc != null) ? Optional.of(rfc) : Optional.empty();

    public String obtenerResumen() {
        String rfc = this.rfc.isPresent() ? this.rfc.get() : "[No proporcionado]";

        return " -- 📄 Factura generada --\n" +
                "Descripcion: " + this.descripcion + "\n" +
                "Monto: $" + this.monto + "\n" +
                "RFC: " + rfc + "\n";

     )
}
