package exercicios;

public class Array2 {
    public static void main(String[] args) {
    
    int[] array2 = new int[100];
    for (int i = 0; i < 100; i++) {
        array2[i] = (int)Math.round(Math.random() * 100);
    }        
        for (int i = 0; i < array2.length; i++) 
        System.out.print(array2[i] + " ");
        System.out.println();

// Bubble sort
        for (int i = 0; i < array2.length; i++) {
            for (int i2 = i; i2 < array2.length; i2++) {
                if (array2[i] > array2[i2]) {
                    int aux = array2[i];
                    array2[i] = array2[i2];
                    array2[i2] = aux;
                }
                
            }
        }
    for (int i = 0; i < array2.length; i++)
        System.out.print(array2[i] + " ");
}
}