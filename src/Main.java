import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Equipo qatar = new Equipo("Qatar");
        Equipo ecuador = new Equipo("Ecuador");
        Equipo holanda = new Equipo("Holanda");
        Equipo senegal = new Equipo("Senegal");
        Partido partido1 = new Partido(
                new Date(2022, 11, 20), qatar, ecuador);
        partido1.getResultado().setGolesVisitante(2);

    }
}
