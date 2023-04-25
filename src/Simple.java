public class Simple extends TiposDePizza {
    private Double precioBase;
    private Boolean estaPromocion;

    public Simple(String nombre, String descripcion, Double precioBase, Boolean estaPromocion) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.estaPromocion = estaPromocion;
    }

    @Override
    public Double calcularPrecio() {
        if (estaPromocion) precioBase -= precioBase * 0.10;
        return precioBase;
    }


}
