public class Main {
    public static void main(String[] args) {
        System.out.println("=== Factory Method Demo ===");
        ApparelFactory apparelFactory = new ApparelFactory();
        AccessoryFactory accessoryFactory = new AccessoryFactory();

        Apparel apparel = apparelFactory.createApparel("TShirt");
        Accessory accessory = accessoryFactory.createAccessory("Sneakers");

        System.out.println("Ordered (separate factories): " + apparel.getName() + " + " + accessory.getName());

        System.out.println("\n=== Abstract Factory Demo ===");
        OutfitFactory casual = new CasualOutfitFactory();
        OutfitFactory formal = new FormalOutfitFactory();

        Apparel casualApparel = casual.createApparel();
        Accessory casualAccessory = casual.createAccessory();

        Apparel formalApparel = formal.createApparel();
        Accessory formalAccessory = formal.createAccessory();

        System.out.println("Casual outfit (family): " + casualApparel.getName() + " + " + casualAccessory.getName());
        System.out.println("Formal outfit (family): " + formalApparel.getName() + " + " + formalAccessory.getName());
    }
}