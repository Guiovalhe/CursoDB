//C?digo do colega Morency, copiei do git com a explica??o dele.

package exercicios;

public class Exercicio2 {

    public static void main(String[] args) {
        String nome = "Caneta";
        double preco = 2;
        double quant = 50;

        if(quant >50){
            double F = (preco * quant);
            double desc = F *0.25;
            double precoF = F - desc;
            System.out.println("Item comprado: "+ nome+ ". Valor Total: R$"+precoF);
        }else if(quant>=21 && quant <=50){
            double F = (preco * quant);
            double desc = F *0.20;
            double precoF = F - desc;
            System.out.println("Item comprado: "+ nome+ ". Valor Total: R$"+precoF);
        } else if(quant >=11 && quant <=20){
            double F = (preco * quant);
            double desc = F *0.10;
            double precoF = F - desc;
            System.out.println("Item comprado: "+ nome+ ". Valor Total: R$"+precoF);
        } else{
            double F = (preco * quant);
            System.out.println("Item comprado: "+ nome+ ". Valor Total: R$"+F);
        }
    }

}
