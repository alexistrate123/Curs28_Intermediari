import java.util.Scanner;

public class Exemplul1 {

    public static void main(String[] args) {

    ghiceste(99);

        System.out.println(afiseazaMinMax(25));
        System.out.println(afiseazaMinMax(-1));
        System.out.println(afiseazaMinMax(-2));
        System.out.println(afiseazaMinMax(27));



    }

    /*
       1. Declara o metoda ghiceste(), care sa primeasca un parametru int numar, si sa afiseze "Ai ghicit..." daca un
       un numar cerut la consola este acelasi cu parametrul, sa afiseze "Mai mult " daca este prea mic, si "Mai putin "
       daca este mai mare.
       Daca nu, sa se ceara numarul pana se ghiceste.

       2. Declara o metoda care primeste ca parametru un int temperatura si returneaza un boolean;
       daca parametrul este cu minus = false, daca e cu + = true;

       3. Declara o metoda

     */


    public static void ghiceste(int numar ) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Introdu numarul ales, aici:");
            int numarIntrodusLaConsola = sc.nextInt();
            if (numarIntrodusLaConsola < numar) {
                System.out.println("Mai mult");
            } else if (numarIntrodusLaConsola > numar) {
                System.out.println("Mai putin");
            } else {
                System.out.println("Ai ghicit!");
                break;
            }
        }

    }


    // 2. Declara o metoda care primeste ca parametru un int temperatura si returneaza un boolean;
    //       daca parametrul este cu minus = false, daca e cu + = true;

    public static boolean afiseazaMinMax(int temperatura) {
        return temperatura > 0;
    }
}
