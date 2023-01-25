package estruturaDecisao;

public class ExemploEstruturaDecisao {

    public static void main(String[] args) {
        System.out.println("/// IF / ELSE IF / ELSE /// ");
        int numero1 = 2;
        int numero2 = 10;
        
        if (numero1 > numero2) {
            System.out.println(numero1 + " � maior do que " + numero2);
        } else if (numero1 == numero2) {
            System.out.println(numero1 + " � igual a " + numero2);
        } else {
            System.out.println(numero1 + " � menor que " + numero2);
        }
        
        
        System.out.println("///  SWITCH / CASE / BREAK /// ");
        String nome = "Maria";
        switch (nome) {
            case "Jo�o":
                System.out.println("Jo�o");
                break;
            case "Maria":
                System.out.println("Maria");
                break;
            case "Renato":
                System.out.println("Renato");
                break;
            case "Jos�":
                System.out.println("Jos�");
                break;
            default:
                System.out.println("Nome n�o encontrado.");
                break;
        }
        
    }
}
