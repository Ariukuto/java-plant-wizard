class Questions
{
    public static void execute() {
        plantType();
        System.out.println("------------------------------------------------------------------------------------------------");
        winterHardinessZone();
        System.out.println("------------------------------------------------------------------------------------------------");
        careLevel();
        System.out.println("------------------------------------------------------------------------------------------------");
        exposition();
        System.out.println("------------------------------------------------------------------------------------------------");
        foliagePhase();
        System.out.println("------------------------------------------------------------------------------------------------");
        foliageColors();
        System.out.println("------------------------------------------------------------------------------------------------");
        flowerColors();
        System.out.println("------------------------------------------------------------------------------------------------");
    }
    
    private static void plantType() {
        System.out.println("Welche Pflanzenart bevorzugen Sie? Geben Sie bitte die der Antwort entsprechenden Zahl ein! \n 1.Moos \n 2.Staude \n 3.Gehölz");
        Pflanzenart value = null;
        int number = EinAus.readInt();
        switch(number) {
          case 1:
            value = Pflanzenart.Moos;
            break;
          case 2:
            value = Pflanzenart.Staude;
            break;
          case 3:
              value = Pflanzenart.Gehoelz;
            break;
          default:
            System.out.println("Bitte nur die vorgeschlagenen Zahlen eingeben");
            plantType();
        }
        
        if(value != null) {
            Answers.pflanzenart = value;
            System.out.println("Sie haben " + Answers.pflanzenart + " ausgewählt \n"); 
        }

    }
    
    private static void winterHardinessZone() {
        System.out.println("Welche Winterhärtezone haben sie Vorort? 4-8?");
        int number = EinAus.readInt();
        if(number < 4 || number > 8) {
            System.out.println("Bitte nur die vorgeschlagenen Zahlen eingeben");
            winterHardinessZone();
        } else {
            Answers.winterHaerteZone = number;
            System.out.println("Sie haben " + Answers.winterHaerteZone + " ausgewählt \n");
        }
    }
    
    private static void careLevel() {
        System.out.println("Wie viel Pflege sind sie bereit in ihre Pflanzen zu investieren? 1.Wenig 2.Mittel 3.Viel");
        Pflegestufe value = null;
        int number = EinAus.readInt();
        switch(number) {
            case 1:
                value = Pflegestufe.Wenig;
                break;
            case 2:
                value = Pflegestufe.Mittel;
                break;
            case 3:
                value = Pflegestufe.Viel;
                break;
            default:
                System.out.println("Bitte nur die vorgeschlagenen Zahlen eingeben");
                careLevel();
        }
        if(value != null) {
            Answers.pflegestufe = value;
            System.out.println("Sie haben " + Answers.pflegestufe + " ausgewählt \n"); 
        }

    }
    
    private static void exposition() {
        System.out.println("Welche Exposition liegt bei ihnen vor? 1.sonnig 2.halbschattig 3.schattig");
        Exposition value = null;
        int number = EinAus.readInt();
        switch(number) {
          case 1:
            value = Exposition.Sonnig;
            break;
          case 2:
            value = Exposition.Halbschattig;
            break;
          case 3:
              value = Exposition.Schattig;
            break;
          default:
            System.out.println("Bitte nur die vorgeschlagenen Zahlen eingeben");
            exposition();
        }
        if(value != null) {
            Answers.exposition = value;
            System.out.println("Sie haben " + Answers.exposition + " ausgewählt \n");
        }
    }
    
    private static void foliagePhase() {
        System.out.println("Welche Laubphase bevorzugen sie? 1.Sommergrün 2. immergrün 3.wintergrün");
        Laubphase value = null;
        int number = EinAus.readInt();
        switch(number) {
          case 1:
            value = Laubphase.Sommergrün;
            break;
          case 2:
            value = Laubphase.Immergrün;
            break;
          case 3:
             value = Laubphase.Wintergrün;
            break;
          default:
            System.out.println("Bitte nur die vorgeschlagenen Zahlen eingeben");
            foliagePhase();
        }
        if(value != null) {
            Answers.laubphase = value;
            System.out.println("Sie haben " + Answers.laubphase + " ausgewählt \n");
        }
        
    }
    
    private static void foliageColors() {
        System.out.println("Welche Laubfarben bevorzugen sie? \n 1.Gelb \n 2.Grün \n 3.Braun \n 4. Violett \n 5. Grau \n  6. Weiß");
        Laubfarbe value = null;
        int number = EinAus.readInt();
        switch(number) {
            case 1:
                value = Laubfarbe.Gelb;
                break;
            case 2:
                value = Laubfarbe.Grün;
                break;
            case 3:
                value= Laubfarbe.Braun;
                break;
            case 4:
                value = Laubfarbe.Violett;
                break;
            case 5:
                value = Laubfarbe.Grau;
                break;
            case 6:
                value = Laubfarbe.Weiß;
                break;
          default:
            System.out.println("Bitte nur die vorgeschlagenen Zahlen eingeben");
            foliageColors();
        }

        if(value != null) {
            Answers.laubfarben.add(value);
            System.out.println("Sie haben " + Answers.laubfarben + " ausgewählt");
            System.out.println("Möchten Sie noch eine Farbe auswählen? \n 1. Ja 2. Nein \n");
            number = EinAus.readInt();
            if(number == 1) 
                foliageColors();
        }
    }

    private static void flowerColors() {
        System.out.println("Welche Blütenfarben bevorzugen sie? 1.Braun 2.Gelb 3.Grün 4.Rosa 5.Weiß");
        Bluetenfarbe value = null;
        int number = EinAus.readInt();
        
        switch(number) {
            case 1:
                value = Bluetenfarbe.Braun;
                break;
            case 2:
                value = Bluetenfarbe.Gelb;
                break;
            case 3:
                value = Bluetenfarbe.Grün;
                break;
            case 4:
                value = Bluetenfarbe.Rosa;
                break;
            case 5:
                value = Bluetenfarbe.Weiß;
                break;
          default:
            System.out.println("Bitte nur die vorgeschlagenen Zahlen eingeben");
            flowerColors();
        }
        
        if(value != null) {
            Answers.bluetenfarben.add(value);
            System.out.println("Sie haben " + Answers.bluetenfarben + " ausgewählt");
            System.out.println("Möchten Sie noch eine Farbe auswählen? \n 1. Ja \n 2. Nein \n");
            number = EinAus.readInt();
            if(number == 1) 
                flowerColors();
        }
    }
    
// Ende
}
