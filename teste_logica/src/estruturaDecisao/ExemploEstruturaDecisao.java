package estruturaDecisao;

public class ExemploEstruturaDecisao {

    public static void main(String[] args) {
        System.out.println("/// IF / ELSE IF / ELSE /// ");
        int numero1 = 2;
        int numero2 = 10;
        
        if (numero1 > numero2) {
            System.out.println(numero1 + " é maior do que " + numero2);
        } else if (numero1 == numero2) {
            System.out.println(numero1 + " é igual a " + numero2);
        } else {
            System.out.println(numero1 + " é menor que " + numero2);
        }
        
        
        System.out.println("///  SWITCH / CASE / BREAK /// ");
        String nome = "Maria";
        switch (nome) {
            case "João":
                System.out.println("João");
                break;
            case "Maria":
                System.out.println("Maria");
                break;
            case "Renato":
                System.out.println("Renato");
                break;
            case "José":
                System.out.println("José");
                break;
            default:
                System.out.println("Nome não encontrado.");
                break;
        }
        
    }
}
