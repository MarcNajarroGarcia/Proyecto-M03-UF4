package models;

public class Amigos extends Contacto{
    private String cumpleaños;
    private String pais;

    public Amigos(String nombre, String apellido, String telefono, String correo, String direccion, String cumpleaños, String pais) {
        super(nombre, apellido, telefono, correo, direccion, cumpleaños);
        this.cumpleaños = cumpleaños;
        this.pais = pais;
    }

    public String getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(String cumpleaños) {
        this.cumpleaños = cumpleaños;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Amigos{" +
                "cumpleaños='" + cumpleaños + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
