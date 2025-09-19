interface OutfitFactory {
    Apparel createApparel();
    Accessory createAccessory();
}

class CasualOutfitFactory implements OutfitFactory {
    private final ApparelFactory apparelFactory = new ApparelFactory();
    private final AccessoryFactory accessoryFactory = new AccessoryFactory();

    public Apparel createApparel() {
        return apparelFactory.createApparel("TShirt");
    }
    public Accessory createAccessory() {
        return accessoryFactory.createAccessory("Sneakers");
    }
}

class FormalOutfitFactory implements OutfitFactory {
    private final ApparelFactory apparelFactory = new ApparelFactory();
    private final AccessoryFactory accessoryFactory = new AccessoryFactory();

    public Apparel createApparel() {
        return apparelFactory.createApparel("Blazer");
    }
    public Accessory createAccessory() {
        return accessoryFactory.createAccessory("Tie");
    }
}