public class Principal {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora(10,20);
        c1.somar();
        Calculadora c2 = new Calculadora();
        c2.setOp1(4);
        c2.setOp2(6);
        c2.somar();
        System.out.println("O resultado da soma de: "+ c1.getOp1() + " + " + c1.getOp2() + " é = " + c1.getResultado());
        System.out.println("O resultado da soma de: "+ c2.getOp1() + " + " + c2.getOp2() + " é = " + c2.getResultado());
        c1.subtracao();
        System.out.println("O resultado da subtração de: "+ c1.getOp1() + " - " + c1.getOp2() + " é = " + c1.getResultado());
        c2.subtracao();
        System.out.println("O resultado da subtração de: "+ c2.getOp1() + " - " + c2.getOp2() + " é = " + c2.getResultado());
    }
}
