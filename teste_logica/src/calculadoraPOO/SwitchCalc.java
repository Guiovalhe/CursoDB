package calculadoraPOO;

public class SwitchCalc {
    public static void switchCalc(String[] args); {
        switch (operacao) {
        case '+': 
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            break;
        case '-':
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            break;
        case '*':
            System.out.println(num1 * num2);
            break;
        case '/':
            System.out.println(num1 / num2);
            break;
        default:
            System.out.println("Erro.");
    }
}
}