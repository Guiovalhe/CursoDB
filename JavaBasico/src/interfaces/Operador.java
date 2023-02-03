package interfaces;

public class Operador implements Funcionario {
    @Override
    public void calcularSalario() {
        //Calculo do salário do coordenador
        System.out.println("Operador calcularSalario");
}

    @Override
    public void baterPonto() {
        System.out.println("Operador baterPonto");
    }

    @Override
    public void cumprirCargaHoraria() {
        System.out.println("Operador cumprirCargaHoraria");
    }
}