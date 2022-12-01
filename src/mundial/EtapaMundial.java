package mundial;

import java.util.ArrayList;

public class EtapaMundial {
    private String descripccionEtapa;
    private ArrayList partido;

    public EtapaMundial(String descripccionEtapa, ArrayList partido){
        setDescripccionEtapa(descripccionEtapa);
        setPartido(partido);
    }

    public String getDescripccionEtapa() {
        return descripccionEtapa;
    }

    public void setDescripccionEtapa(String descripccionEtapa) {
        this.descripccionEtapa = descripccionEtapa;
    }

    public ArrayList getPartido() {
        return partido;
    }

    public void setPartido(ArrayList partido) {
        this.partido = partido;
    }

    public String getEquiposQueAvanzan(){
        return this.getEquiposQueAvanzan();
    }
}
