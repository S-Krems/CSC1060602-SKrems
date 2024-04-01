abstract class Dog implements AdoptableAnimal {
    private String name;
    private String description;
    private double price;

    public Dog(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    //An abstract 'getBreed' method that returns a string
    public abstract String getBreed();

    //Get a name, description and price different from other animals
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}

