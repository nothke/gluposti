package cs101.iv02;

import java.util.Scanner;

public class Zadatak7 {

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.println("KONVERTOR JEDINICA TEMPERATURE");
        String modString;
        System.out.println("Konvertuj stepene celzijusa u farenhajte (1) ili farenhajte u celzijuse (2)?");
        modString = unos.next();
        int mod = Integer.parseInt(modString);

        double celzijus;
        double farenhajt;

        switch (mod) {
            case 1:
                String celzijusString;
                System.out.println("Unesi temperaturu u stepenima celzijusa:");
                celzijusString = unos.next();
                celzijus = Double.parseDouble(celzijusString);
                farenhajt = celzijus * 1.8 + 32;
                System.out.println("Temperatura u stepenima farenhajta je: " + farenhajt);
                break;

            case 2:
                String farenhajtString;
                System.out.println("Unesi temperaturu u stepenima farenhajta:");
                farenhajtString = unos.next();
                farenhajt = Double.parseDouble(farenhajtString);
                celzijus = (farenhajt - 32) / 1.8;
                System.out.println("Temperatura u stepenima celzijusa je: " + celzijus);
                break;

            default:
                System.out.println("pogresan unos, restartuj aplikaciju");
                break;
        }
    }
}
