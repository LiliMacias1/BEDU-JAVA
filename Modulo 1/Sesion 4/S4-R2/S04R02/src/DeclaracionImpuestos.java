public class DeclaracionImpuestos {
}
public record DeclaracionImpuestos(String rfcContribuyente, double montoDeclarado) {

    // El constructor y los campos son implícitamente públicos y finales
    // por lo tanto, no necesitamos definir getters manualmente.
}