import mundial.*;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mundial de QATAR 2022");

        Equipo qatar = new Equipo("Qatar");
        Equipo ecuador = new Equipo("Ecuador");
        Equipo holanda = new Equipo("Holanda");
        Equipo senegal = new Equipo("Senegal");

        ArrayList<Equipo> semifinalista = new ArrayList<>();
        semifinalista.add(qatar);
        semifinalista.add(ecuador);
        semifinalista.add(holanda);
        semifinalista.add(senegal);

        //lo creo porque no hay algo previo (getEquiposQueAvanzan() de cuartos)

        Llave seminifinal = new Llave("Seminfinal", semifinalista);
        ArrayList<Equipo> finalistas = seminifinal.getEquiposQueAvanzan();

        Llave finalMundial = new Llave("Final", finalistas);
        finalMundial.getEquiposQueAvanzan();

        Grupo grupoA = new Grupo("fase de grupos", "Grupo A");
        grupoA.addPartido(new Partido(new Date(2022, 11,20), qatar, ecuador, new Resultado(0,2)));


    }
}
