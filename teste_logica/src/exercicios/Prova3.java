package exercicios;

import java.util.Scanner;

public class Prova3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira seu numero: ");
        int num = scanner.nextInt();
        
        if (num >= 0) {
            System.out.println(num + " é positivo!");
        } else {
            System.out.println(num + " é negativo!");
        }        
    }
}
