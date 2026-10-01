package co.edu.unicordoba.adapter.logistica_sin_patron.model;

/**
 * API externa de un tercero (Servientrega).
 * Tiene métodos e interfaces incompatibles: requiere el destino primero (String)
 * y el peso obligatoriamente en gramos como entero (int).
 */
public class ServientregaAPI {
    public String crearGuiaExterna(String destino, int pesoGramos) {
        return "[SERVIENTREGA API] Guía de envío creada hacia " + destino + " por " + pesoGramos + "g.";
    }
}