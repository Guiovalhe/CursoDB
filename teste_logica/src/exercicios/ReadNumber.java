package exercicios;

import java.util.Scanner;

public class ReadNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Coloque um numero: ");
            number = scanner.nextInt();
        } while (number != 10 );
        
        System.out.println("Você colocou 10! ");
        
        
    }

}
