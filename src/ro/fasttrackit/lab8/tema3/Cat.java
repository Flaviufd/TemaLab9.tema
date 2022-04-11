package ro.fasttrackit.lab8.tema3;

public class Cat implements Animal{
    public String name;

    public Cat(String name) {
        this.name = name;
    }


    @Override
    public String walk() {
        return "The cat " + name + " is walking tiptil tiptil :)))..";
    }

    @Override
    public String talk() {
        return "The cat " + name + " talk in cat`s language.";
    }

    @Override
    public String eat() {
        return "The cat " + name + " eat just mice!";
    }
}
