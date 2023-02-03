package collections.stringiterable;

import java.util.Iterator;

public class StringIteravel implements Iterable<String>{
    private String[] sourceInterno;
    
    // "Maça, Banana, Melão, Melancia"
    
    public StringIteravel(String valor) {
        this.sourceInterno = valor.trim().replace(" ", "").split(",");
    }
    
    @Override
    public Iterator<String> iterator(){
        return new StringIterador(sourceInterno);
    }

}
