package mundial;

import java.util.ArrayList;

public class Grupo extends EtapaMundial {
    private String nombre;

    public Grupo(String descripccionEtapa, String nombre) {
        super(descripccionEtapa);

    }


    @Override
    public void addPartido(Partido partido) {
        getPartido().add(partido);
    }

    public String getEquiposQueAvanzan(){
        return this.getEquiposQueAvanzan();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
