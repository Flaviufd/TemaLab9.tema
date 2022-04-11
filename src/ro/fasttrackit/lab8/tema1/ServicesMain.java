package ro.fasttrackit.lab8.tema1;

public class ServicesMain {
    public static void main(String[] args) {
        Facebook services1 = new Facebook("Facebook");
        System.out.println(services1.install());
        System.out.println(services1.configure());
        System.out.println(services1.maintenance());
    }
}
