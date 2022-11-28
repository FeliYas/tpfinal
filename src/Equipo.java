import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList partidosJugados;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(ArrayList partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
}
