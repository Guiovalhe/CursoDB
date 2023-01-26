package exercicios;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operacao;
        
        System.out.println("Insira seu primeiro numero: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Escolha: [ + - * /] ");
        operacao = scanner.nextLine().charAt(0);
        
        System.out.println("Insira outro numero: ");
        double num2 = Double.parseDouble(scanner.nextLine());
        
        switch (operacao) {
        case '+': 
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            break;
        case '-':
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            break;
        case '*':
            System.out.println(num1 * num2);
            break;
        case '/':
            System.out.println(num1 / num2);
            break;
        default:
            System.out.println("Erro.");
        }
    }

}
