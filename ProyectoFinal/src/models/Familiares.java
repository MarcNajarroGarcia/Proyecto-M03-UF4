package models;

public class Familiares extends Contacto {
    private String nombre;
    private String apellido;
    private String telefono;
    private String cumpleaños;
    private String direccion;
    private Parentesco parentesco;

    public Familiares(String nombre, String apellido, String telefono, String correo, String direccion, String cumpleaños, Parentesco parentesco) {
        super(nombre, apellido, telefono, correo, direccion, cumpleaños);
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cumpleaños = cumpleaños;
        this.direccion = direccion;
        this.parentesco = parentesco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(String cumpleaños) {
        this.cumpleaños = cumpleaños;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Parentesco getParentesco() {
        return parentesco;
    }

    public void setParentesco(Parentesco parentesco) {
        this.parentesco = parentesco;
    }


    @Override
    public String toString() {
        return "Familiares{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cumpleaños='" + cumpleaños + '\'' +
                ", direccion='" + direccion + '\'' +
                ", parentesco=" + parentesco +
                '}';
    }
}