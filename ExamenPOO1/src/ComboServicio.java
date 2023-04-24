import java.util.ArrayList;
import java.util.List;

public class ComboServicio extends Servicio{

    private List<Servicio> servicioList;
    private Integer descuento;

    public ComboServicio(String nombre, String descripcion, Integer descuento) {
        super(nombre, descripcion);
        this.descuento = descuento;
        servicioList = new ArrayList<>();
    }
    public void agregarServicio(Servicio servicio){
        servicioList.add(servicio);
    }
    @Override
    public Double calcularPrecio() {
        Double precioTotal=0.0;
        for (Servicio servicio : servicioList) {
            precioTotal += servicio.calcularPrecio();
        }
        return precioTotal-(precioTotal*descuento/100);
      }
    }
