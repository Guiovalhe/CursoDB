package exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        System.out.println("Exercicio 3:");
        //textos iniciais
        int jogador,computador;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Jokenpo");
        System.out.println("");
        System.out.println("1. Pedra");
        System.out.println("2. Papel");
        System.out.println("3. Tesoura");
        System.out.println("Digite a opção desejada: ");
        System.out.println("");
        //lógica do jogador
        jogador = teclado.nextInt();
        switch(jogador) {
        case 1:
            System.out.println("Jogador escolheu PEDRA");
            break;
        case 2:
            System.out.println("Jogador escolheu PAPEL");
            break;
        case 3:
            System.out.println("Jogador escolheu TESOURA");
            break;
            default:
                System.out.println("Opção não existe.");
                break;
        }
        // lógica do computador
        computador = (int)(Math.random()*3 + 1);
        teclado.close();
        switch(computador) {
        case 1:
            System.out.println("Computador escolheu PEDRA");
            break;
        case 2:
            System.out.println("Computador escolheu PAPEL");
            break;
        case 3:
            System.out.println("Computador escolheu TESOURA");
            break;
            default:
                System.out.println("Opção não existe.");
                break;
        }
        // lógica do vencedor
        System.out.println("");
        if (jogador == computador) {
            System.out.println("EMPATE");
        } else {
            if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)) {
                System.out.println("JOGADOR VENCEU");
            } else {
                System.out.println("COMPUTADOR VENCEU");
            }
        }
    }

}
