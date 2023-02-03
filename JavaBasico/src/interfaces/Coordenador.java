package interfaces;

public class Coordenador implements Funcionario {
    @Override
    public void calcularSalario() {
        //Calculo do salário do coordenador
        System.out.println("calcularSalarioParaCoordenador");
    }

    @Override
    public void baterPonto() {
        System.out.println("Coordenador baterPonto");
    }

    @Override
    public void cumprirCargaHoraria() {
        System.out.println("Coordenador cumprirHorario");
    }
}
