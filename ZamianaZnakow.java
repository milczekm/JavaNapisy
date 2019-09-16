package napisy;

import java.util.Scanner;

public class ZamianaZnakow {

    static String bezZnakow(String napis, String znaki) {

        for (int i = 0; i < znaki.length(); i++) {
            char znak = znaki.charAt(i);
            napis = napis.replace(znak, '_');
        }
        return napis;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj napis do modyfikacji: ");
        String napis = sc.nextLine();

        System.out.println("Podaj znaki do zamiany: ");
        String znaki = sc.nextLine();

        System.out.println(bezZnakow(napis, znaki));

    }
}
