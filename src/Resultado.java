public class Resultado {
    private int golesLocal;
    private int golesVisitante;

    public Resultado(int golesLocal, int golesVisitante) {
        setGolesVisitante(0);
        setGolesLocal(0);
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
