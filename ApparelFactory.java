class ApparelFactory {
    public Apparel createApparel(String apparelType) {
        if (apparelType.equalsIgnoreCase("TShirt") || apparelType.equalsIgnoreCase("T-Shirt")) {
            return new TShirt();
        } else if (apparelType.equalsIgnoreCase("Blazer")) {
            return new Blazer();
        } else {
            throw new IllegalArgumentException("Invalid apparel type: " + apparelType);
        }
    }
}