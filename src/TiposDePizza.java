public abstract  class TiposDePizza {
    private String nombre;
    private String descripcion;

    public TiposDePizza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPrecio();

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", Precio ='" + calcularPrecio() + '\'' +
                '}';
    }
}
