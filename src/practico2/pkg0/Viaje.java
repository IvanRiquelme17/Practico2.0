package practico2.pkg0;

public class Viaje {

    private Ciudad origen;

    private Ciudad destino;

    private Vehiculo vehiculo;

    private int peajes;

    private Double distancia;

    public Viaje(Ciudad origen, Ciudad destino, Vehiculo vehiculo, int peajes, Double distancia) {
    }

    public Viaje(Ciudad origen, Ciudad destino, Vehiculo vehiculo, int peajes) {
    }

    public void calcularDistancia() {
    }

    public Double costoPeaje() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Double costoCombustible() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Double costoTotal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
