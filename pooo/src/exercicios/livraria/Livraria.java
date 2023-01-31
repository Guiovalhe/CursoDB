package exercicios.livraria;

import java.time.LocalDateTime;

public class Livraria {

    public static void main(String[] args) {
        Livro livro = new Livro("as12345dd", "IT");
        Livro livro2 = new Livro("as15456ddxx", "MR Mercedes");
        System.out.println(livro.getIsbn() + " " + livro.getTitulo());
    
        Pessoa renato = new Pessoa("99999999", "Renato");
        Pessoa guilherme = new Pessoa("24548452", "Guilherme");
        System.out.println(renato.getDoc() + " " + renato.getNome());
        
        
        int numeroDias = 15; //Regra de negócio que indica que um livro pode ser emprestado por 15 dias.
        Emprestimo empr1 = new Emprestimo(livro2, renato);
        
        String consulta = empr1.getEmprestimo();
        System.out.println(consulta);
        
        Emprestimo empr2 = new Emprestimo(livro, guilherme);
    
        String consulta2 = empr2.getEmprestimo();
        System.out.println("\n" + consulta2);
        
    }

}