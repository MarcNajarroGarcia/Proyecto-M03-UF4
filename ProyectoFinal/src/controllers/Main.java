package controllers;

import models.AgendaContactos;
import models.Contacto;

public class Main {



    public static void main(String[] args) {
        AgendaContactos a = new AgendaContactos();
        do{
            Contacto c = crearContacto();
            a.anadirContacto(c);
            a.eliminarContacto(c);
            a.modificarContacto(c);
        }while (utils.utilities.leerString("¿Quieres añadir otro contacto? (si/no)").equals("si"));


        }


        public static AgendaContactos crearAgenda(){
            AgendaContactos a = new AgendaContactos();
            return a;
        }


        public static Contacto crearContacto(){
            Contacto c;
            String nombre = utils.utilities.leerString("Escribe el nombre del contacto");
            String apellido = utils.utilities.leerString("Escribe el apellido del contacto");
            String telefono = utils.utilities.leerString("Escribe el telefono del contacto");
            String email = utils.utilities.leerString("Escribe el email del contacto");
            String direccion = utils.utilities.leerString("Escribe la direccion del contacto");
            String cumpleaños = utils.utilities.leerString("Escribe el cumpleaños del contacto");
            c = new Contacto(nombre, apellido, telefono, email, direccion, cumpleaños);
            System.out.println(c);
            return c;

        }
}