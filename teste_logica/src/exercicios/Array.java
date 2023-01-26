package exercicios;

public class Array {

    public static void main(String[] args) {
        //                         0                1                  2                  3
        int [][] array = { {4, 6, 9, 16 }, { 34, 56, 67, 78}, { 3, 5, 2, 7 }, { 88, 96, 67, 56 } };
   //                       0  1  2  3        0   1   2   3     0  1  2  3          0   1   2   3
    
        
        
        
        int soma = 0;
        int colunaAtual = 0;
        
        for (int i = 0; i < array.length; i++) {
            int[] colunas = array[i];
            
            soma += colunas[colunaAtual];

            colunaAtual++;
        }
        System.out.println(soma);
    }
}
