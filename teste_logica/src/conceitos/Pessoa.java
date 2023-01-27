package conceitos;

import conceitos.Biscoito;

public class Pessoa {
    public String nome;
    private boolean bocaAberta = false;         // caracteristicas
    public boolean gostaDeBiscoito = false;     // caracteristicas
    
    public void comer(Biscoito biscoito) {      // comportamento
        if (gostaDeBiscoito == true) {
            System.out.println("Aceito, obrigado!");
        } else {
            System.out.println("Não, não gosto, obrigado!");
        }
    }
}
