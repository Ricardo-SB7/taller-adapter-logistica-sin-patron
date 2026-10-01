package co.edu.unicordoba.adapter.logistica_sin_patron.model;

/**
 * Servicio nativo de envíos locales.
 * Espera dirección (String) y peso en kilogramos (double).
 */
public class ServicioEnvioLocal {
    public String enviarPaqueteLocal(String direccion, double pesoKg) {
        return "[LOGÍSTICA LOCAL] Paquete enviado a: " + direccion + " (" + pesoKg + " kg)";
    }
}