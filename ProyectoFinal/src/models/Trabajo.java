package models;

public class Trabajo extends Contacto {
    private String empresa;
    private String puesto;
    private String telefonoEmpresa;

    //el final lo hemos usado para que solo pueda ser el contacto de españa
    private final String pais = "Españita";


    public Trabajo(String nombre, String apellido, String telefono, String correo, String direccion, String cumpleaños, String empresa, String puesto, String telefonoEmpresa) {
        super(nombre, apellido, telefono, correo, direccion, cumpleaños);
        this.empresa = empresa;
        this.puesto = puesto;
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }


    //TODO: AÑADIR LOS DATOS QUE FALTAN DE CONTACTO AL TOSTRING

    @Override
    public String toString() {
        return "Trabajo{" +
                "empresa='" + empresa + '\'' +
                ", puesto='" + puesto + '\'' +
                ", telefonoEmpresa='" + telefonoEmpresa + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
