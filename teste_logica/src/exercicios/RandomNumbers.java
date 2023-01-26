package exercicios;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= 10; i++) {
            int num = rand.nextInt(101);
            System.out.print(num + " ");
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println();
        System.out.println("Menor número gerado: " + min);
        System.out.println("Maior número gerado: " + max);
    }
}