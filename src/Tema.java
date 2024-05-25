import java.util.Scanner;

public class Tema {
    public static void main(String[] args) {
       // 1.  Scrie o metoda fizzBuzz() parametru int
        //    returneaza fizz daca e divizibil cu 3
        //    returneaza buzz daca e divizibil cu 5
        //    returneaza fizzbuzz daca este divizibil cu 5 si 3

        System.out.println(fizzBuzz(15));




        // 2. Scrie o metoda care printeaza un String ca parametru in oglinda

        Oglinda("Hello, World");

    }
    /*
    1. Scrie o metoda fizzBuzz() parametru int
    returneaza fizz daca e divizibil cu 3
    returneaza buzz daca e divizibil cu 5
    returneaza fizzbuzz daca este divizibil cu 5 si 3

    2. Scrie o metoda care printeaza un String ca parametru in oglinda

   3. 

     */


// 1.

    public static String fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "fizzbuzz";
        } else if (num % 3 == 0) {
            return "fizz";
        } else if (num % 5 == 0) {
            return "buzz";
        } else {

            return String.valueOf(num);
        }
    }




// 2. Scrie o metoda care printeaza un String ca parametru in oglinda;

    public static void Oglinda(String inputStr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu textul aici, pentru a fi inversat:");
        inputStr = sc.nextLine();
        StringBuilder oglindaStr = new StringBuilder(inputStr).reverse();
        System.out.println(oglindaStr);
    }






}
