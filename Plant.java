 class Plant {
    public String name;
    public String type;
    public String winterHardinessZone;
    public String careLevel;
    public String flowerColors;
    public String foliageColors;
    public String exposition;
    public String foliagePhase;
    
    // Konstruktur
    Plant(
        String name, 
        String type, 
        String winterHardinessZone, 
        String careLevel, 
        String flowerColors, 
        String foliageColors, 
        String exposition, 
        String foliagePhase
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






