package models;

public class Trabajo extends Contacto {
    private String empresa;
    private Puesto puesto;
    private String telefonoEmpresa;

    public Trabajo(String nombre, String apellido, String telefono, String correo, String direccion, String cumpleaños, String empresa, Puesto puesto, String telefonoEmpresa) {
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

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    @Override
    public String toString() {
        return "Trabajo{" +
                "empresa='" + empresa + '\'' +
                ", puesto=" + puesto +
                ", telefonoEmpresa='" + telefonoEmpresa + '\'' +
                '}';
    }
}
