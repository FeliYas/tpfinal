package mundial;

import java.util.ArrayList;

public abstract class EtapaMundial {
    private String descripccionEtapa;
    private ArrayList<Partido> partido;

    public EtapaMundial(String descripccionEtapa){
        setDescripccionEtapa(descripccionEtapa);
    }

    public abstract void addPartido(Partido partido);

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
