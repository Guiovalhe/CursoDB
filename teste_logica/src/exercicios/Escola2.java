package exercicios;

import java.util.Scanner;

public class Escola2 {		
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Insira a nota de cada trimestre: ");
    	double nota1 = Double.parseDouble(scanner.nextLine());
    	double nota2 = Double.parseDouble(scanner.nextLine());
    	double nota3 = Double.parseDouble(scanner.nextLine());    	
    	
    	double calcularMedia = (nota1 + nota2 + nota3) / 3;


        if (calcularMedia > 6 && calcularMedia <= 10) {
        	System.out.println(calcularMedia + "\nParabens, aprovado!");
        } else if (calcularMedia >= 4 && calcularMedia <= 6) {
        	System.out.println(calcularMedia + "\nEsta de recuperacao!");
        } else if (calcularMedia < 4) {
        	System.out.println(calcularMedia + "\nReprovado.");
        } else {
        	System.out.println("Digitou errado a nota.");
        }
        
        /*double media = calcularMedia(nota1, nota2, nota3);
        String status = verificarStatus(media);
        System.out.println("Média: " + media);
        System.out.println("Status: " + status);*/
    }
}
