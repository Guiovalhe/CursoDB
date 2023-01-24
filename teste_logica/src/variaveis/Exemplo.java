package variaveis;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exemplo {
    public static void main(String[] args) {
        
        // grupo dos inteiros
        short pequeno = 5;
        System.out.println(pequeno);
            
        int medio = 4000;
        System.out.println(medio);
        
        long grande = 10000000;
        System.out.println(grande);
        
        // Grupo dos reais
        float fpequeno = (float)5.5;
        System.out.println(fpequeno);      
        
        double dmedio = 4000.50002;
        System.out.println(dmedio);
        
        BigDecimal dgrande = new BigDecimal("1000000.10000000055555");
        System.out.println(dgrande);
        
        // Lógico
        boolean bool = true;
        bool = false;
        System.out.println(bool);
        
        // Grupo de textos
        char letra = 'Y';
        System.out.println(letra);
        //
        String frase = "Olá mundo, 1+1";
        System.out.println(frase);
        
        // Grupo de Datas
        LocalDate data = LocalDate.now();
        System.out.println(data);
        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);
    }
}
