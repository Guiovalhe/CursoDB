package exercicios;

import java.util.Scanner;

public class Tabuada {

    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o numero desejado: ");
        int numero = entrada.nextInt();
        System.out.println("A tabuada do " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
        
}
}