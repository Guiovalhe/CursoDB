package abstracao;

public class ExemploAbstracao {

    public static void main(String[] args) {
        // problema: ligar um carro e saber se ta ligado ou nao
        
        Carro carro = new Carro("Ford");
        
        carro.ligar();
        
        if (carro.ligado) {
            System.out.println("Carro ligado");
        } else {
            System.out.println("Carro falhou");
        }
    }
}
