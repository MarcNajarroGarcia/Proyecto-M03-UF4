package models;

import java.util.ArrayList;

public class AgendaContactos {
    private ArrayList<Contacto> contactos;

    public AgendaContactos(){
        this.contactos = new ArrayList<Contacto>();
    }


    //El boolean dice si añadirContacto ha funcionado o no con true o false
    public boolean anadirContacto(Contacto c){
        for (int i = 0; i < this.contactos.size(); i++) {
            if (this.contactos.get(i) == null){
                this.contactos.set(i, c);
                return true;
            }
        }
        return false;
    }

    //El boolean dice si eliminarContacto ha funcionado o no con true o false
    public boolean eliminarContacto(Contacto c){
        for (int i = 0; i < this.contactos.size(); i++) {
            if (this.contactos.get(i) == c){
                this.contactos.set(i, null);
                return true;
            }
        }
        return false;
    }

    //El boolean dice si modificarContacto ha funcionado o no con true o false
    public boolean modificarContacto(Contacto c){
        for (int i = 0; i < this.contactos.size(); i++) {
            if (this.contactos.get(i) == c){
                this.contactos.set(i, c);
                return true;
            }
        }
        return false;
    }


}
