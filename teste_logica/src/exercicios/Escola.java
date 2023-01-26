package exercicios;

import java.util.Scanner;

public class Escola {   
    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static String verificarStatus(double media) {
        if (media >= 6) {
            return "Aprovado";
        } else if (media >= 4) {
            return "Verificação Suplementar";
        } else {
            return "Reprovado";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira a nota de cada trimestre: ");
        double nota1 = Double.parseDouble(scanner.nextLine());
        double nota2 = Double.parseDouble(scanner.nextLine());
        double nota3 = Double.parseDouble(scanner.nextLine());
        
        
        
        double media = calcularMedia(nota1, nota2, nota3);
        String status = verificarStatus(media);
        System.out.println("Média: " + media);
        System.out.println("Status: " + status);
    }
}