package napisy;

import java.util.Scanner;

public class RozmowaZUzytkownikiem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "cp1250");

        System.out.println("Czy chcesz kontynuowaæ rozmowê? ");
        String odpowiedz = scanner.nextLine();

        while (!(odpowiedz.equalsIgnoreCase("nie"))) {
            if (odpowiedz.equalsIgnoreCase("tak")) {
                System.out.println("To Œwietnie!");
            } else {
                System.out.println("Nie rozumiem.");
            }
            System.out.println("Czy chcesz kontynuowaæ rozmowê? ");
            odpowiedz = scanner.nextLine();
        }
        System.out.println("Do zobaczenia!");
    }

}
