public class TiposDePizzaFactory {
    private static TiposDePizzaFactory instance;

    private TiposDePizzaFactory(){}

    public static TiposDePizzaFactory getInstance(){
        if(instance==null){
            instance= new TiposDePizzaFactory();
        }
        return instance;
    }

    public TiposDePizza crearPizza(String codigo){
        switch (codigo){
            case "Mozarella":
                return new Simple("mozarella", "pizza mozarella", 700.0, true);
            case "Especial":
                return new Simple("especial", "pizza especial", 850.0, false);
            case "Anana":
                return new Simple("anana", "pizza anana", 950.0, false);
            case "Loca":
                Combinada combinada = new Combinada("loca", "mitad especial y mitad de ananá");
                combinada.agregarPizzas(crearPizza("Mozarella"));
                combinada.agregarPizzas(crearPizza("Especial"));
                combinada.agregarPizzas(crearPizza("Anana"));
                return combinada;

        }
        return null;
    }

}
