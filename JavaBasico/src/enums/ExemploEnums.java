package enums;

import java.util.Iterator;

public class ExemploEnums {  
    public static void main(String[] args) {
     //   System.out.printf("A cor é: %s", VERDE);
        
        Cores cor = Cores.VERDE;
        System.out.printf("\nA cor é: %s", cor);
    
        switch (cor) {
        case VERDE:
            System.out.println("VERDE");
            break;
        case VERMELHO:
            System.out.println("VERMELHO");
            break;
        case AZUL:
            System.out.println("AZUL");
            break;

        default:
            break;
        }
        
        Cores[] cores = Cores.values();
        for (int i = 0; i < cores.length; i++) {
            System.out.println("A cor atual no laço é: " + cores[i]);
        }
    
    
    }

}
