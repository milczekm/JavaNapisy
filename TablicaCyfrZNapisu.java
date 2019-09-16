package napisy;

import java.util.Arrays;
import java.util.Scanner;

public class TablicaCyfrZNapisu {

    static int[] cyfry(String napis) {

        int rozmiarTablicy = 0;
        for (int i = 0; i < napis.length(); i++) {

            char znak = napis.charAt(i);

            if (Character.isDigit(znak)) {
                rozmiarTablicy++;
            }
        }

        int[] tab = new int[rozmiarTablicy];
        int k = 0;
        for (int j = 0; j < napis.length(); j++) {

            if (Character.isDigit(napis.charAt(j))) {

                tab[k++] = Integer.parseInt(napis.charAt(j) + "");
            }
        }
        return tab;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj napis (litery + cyfry), z którego utworzyæ tablicê cyfr: ");
        String napis = sc.nextLine();

        System.out.println(Arrays.toString(cyfry(napis)));
    }
}
