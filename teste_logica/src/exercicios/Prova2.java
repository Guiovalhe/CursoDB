package exercicios;

import java.util.Scanner;

public class Prova2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, temp;
        
                
        System.out.println("Insira o valor de A: ");
        A = scanner.nextInt();
        
        System.out.println("Insira o valor de B: ");
        B = scanner.nextInt();
        
        temp = A;
        A = B;
        B = temp;
        
        System.out.println("O valor de A agora é: " + A);
        System.out.println("O valor de B agora é: " + B);
    }
}
