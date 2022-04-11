package ro.fasttrackit.lab8.tema2;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Ing banca1 = new Ing("ING");
        System.out.println("Va rugam sa introduceti suma pentru depozitare in banca " + banca1.bankName);
        System.out.println(banca1.deposit());
        System.out.println("Va rugam sa introduceti suma pentru retragere din banca " + banca1.bankName);
        System.out.println(banca1.withdraw());

        Bt banca2 = new Bt("BT");
        System.out.println("Va rugam sa introduceti suma pentru depozitare in banca " + banca2.bankName);
        System.out.println(banca2.deposit());

        Brd banca3 = new Brd("BRD");
        System.out.println("Va rugam sa introduceti suma pentru retragere din banca " + banca3.bankName);
        System.out.println(banca3.withdraw());
    }
}
