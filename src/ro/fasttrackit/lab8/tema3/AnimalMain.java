package ro.fasttrackit.lab8.tema3;

public class AnimalMain {
    public static void main(String[] args) {
        Cat miush = new Cat("Miush");
        System.out.println(miush.walk());
        System.out.println(miush.talk());
        System.out.println(miush.eat());

        Dog rex = new Dog("rotweiller");
        System.out.println(rex.walk());
        System.out.println(rex.talk());
        System.out.println(rex.eat());
    }
}
