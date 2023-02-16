package Paket2;

import java.util.Scanner;

public class domaciponovoniz {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi velicinu niza: ");

        int velicinaNiza = sc.nextInt();
        int niz[] = new int[velicinaNiza];
        int max = 0;

        for (int i = 0; i < velicinaNiza; i++) {
            System.out.println("Unesi clanove niza");
            int clanNiza = sc.nextInt();
            niz[i] = clanNiza;
            if (i == 0) {
                max = clanNiza;
            } else {
                if (niz[i] >= max) {
                    max = niz[i];
                }
            }
        }
        System.out.println("Maksimalan broj: " + max);
    }
}
