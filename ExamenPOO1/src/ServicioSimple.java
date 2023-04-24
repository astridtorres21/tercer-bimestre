public class ServicioSimple extends Servicio {
    private double precioBase;
    private boolean colocacion;

    public ServicioSimple(String nombre, String descripcion, Double precioBase, Boolean colocacion) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.colocacion = colocacion;
    }

    @Override
    public Double calcularPrecio() {
        if (colocacion == true){
            return precioBase += precioBase * 0.10;
        } else {
            return precioBase;
        }
    }
}
