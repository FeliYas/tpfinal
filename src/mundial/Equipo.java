package mundial;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private int puntaje;

    public Equipo(String nombre) {
        setNombre(nombre);
        setPuntaje(puntaje);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
