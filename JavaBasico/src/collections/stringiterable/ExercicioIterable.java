package collections.stringiterable;

public class ExercicioIterable {
    public static void main(String[] args) {
        StringIteravel meuObjetoIteravel = new StringIteravel("Maçã,Banana,Melão,Melancia");
        
        for (String valorAtual : meuObjetoIteravel ) {
            System.out.println(valorAtual);
        }
    }

}
