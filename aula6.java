public class Calculadora {
    int operando1;
    int operando2;
    int resposta;

    Calculadora(){

    }

    Calculadora(int op1, int op2){
        operando1 = op1;
        operando2 = op2;
    }

    int calcularSoma(){
        resposta = operando1 + operando2;
        return resposta;
    }

    int calcularSubtracao(){
        resposta = operando1 + operando2;
        return resposta;
    }

    int calcularMultiplicacao(){
        resposta = operando1 + operando2;
        return resposta;
    }

    int calcularDivisao(){
        resposta = operando1 + operando2;
        return resposta;
    }

    int inverterSinal(){
        if (operando1 > 0){
            resposta = operando1 * -1;
            return resposta;
        }
        if (operando1 < 0){
            resposta = operando1 * -1;
            return resposta;
        }
        return 0;
    }
}
