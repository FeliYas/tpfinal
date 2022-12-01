package mundial;

public class Resultado {
    private int golesLocal;
    private int golesVisitante;

    //GENERO SOBRE CARGA POR SI EMPATA NO HAY GOLES NO AGREGAR EL RESULTADO

    public Resultado() {
        setGolesVisitante(0);
        setGolesLocal(0);
    }
    public Resultado(int golesLocal, int golesVisitante) {
        setGolesVisitante(golesVisitante);
        setGolesLocal(golesLocal);
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public boolean ganoLocal(){
        if (getGolesLocal()>getGolesVisitante());
        return true;
        }
    public boolean empate(){
        if (getGolesLocal()==getGolesVisitante());
        return true;
    }
}
