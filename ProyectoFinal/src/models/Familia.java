package models;

public class Familia extends Contacto{

    private Parentesco relacion;
    private String cumpleaños;

    public Familia(String nombre, String apellido, String telefono, String correo, String direccion, String cumpleaños, Parentesco relacion, String pais) {
        super(nombre, apellido, telefono, correo, direccion, cumpleaños);
        this.relacion = relacion;
        this.cumpleaños = cumpleaños;
    }

    public Parentesco getRelacion() {
        return relacion;
    }

    public void setRelacion(Parentesco relacion) {
        this.relacion = relacion;
    }

    public String getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(String cumpleaños) {
        this.cumpleaños = cumpleaños;
    }

    @Override
    public String toString() {
        return "Familia{" +
                "relacion='" + relacion + '\'' +
                ", cumpleaños='" + cumpleaños + '\'' +
                '}';
    }
}
