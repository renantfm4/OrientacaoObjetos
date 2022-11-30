import java.util.Scanner;

public class bbb {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva o valor a: ");
        int a = sc.nextInt();
        System.out.println("Escreva o valor b: ");
        int b = sc.nextInt();

        System.out.println("Escreva o tipo de polígono: ");
        String poligono = input.nextLine();

        double f = Math.pow(a,2);
        double g = Math.pow(b,2);
        double ladoc = (int) Math.sqrt(f+g);


        if (poligono.equals("triangulo retangulo")) {
            System.out.println("Área: "+(a * ladoc) / 2);
            System.out.println("Perimetro: "+ (a+b+ladoc));
        } else if (poligono.equals("retangulo")) {
            System.out.println("Área: "+a*b);
            System.out.println("Perimetro: "+2*(a+b));
        }
    }
}
