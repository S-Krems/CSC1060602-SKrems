class GermanShorthairedPointer extends Dog {
    public GermanShorthairedPointer(String name, String description, double price) {
        super(name, description, price);
    }

    //specific type of breed
    @Override
    public String getBreed() {
        return "German Shorthaired Pointer";
    }
}
