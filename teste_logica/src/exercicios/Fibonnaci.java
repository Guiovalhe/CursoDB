package exercicios;

import java.util.*;

public class Fibonnaci {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero desejado: ");
        int num = input.nextInt();
        
        int n1 = 0;
        int n2 = 1;
        
        System.out.print(n1 + " " + n2 + " ");
        while (true) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if (n3 > num) {
                return;
            }
            System.out.print(n3 + " ");
        } 
    }

}
