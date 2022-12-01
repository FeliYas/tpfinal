package mundial;

import java.util.ArrayList;

public class Llave extends EtapaMundial{
private String descripcionEtapa;

    //agregar el super de etapamundial al constuctor

    public Llave(String descripccionEtapa){
        setDescripcionEtapa(descripccionEtapa);
    }



    public Llave(String descripccionEtapa, ArrayList<Equipo> equipos){
        setDescripcionEtapa(descripccionEtapa);
        ArrayList<Partido> partidos = new ArrayList<>();
        /// lo genero

    }

    @Override
    public void addPartido(Partido partido) {

    }

    public String getEquiposQueAvanzan(){
        return this.getEquiposQueAvanzan();
    }

    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }
}
