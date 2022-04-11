package ro.fasttrackit.lab8.tema1;

public class Facebook implements Services{
    public String name;

    public Facebook(String name) {
        this.name = name;
    }

    @Override
    public String install() {
        return "We can install apps like on " + name + " at the link ........";
    }

    @Override
    public String configure() {
        return "We configure all the website like on " + name;
    }

    @Override
    public String maintenance() {
        return "We will maintenance your site like " + name;
    }
}
