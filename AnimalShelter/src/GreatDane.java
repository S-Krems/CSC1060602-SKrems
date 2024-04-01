class GreatDane extends Dog {
    public GreatDane(String name, String description, double price) {
        super(name, description, price);
    }

    //specific type of breed
    @Override
    public String getBreed() {
        return "Great Dane";
    }
}

