package exercicios;

import java.util.Scanner;

public class Escola2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira a nota de cada trimestre: ");
        double nota1 = Double.parseDouble(scanner.nextLine());
        double nota2 = Double.parseDouble(scanner.nextLine());
        double nota3 = Double.parseDouble(scanner.nextLine());
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        
        if (media > 6 && media <= 10 ) {
            System.out.println(media + "\nParabéns, aluno aprovado!");
        } else if (media >= 4 && media <= 6) {
            System.out.println(media + "\nAluno em recuperação.");
        } else if (media < 4) {
            System.out.println(media + "\nAluno reprovado. Bye!");
        } else {
            System.out.println("Erro na nota.");
        }
        
    }

}
