package operadores;

public class ExemploOperadores {

    public static void main(String[] args) {
        // Operador de Atribuição
        int numero1 = 2;
        System.out.println(numero1);
        
        int numero2; 
        numero2= numero1;
        System.out.println(numero2);
        
        numero1 = 5;
        System.out.println(numero1);
        System.out.println(numero2);
        
        //  Operadores Aritméticos
        int soma = 2 + 2;
        int soma2 = soma + 2;
        int soma3 = soma + soma2;
        System.out.println(soma3);
              
        int sub = 10 - 5;
        int sub2 = sub - 2;
        int sub3 = sub - sub2;
        System.out.println(sub3);
        
        int mult = 3 * 3;
        int mult2 = mult * 3;
        int mult3 = mult * mult2;
        System.out.println(mult3);
        
        double div = 10.0 / 5.0;
        System.out.println(div);
        
        double mod = 10.0 % 5.0;
        System.out.println(mod);
        
        // Concatenação
        String primeiroNome = "Guilherme";
        String sobrenome = "Chitolina";
        String nome = primeiroNome + " " + sobrenome;
        System.out.println(nome);
        
        // Operadores de Incrimento/Descremento
        int contador = 1;
        contador++; 
        System.out.println(++contador);
        contador--;
        System.out.println(contador);
        
        // Operadores de Atribuição & Aritmético (soma e divisão)
        int numero3 = 1;
        numero3 += 5;
        System.out.println(numero3);
        
        int numero4 = 10;
        numero4 /= 5;
        System.out.println(numero4);
        
        // Operadores de Comparadores de igualdade/diferença
        int numeroComp1 = 1;
        int numeroComp2 = 2;
        boolean comparacao1 = numeroComp1 == numeroComp2;
        System.out.println(comparacao1);
        numeroComp2--;
        System.out.println(numeroComp1 == numeroComp2);
        
        String stringComp1 = "azul";
        String stringComp2 = "amarelo";
        System.out.println(stringComp1 != stringComp2);
        
        // Operadores Relacionais
        int numeroComp3 = 2;
        int numeroComp4 = 7;
        boolean comparacao2 = numeroComp3 > numeroComp4;
        System.out.println(comparacao2);
        numeroComp3 += 5;
        System.out.println(numeroComp3 > numeroComp4);
        
        // Operadores lógicos
        boolean expressao1 = true == false;
        boolean expressao2 = 5 >= 10;
        boolean expressao3 = "AB" != "CD";
        boolean expressaoCombinada = expressao1 && expressao2 && expressao3;
        System.out.println(expressaoCombinada);
        boolean expressaoCombinada2 = expressao1 || expressao2 || expressao3;
        System.out.println(expressaoCombinada2);
        System.out.println(1 == 1 && 10 >= 5 || true == false);
        boolean expressao4 = !('A' != 'A');
        System.out.println(expressao4);
    }

}
// Operadores de Atribuição
//  Operadores Aritméticos
// Operadores de Incrimento/Descremento
//Operadores de Atribuição & Aritmético (soma e divisão)
//Operadores de Comparadores de igualdade/diferença
// Operadores Relacionais
// Operadores lógicos