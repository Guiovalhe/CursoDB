package collections.stringiterable;

public class ExercicioIterable {
    public static void main(String[] args) {
        StringIteravel meuObjetoIteravel = new StringIteravel("Ma��,Banana,Mel�o,Melancia");
        
        for (String valorAtual : meuObjetoIteravel ) {
            System.out.println(valorAtual);
        }
    }

}
