import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int macierz[]=new int[32];
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba;
        liczba = in.nextInt();
        for (int i = 0; i < macierz.length ; i++) {

            macierz[i] = liczba%2;
            liczba=liczba/2;

        }
        for (int i = macierz.length-1; i >=0 ; i--) {
            System.out.print(macierz[i]);
        }

    }



}
