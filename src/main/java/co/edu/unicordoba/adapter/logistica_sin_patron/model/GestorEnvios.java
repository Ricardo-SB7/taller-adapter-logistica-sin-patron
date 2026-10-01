package co.edu.unicordoba.adapter.logistica_sin_patron.model;

/**
 * DEFECTO DE DISEÑO (SIN PATRÓN ADAPTER):
 * Esta clase concentra toda la lógica. Para integrar un nuevo proveedor,
 * se llena de bloques 'if-else' y realiza conversiones manuales internas.
 * Violación del Principio Open/Closed (OCP) y alto acoplamiento.
 */
public class GestorEnvios {

    private final ServicioEnvioLocal servicioLocal = new ServicioEnvioLocal();
    private final ServientregaAPI servientregaAPI = new ServientregaAPI();

    public String procesarEnvio(String proveedor, String direccion, double pesoKg) {
        // DEFECTO: Uso de condicionales rígidos para acoplar clases incompatibles
        if (proveedor.equalsIgnoreCase("LOCAL")) {
            return servicioLocal.enviarPaqueteLocal(direccion, pesoKg);
        } 
        else if (proveedor.equalsIgnoreCase("SERVIENTREGA")) {
            // Conversión manual de unidades (kg -> gramos) dentro de la clase cliente
            int gramos = (int) (pesoKg * 1000);
            // Reordenamiento manual de parámetros
            return servientregaAPI.crearGuiaExterna(direccion, gramos);
        } 
        else {
            return "Error: Proveedor de logística no soportado.";
        }
    }
}