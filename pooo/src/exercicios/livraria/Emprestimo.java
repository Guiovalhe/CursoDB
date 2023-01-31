package exercicios.livraria;

import java.time.LocalDateTime;

// Empréstimo
// 1 Tomador (Pessoa)
// 1 Livro 

public class Emprestimo {
    private final int NUMERO_DIAS_RETORNO_LIVRO = 15;
    
    private Livro livro;
    private Pessoa tomador;
    private String dataCriacao;
    private String dataPrevisaoRetorno;
    
    public Emprestimo(Livro livro, Pessoa tomador) {
        this.livro = livro;
        this.tomador = tomador;
        this.dataCriacao = LocalDateTime.now().toString(); 
        this.dataPrevisaoRetorno = LocalDateTime.now().plusDays(NUMERO_DIAS_RETORNO_LIVRO).toString();
    }
    
    public String getEmprestimo() {
        String livroDesc = this.livro.getTitulo() + "(" + this.livro.getIsbn() + ")";
        String pessoaDesc = this.tomador.getNome();
        String periodo = this.dataCriacao + " e " + this.dataPrevisaoRetorno;
        
        
        return "O Livro: " + livroDesc + "\nFoi emprestado para " + pessoaDesc + "\ndurante " + periodo;        
    }
    
    public Livro getLivro() {
        return this.livro;
    }
    private void setLivro(Livro livro) {
        this.livro = livro;
    }
    public Pessoa getTomador() {
        return this.tomador;
    }
    private void setTomador(Pessoa tomador) {
        this.tomador = tomador;
    }
}
