import java.util.ArrayList; 
 
 class Plant {
    public String name;
    public Pflanzenart type;
    public int winterHardinessZone;
    public Pflegestufe careLevel;
    public Exposition exposition;
    public Laubphase foliagePhase;
    public ArrayList<Laubfarbe> foliageColors = new ArrayList<Laubfarbe>();
    public ArrayList<Bluetenfarbe> flowerColors = new ArrayList<Bluetenfarbe>();
    
    // Konstruktur
    Plant(
        String name, 
        Pflanzenart type, 
        int winterHardinessZone, 
        Pflegestufe careLevel, 
        Exposition exposition, 
        Laubphase foliagePhase,
        ArrayList<Laubfarbe> foliageColors,
        ArrayList<Bluetenfarbe> flowerColors 
    ) {
        // Hier werden die Werte, die über den Konstruktur übergeben werden, an die Felder weitergeben.
        this.name = name;
        this.type = type;
        this.winterHardinessZone = winterHardinessZone;
        this.careLevel = careLevel;
        this.flowerColors = flowerColors;
        this.foliageColors = foliageColors;
        this.exposition = exposition;
        this.foliagePhase = foliagePhase;
    }
    
    public String getInformation() {
        return 
        "{ \n"+ 
        "   name: " + this.name + "\n"
        + "   type: " + this.type + "\n" 
        + "   winterhärte: " + this.winterHardinessZone + "\n" 
        + "   careLevel: " + this.careLevel + "\n" 
        + "   blütenfarbe: " + this.flowerColors + "\n" 
        + "   foliageColors: " + this.foliageColors + "\n" 
        + "   exposition: " + this.exposition + "\n" 
        + "   foliagePhase: " + this.foliagePhase + "\n"
        + "}";
    }
}






