package exercicios;

import java.util.Scanner;

public class Exercicios2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char operacao;
		// Criar uma calculadora
        
		
		System.out.println("Digite um numero: ");
		double numeroPrimeiro = Double.parseDouble(entrada.nextLine());
        
        System.out.println("Escolha [+ - * /]");
        operacao = entrada.nextLine().charAt(0);
        
        System.out.println("Digite outro numero: ");
        double numeroSegundo = Double.parseDouble(entrada.nextLine());
        
        switch (operacao) {
        case '+':
        	System.out.println(numeroPrimeiro + numeroSegundo);
        	break;
        case '-':
        	System.out.println(numeroPrimeiro - numeroSegundo);
        	break;
        case '*':
        	System.out.println(numeroPrimeiro * numeroSegundo);
        	break;
        case '/':
        	System.out.println(numeroPrimeiro / numeroSegundo);
        	break;
    	default:
    		System.out.println("Opção invalida.");
        }
	}

}
