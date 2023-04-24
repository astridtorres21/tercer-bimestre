
public class ServicioFactory {
    private static ServicioFactory instance;
    private ServicioFactory(){}

    public static ServicioFactory getInstance(){
        if(instance==null){
            instance= new ServicioFactory();
        }
        return instance;
    }
    public Servicio crearServicio(String codigo) {
        switch (codigo) {
            case  "VENTAAIREACONDICIONADO":
                return new ServicioSimple("Venta aire acondicionado", "venta aire acondicionado", 65000.0, false);
            case  "COLOCACIONAIREACONDICIONADO":
                return new ServicioSimple("Colocacion aire acondicionado", "colocacion aire acondicionado", 10000.0, true);
            case "FULLAIREACONDICIONADO":
                ComboServicio comboServicio = new ComboServicio("aire acondicionado", "completo", 10);
                comboServicio.agregarServicio(crearServicio("VENTAAIREACONDICIONADO"));
                comboServicio.agregarServicio(crearServicio("COLOCACIONAIREACONDICIONADO"));
                return comboServicio;

        }
        return null;
            }
 }

