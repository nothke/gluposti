import java.util.Scanner;

public class Konvertor {

    public static void main(String[] args) {


        System.out.println("Konvertuj dinare u evre (1) ili evre u dinare (2)?");
        double novacUDinarima, novacUEvrima;
        String novacUDinarimaString, novacUEvrimaString;
        Scanner unos = new Scanner(System.in);
        final double ODNOS = 115.920;
        int modKonverzije;

        switch (modKonverzije) {
            case 1:
                System.out.println("Unesi novac u dinarima");
                novacUDinarimaString = unos.next();
                int parsedString = Integer.parseInt(novacUDinarimaString);
                novacUEvrima = parsedString / ODNOS;
                System.out.println("Novac u evrima je: " + novacUEvrima);
                break;

            case 2:
                System.out.println("Unesi novac u evrima");
                novacUEvrimaString = unos.next();
                int parsedString2 = Integer.parseInt(novacUEvrimaString);
                novacUDinarima = parsedString2 * ODNOS;
                System.out.println("Novac u dinarima je: " + novacUDinarima);
                break;

            default:
                System.out.println("pogresan unos! Napisi 1 ili 2");
                break;

            /*
             if (modKonverzije == 1) {
             double
             }
             novacUDinarima;
             String novacUDinarimaString;
             Scanner unos = new Scanner(System.in);
             final double ODNOS = 115.920;

             System.out.println("Unesi novac u dinarima");
             novacUDinarimaString = unos.next();
             int parsedString = Integer.parseInt(novacUDinarimaString);
             double novacUEvrima = parsedString / ODNOS;
             System.out.println("Novac u evrima je: " + novacUEvrima);
             */
        }


   
