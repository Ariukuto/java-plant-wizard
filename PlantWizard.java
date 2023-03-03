
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author: Sven Büttner
 * @web: https://buettner-sven.de/
 * @date: 02.02.2023
 */
public class PlantWizard
{   
    // Liste alle Pflanzen
    private static ArrayList<Plant> plants = new ArrayList<Plant>();
    
    /**
     * Wird als erstes ausgeführt 
     */
    public static void main(String[] args) 
    {
  
        // Holt alle Pflanzen
        getPlantsFromDatabase();
        // Führt alle Fragen an den Benutzer aus
        Questions.execute();
        // Zeigt alle Antworten des Nutzers
        Answers.show();

        System.out.println(" Bitte beenden sie das Programm mit der Eingabe-Taste.");
        EinAus.readInt();
    }
    
    /**
     * Soll Datenbankabfrage faken 
     */
    private static void getPlantsFromDatabase() 
    {
        plants.add(new Plant("Ceratodon Purpureus", "Moos", "6", "gering", "gruen braun rosa", "gruen braun", "sonnig halbschattig", "immergruen"));
        plants.add(new Plant("Ceratodon Purpureus", "Moos", "6", "gering", "gruen braun rosa", "gruen braun", "sonnig halbschattig", "immergruen"));
        plants.add(new Plant("Ceratodon Purpureus", "Moos", "6", "gering", "gruen braun rosa", "gruen braun", "sonnig halbschattig", "immergruen"));
        plants.add(new Plant("Ceratodon Purpureus", "asfd", "6", "gering", "gruen braun rosa", "gruen braun", "sonnig halbschattig", "immergruen"));
        plants.add(new Plant("Ceratodon Purpureus", "Moos", "6", "gering", "gruen braun rosa", "gruen braun", "sonnig halbschattig", "immergruen"));
        plants.add(new Plant("Ceratodon Purpureus", "Moos", "6", "gering", "gruen braun rosa", "gruen braun", "sonnig halbschattig", "immergruen"));
        plants.add(new Plant("Ceratodon Purpureus", "Moos", "6", "gering", "gruen braun rosa", "gruen braun", "sonnig halbschattig", "immergruen"));
    }
    
    public void filter() {
   
    }
    
// Ende
}
