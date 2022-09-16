package practico2.pkg0;

public class Ciudad {

    private String nombre;

    private String ruta;

    private int kmRuta;

    public Ciudad(String nombre, String ruta, int kmRuta) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.kmRuta = kmRuta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getKmRuta() {
        return kmRuta;
    }

    public void setKmRuta(int kmRuta) {
        this.kmRuta = kmRuta;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", ruta=" + ruta + ", kmRuta=" + kmRuta + '}';
    }

  
}
