interface Accessory {
    String getName();
}

class Sneakers implements Accessory {
    public String getName() { return "Sneakers"; }
}

class Tie implements Accessory {
    public String getName() { return "Tie"; }
}