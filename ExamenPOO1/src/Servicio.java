public abstract class Servicio {
    private String nombre, descripcion;

    public Servicio(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public abstract Double calcularPrecio();

    @Override
    public String toString() {
        return "Servicio: "+nombre+ "Precio: $" + calcularPrecio();
    }
}