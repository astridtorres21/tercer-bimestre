public class Main {
    public static void main(String[] args) {

        // Crear servicios y agregarlos a la lista de la empresa
        Empresa empresa = new Empresa();
        ServicioFactory fabricaServicio = ServicioFactory.getInstance();

        empresa.agregarServicio(fabricaServicio.crearServicio("VENTAAIREACONDICIONADO"));
        empresa.agregarServicio(fabricaServicio.crearServicio("COLOCACIONAIREACONDICIONADO"));
        empresa.agregarServicio(fabricaServicio.crearServicio("FULLAIREACONDICIONADO"));

        empresa.mostrarServicio();

    }
}

