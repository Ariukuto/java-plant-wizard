 class Plant {
    public String name;
    public String art;
    public String winterHaerte;
    public String pflege;
    public String bluetenfarbe;
    public String laubfarbe;
    public String exposition;
    public String laubphase;
    
    // Konstruktur
    Plant(
        String name, 
        String art, 
        String winterHaerte, 
        String pflege, 
        String bluetenfarbe, 
        String laubfarbe, 
        String exposition, 
        String laubphase
    ) {
        // Hier werden die Werte, die über den Konstruktur übergeben werden, an die Felder weitergeben.
        this.name = name;
        this.art = art;
        this.winterHaerte = winterHaerte;
        this.pflege = pflege;
        this.bluetenfarbe = bluetenfarbe;
        this.laubfarbe = laubfarbe;
        this.exposition = exposition;
        this.laubphase = laubphase;
    }
    
    public String getInformation() {
        return 
        "{ \n"+ 
        "   name: " + this.name + "\n"
        + "   art: " + this.art + "\n" 
        + "   winterhärte: " + this.winterHaerte + "\n" 
        + "   pflege: " + this.pflege + "\n" 
        + "   blütenfarbe: " + this.bluetenfarbe + "\n" 
        + "   laubfarbe: " + this.laubfarbe + "\n" 
        + "   exposition: " + this.exposition + "\n" 
        + "   laubphase: " + this.laubphase + "\n"
        + "}";
    }
}






