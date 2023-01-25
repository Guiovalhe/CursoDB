package exercicios;

import java.util.Scanner;

public class Exercicio2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do produto:");
        String nomeProduto = scanner.nextLine();
        
        System.out.println("Digite o preço do produto");
        double precoProduto = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Digite a quantidade do produto");
        int quantidadeProduto = scanner.nextInt();
        
        String mensagem = "Nome do Produto: " + nomeProduto + "\nTotal: ";
        double valorTotal = (precoProduto * quantidadeProduto);
        double desconto10 = valorTotal * 0.9;
        double desconto20 = valorTotal * 0.8;
        
        if (quantidadeProduto <= 10) {
            System.out.println("Nome do produto: " + nomeProduto + "\n Total: " + (precoProduto * quantidadeProduto));
        } else if (quantidadeProduto <= 20) {
            System.out.println(mensagem + desconto10);
        } else if (quantidadeProduto <= 50) {
            System.out.println(mensagem + desconto20);
        } else {
            System.out.println("> 50");
            double total = (precoProduto * quantidadeProduto) * 0.75;
            System.out.println(mensagem + total);
        }

    }

}
