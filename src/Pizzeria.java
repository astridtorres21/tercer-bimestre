import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private String nombre;
    public List<TiposDePizza> tiposDePizzaList;

    public Pizzeria(String nombre) {
        this.nombre = nombre;
        tiposDePizzaList = new ArrayList<>();
    }

    public void agregarPizzas (TiposDePizza tiposDePizza){
        tiposDePizzaList.add(tiposDePizza);
    }
    public void quitarPizzas (TiposDePizza tiposDePizza){
        tiposDePizzaList.remove(tiposDePizza);
    }

    public void mostrarPizzas(){
        for (TiposDePizza tiposDePizza : tiposDePizzaList) {
            System.out.println(tiposDePizza);
        }
    }

}
