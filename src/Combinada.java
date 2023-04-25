import java.util.ArrayList;
import java.util.List;

public class Combinada extends TiposDePizza{
    public List <TiposDePizza> tiposDePizzaList;

    public Combinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        tiposDePizzaList = new ArrayList<>();
    }

    @Override
    public Double calcularPrecio() {
        Double precioMasAlto = 0.0;
        for (TiposDePizza tiposDePizza : tiposDePizzaList) {
             Double precioActual = tiposDePizza.calcularPrecio();
             if (precioActual > precioMasAlto){
                 precioMasAlto = precioActual;
             }
        }
        return precioMasAlto;
    }

    public void agregarPizzas (TiposDePizza tiposDePizza){
        tiposDePizzaList.add(tiposDePizza);
    }

}
