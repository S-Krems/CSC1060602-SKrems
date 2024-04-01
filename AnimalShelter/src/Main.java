public class Main {
    public static void main(String args[]) {
        AdoptableAnimal[] animals = new AdoptableAnimal[]{
                new Cat("Billy", "He sucks", 200000),
                new Cat("Not Billy", "Way better than Billy", 2),

                //Changed Jimbo to my dogs name
                new GermanShorthairedPointer("Margo", "Wow!", 200),
                new GreatDane("Rough", "The best", 20)
        };

        for (AdoptableAnimal animal : animals) {
            String animalType = (animal instanceof Cat) ? "cat" : "dog";
            System.out.println("Adopting out a " + animalType
                    + "\nTheir name is " + animal.getName()
                    + "\nThey cost " + animal.getPrice()
                    + "\nOur staff describes them thusly: " + animal.getDescription());

            if (animal instanceof Dog) {
                System.out.println("The dog's breed is " + ((Dog) animal).getBreed());
            }
        }
    }
}