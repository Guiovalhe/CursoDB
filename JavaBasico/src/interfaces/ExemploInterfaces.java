package interfaces;

public class ExemploInterfaces {
                            
    
    public static void main(String[] args) {
        calcularSalarioParaFuncionario(new Coordenador());
        
        calcularSalarioParaFuncionario(new Gerente());
       
        calcularSalarioParaFuncionario(new Operador());
    }

    static void calcularSalarioParaFuncionario(Funcionario funcionario) {
        funcionario.calcularSalario();
        funcionario.baterPonto();
        funcionario.cumprirCargaHoraria();
    };
//        if (funcionario instaceof Coordenador) {
//            System.out.println("calcularSalarioParaCoordenador");
//        } else if (funcionario instance of Gerente) {
//            System.out.println("calcularSalarioParaGerente");
//        } else if (funcionario instanceof Operador) {
//            System.out.println("calcularSalarioParaOperador");
//        }
        
        //calculo do salário do perador
      //  System.out.println("calcularSalarioParaOperador");

    static void calcularSalarioParaCoordenador(Coordenador coordenador) {
        
    }
    static void calcularSalarioParaGerente(Gerente gerente) {
        
    }
}
