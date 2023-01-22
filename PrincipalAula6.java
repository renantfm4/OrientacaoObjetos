import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Calculadora calculadora;
        Scanner s = new Scanner(System.in);
        System.out.println("Usuário deseja realizar um cálculo? (s/n)");
        String input = s.nextLine();

        if (input.equals("s")) {
            System.out.println("Informe o valor do operando1:");
            String strOp1 = s.nextLine();
            int operando1 = Integer.parseInt(strOp1);
            System.out.println("Informe o valor do operando2:");
            String strOp2 = s.nextLine();
            int operando2 = Integer.parseInt(strOp2);
            System.out.println("Informe a operação desejada: (+, -, *, /, ! -> inversão de sinal)");
            String input2 = s.nextLine();
            if (input2.equals("+")) {
                calculadora = new Calculadora(operando1, operando2);
                int resultado = calculadora.calcularSoma();
                System.out.println(resultado);
            }
            if (input2.equals("-")) {
                calculadora = new Calculadora(operando1, operando2);
                int resultado = calculadora.calcularSubtracao();
                System.out.println(resultado);
            }
            if (input2.equals("*")) {
                calculadora = new Calculadora(operando1, operando2);
                int resultado = calculadora.calcularMultiplicacao();
                System.out.println(resultado);
            }
            if (input2.equals("/")) {
                calculadora = new Calculadora(operando1, operando2);
                int resultado = calculadora.calcularDivisao();
                System.out.println(resultado);
            }
            if (input2.equals("!")) {
                calculadora = new Calculadora(operando1, operando2);
                int resultado = calculadora.inverterSinal();
                System.out.println(resultado);
            } else {
            }
        }
        else{
        }
    }
}
