public class Demo {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria("Pizza Loca");

        TiposDePizzaFactory fabricaPizza= TiposDePizzaFactory.getInstance();
        pizzeria.agregarPizzas(fabricaPizza.crearPizza("Mozarella"));
        pizzeria.agregarPizzas(fabricaPizza.crearPizza("Especial"));
        pizzeria.agregarPizzas(fabricaPizza.crearPizza("Anana"));
        pizzeria.agregarPizzas(fabricaPizza.crearPizza("Loca"));

        pizzeria.mostrarPizzas();
    }
}