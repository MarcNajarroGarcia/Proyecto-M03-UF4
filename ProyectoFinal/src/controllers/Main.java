package controllers;

import java.util.ArrayList;

import models.Contacto;
import utils.utilities;

public class Main {
    public static void main(String[] args) {
        int opcion;
        ArrayList<Contacto> contactos = new ArrayList<>();

        do {
            System.out.println("");
            System.out.println("Bienvenido a tu agenda de contactos");
            System.out.println("");
            opcion = utilities.leerInt("¿Qué quieres hacer? \n\t1.Crear contacto \n\t2.Eliminar contacto\n\t3.Modificar contacto\n\t4.Salir");
            switch (opcion) {

                case 1:
                    //crea un contacto nuevo y lo guarda en el arraylist de contactos
                    Contacto nuevoContacto = crearContacto();
                    contactos.add(nuevoContacto);
                    break;

                case 2:

                    //si el arraylist de contactos esta vacio, porque el usuario no ha creado ninguno, no se puede modificar ningun contacto, por lo tanto se muestra un mensaje y se muestra que hay 0 contactos creados en el arraylist y vuelve al menu principal
                    if (contactos.isEmpty()) {
                        System.out.println("Crea un contacto para poder eliminar alguno");
                    } else {
                        eliminarContacto(contactos);
                    }
                    break;

                case 3:

                    //si el arraylist de contactos esta vacio, porque el usuario no ha creado ninguno, no se puede modificar ningun contacto, por lo tanto se muestra un mensaje y se muestra que hay 0 contactos creados en el arraylist y vuelve al menu principal
                    if (contactos.isEmpty()) {
                        System.out.println("Crea un contacto para poder modificar alguno");
                    } else {
                        modificarContacto(contactos);
                    }
                    break;

                case 4:
                    System.out.println("Chau");
                    break;

                default:
                    System.out.println("Opción no válida!");
            }

            // Muestra los contactos que estan creados anteriormente y estan guardados en el arraylist de contactos
            System.out.println("\nContactos:");
            for (Contacto c : contactos) {
                System.out.println(c);
            }

            //siempre vuelve a preguntar si quiere crear, eliminar o modificar hasta que se seleccione la opcion 4 que es la de salir
        } while (opcion != 4);

    }

    /**
     * Metodo para crear un contacto, el usuario tiene que ingresar todos los datos para el contacto que quiere crear, el contacto creado se guarda en el arraylist de contactos, y asi succesivamente. Si el usuario deja en blanco un espacio, se queda en blanco. Luego se podria modificar en modificar un contacto. Con control de valores.
     * @return Muestra el contacto creado
     */
    public static Contacto crearContacto() {
        String nombre = utilities.leerString("Escribe el nombre del contacto: ");
        String apellido = utilities.leerString("Escribe el apellido del contacto: ");
        String telefono = utilities.leerString("Escribe el teléfono del contacto: ");
        String email = utilities.leerString("Escribe el email del contacto: ");
        String direccion = utilities.leerString("Escribe la dirección del contacto: ");
        String cumpleaños = utilities.leerString("Escribe el cumpleaños del contacto: ");
        Contacto c = new Contacto(nombre, apellido, telefono, email, direccion, cumpleaños);
        System.out.println("Contacto creado: " + c);
        return c;
    }


    /**
     * Metodo para eliminar un contacto, el usuario tiene que poner un numero de contacto que este en la lista, si pone un numero que no esta se le vuelve a mostrar el menu principal. Con control de valores.
     * @param contactos
     */
    public static void eliminarContacto(ArrayList<Contacto> contactos) {
        System.out.println("\nLista de contactos:");
        //este for muestra los contactos que estan en el arraylist de contactos, para que empieze a seleccionar desde el 1 y no desde el 0 hacemos un i +1
        for (int i = 0; i < contactos.size(); i++) {
            System.out.println((i + 1) + "- " + contactos.get(i));
        }
        int index = utilities.leerInt("Ingresa el número del contacto que quieres eliminar: ");
        if (index < 1 || index > contactos.size()) {
            System.out.println("El número ingresado no es válido.");
        } else {
            Contacto eliminado = contactos.remove(index - 1);
            System.out.println("Contacto eliminado: " + eliminado);
        }
    }


    /**
     * Metodo para modificar los datos de un contacto, el usuario tiene que poner un numero de contacto que este en la lista, si pone un numero que no esta se le vuelve a mostrar el menu principal. Con control de valores.
     * @param contactos
     */
    public static void modificarContacto(ArrayList<Contacto> contactos) {
        System.out.println("\nLista de contactos:");
        for (int i = 0; i < contactos.size(); i++) {
            System.out.println((i + 1) + "- " + contactos.get(i));
        }

        //El usuario ingresa el numero del contacto que quiere modificar, tiene que ingresar un numero que este en la lista, si pone un numero que no esta se le vuelve a mostrar el menu principal, asi hasta que seleccione un nuemro valido
        int index = utilities.leerInt("Ingresa el número del contacto que quieres modificar: ");

        //Lo que hace el if es que si el usuario no ingresa nada, se mantiene el dato que ya tenia del contacto
        if (index < 1 || index > contactos.size()) {
            System.out.println("El número ingresado no es válido.");
        } else {
            Contacto contacto = contactos.get(index - 1);
            System.out.println("Contacto seleccionado: " + contacto);


            String nombre = utilities.leerString("Escribe el nuevo nombre del contacto (deja vacío para mantener el nombre actual): ");
            if (!nombre.isEmpty()) {
                contacto.setNombre(nombre);
            }

            String apellido = utilities.leerString("Escribe el nuevo apellido del contacto (deja vacío para mantener el apellido actual): ");
            if (!apellido.isEmpty()) {
                contacto.setApellido(apellido);
            }

            String telefono = utilities.leerString("Escribe el nuevo teléfono del contacto (deja vacío para mantener el teléfono actual): ");
            if (!telefono.isEmpty()) {
                contacto.setTelefono(telefono);
            }

            String email = utilities.leerString("Escribe el nuevo email del contacto (deja vacío para mantener el email actual): ");
            if (!email.isEmpty()) {
                contacto.setEmail(email);
            }

            String direccion = utilities.leerString("Escribe la nueva dirección del contacto (deja vacío para mantener la dirección actual): ");
            if (!direccion.isEmpty()) {
                contacto.setDireccion(direccion);
            }

            String cumpleaños = utilities.leerString("Escribe el nuevo cumpleaños del contacto (deja vacío para mantener el cumpleaños actual): ");
            if (!cumpleaños.isEmpty()) {
                contacto.setCumpleaños(cumpleaños);
            }

            System.out.println("Contacto con los datos actualizados: " + contacto);
        }
    }

}
