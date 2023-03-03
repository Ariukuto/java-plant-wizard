import java.util.ArrayList;

public class Answers {
    public static Pflanzenart pflanzenart;
    public static int winterHaerteZone;
    public static Pflegestufe pflegestufe;
    public static Exposition exposition;
    public static Laubphase laubphase;
    public static ArrayList<Laubfarbe> laubfarben = new ArrayList<Laubfarbe>();
    public static ArrayList<Bluetenfarbe> bluetenfarben = new ArrayList<Bluetenfarbe>();
    
    public static void show() {
        System.out.println("Sie haben folgende Antworten ausgewählt");
        System.out.println(
            "Pflanzenart: " + pflanzenart + "\n" +
            "winterHaerteZone: " +  winterHaerteZone + "\n" +
            "pflegestufe: " +  pflegestufe + "\n" +
            "exposition: " +  exposition + "\n" + 
            "laubphase: " +  laubphase + "\n" +
            "laubfarben: " +  laubfarben + "\n" + 
            "bluetenfarben: " +  bluetenfarben + "\n"
        );
    }
}
