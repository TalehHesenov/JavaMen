package main;

import java.util.Scanner;
import util.AnbarToplaMenu;
import util.SoutScannerYazdir;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            try {
                int menu = SoutScannerYazdir.intYazdir("""
                           1.Pradukt Daxil Et
                           2.Praduktlari yazdir
                           3.Pradukt Axtar
                           4.Pradukt Deyis
                           5.Pradukt Sil
                           6.Cixish""");

                if (menu == 1) {
                    AnbarToplaMenu.menuBir();

                } else if (menu == 2) {
                    AnbarToplaMenu.menuIki();

                } else if (menu == 3) {

                    AnbarToplaMenu.menuUc();

                } else if (menu == 4) {
                    AnbarToplaMenu.menuDord();

                } else if (menu == 5) {

                    AnbarToplaMenu.menuBes();
                } else if (menu == 6) {
                    System.exit(0);

                } else {

                    System.out.println("Sistemde 6 is prosesi var artiq yazila bilmez");

                }
            } catch (Exception e) {
                System.out.println("Xeta Bas verdi tekrar yoxlayin");
            }

        }

    }
}
