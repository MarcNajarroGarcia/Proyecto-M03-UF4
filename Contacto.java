package models;

import java.util.ArrayList;

public class Contacto {
        private String nombre;
        private String apellido;
        private String telefono;
        private String email;
        private String direccion;
        private String cumpleaños;


        public Contacto(String nombre, String apellido, String telefono, String email, String direccion, String cumpleaños) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.telefono = telefono;
            this.email = email;
            this.direccion = direccion;
            this.cumpleaños = cumpleaños;

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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getCumpleaños() {
            return cumpleaños;
        }

        public void setCumpleaños(String cumpleaños) {
            this.cumpleaños = cumpleaños;
        }





       //TODO: Hacer un toString
}
