package exercicios.arvore;

public class Arvore {
    /*
     * Criar um sistema que represente a arvore genealogica de uma familia
     * Pessoas <- Entidades
     * 
     */ 
    public static void main(String[] args) {
        
        Pessoa avoMPedro = new Pessoa("Ana", 80);
        Pessoa voMPedro = new Pessoa("Osmar", 84);
        
        Pessoa avoPPedro = new Pessoa("Rosa", 87);
        Pessoa voPPedro = new Pessoa("Nelson", 89);
        
        Pessoa maePedro = new Pessoa("Geoavana", 62, avoMPedro, voMPedro);
        Pessoa paiPedro = new Pessoa("Antonio", 65, avoPPedro, voPPedro);
        
        Pessoa pedro = new Pessoa("Pedro", 45, maePedro, paiPedro);
        Pessoa luiza = new Pessoa("Luiza", 33, maePedro, paiPedro);
        
        
        System.out.println(pedro.getArvore());
        System.out.println();
        System.out.println(pedro.getMae().getMae().getMae() + "(" + pedro.getMae().getMae().getIdade() );// navega através da arvore para localizar um ente.
    }
}
