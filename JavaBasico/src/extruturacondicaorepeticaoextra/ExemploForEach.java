package extruturacondicaorepeticaoextra;

import java.util.ArrayList;
import java.util.Iterator;

public class ExemploForEach {

    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<String>();
        
        frutas.add("Maçã");
        frutas.add("Pessego");
        frutas.add("Uva");
        frutas.add("Laranja");

        
        for (String elementoAtual : frutas) {
            System.out.println(elementoAtual);
        }
}
}
