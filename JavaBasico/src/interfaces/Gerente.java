package interfaces;

public class Gerente implements Funcionario {
    @Override
    public void calcularSalario() {
        //Calculo do sal�rio do coordenador
        System.out.println("calcularSalarioParaGerente");
}
    public void fecharPontos(Operador[] operadores) {
        // L�gica de fechamento de ponto dos operadores
        
    }
    @Override
    public void baterPonto() {
        System.out.println("Gerente baterPonto");
    }
    @Override
    public void cumprirCargaHoraria() {
        System.out.println("Gerente cumprirCargaHoraria");
    }
}