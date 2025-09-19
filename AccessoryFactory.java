class AccessoryFactory {
    public Accessory createAccessory(String accessoryType) {
        if (accessoryType.equalsIgnoreCase("Sneakers")) {
            return new Sneakers();
        } else if (accessoryType.equalsIgnoreCase("Tie")) {
            return new Tie();
        } else {
            throw new IllegalArgumentException("Invalid accessory type: " + accessoryType);
        }
    }
}