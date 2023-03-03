import java.util.ArrayList;

public class Answers {
    public static Pflanzenart type;
    public static int winterHardinessZone;
    public static Pflegestufe careLevel;
    public static Exposition exposition;
    public static Laubphase foliagePhase;
    public static ArrayList<Laubfarbe> foliageColors = new ArrayList<Laubfarbe>();
    public static ArrayList<Bluetenfarbe> flowerColors = new ArrayList<Bluetenfarbe>();
    
    public static void show() {
        System.out.println("Sie haben folgende Antworten ausgewählt");
        System.out.println(
            "Pflanzenart: " + type + "\n" +
            "winterHaerteZone: " +  winterHardinessZone + "\n" +
            "pflegestufe: " +  careLevel + "\n" +
            "exposition: " +  exposition + "\n" + 
            "laubphase: " +  foliagePhase + "\n" +
            "laubfarben: " +  foliageColors + "\n" + 
            "bluetenfarben: " +  flowerColors + "\n"
        );
    }
}
