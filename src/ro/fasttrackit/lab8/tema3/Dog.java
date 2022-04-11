package ro.fasttrackit.lab8.tema3;

public class Dog implements Animal{
    public String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    @Override
    public String walk() {
        return "dog-walk";
    }

    @Override
    public String talk() {
        return "ham-ham like " + breed;
    }

    @Override
    public String eat() {
        return "The dog " + breed + " eat just meat!";
    }
}
