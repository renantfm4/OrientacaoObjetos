import java.util.Scanner;

public class ccc {
    public static void main(String[] args) {


        System.out.println("--- Seja Bem-vindo!! ---");
        System.out.println("Verifique uma das opções: ");
        System.out.println("1: Verificar se é um triângulo.");
        System.out.println("2: Calcular a área e o polígono.");
        System.out.println("3: Sair da aplicação. ");
        System.out.println("Digite um número: ");

        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        Scanner input = new Scanner(System.in);
        Scanner ms = new Scanner(System.in);

        switch(opcao) {
            case 1:
                System.out.println("Escreva o primeiro número: ");
                int r = ms.nextInt();
                System.out.println("Escreva o segundo número: ");
                int s = ms.nextInt();
                System.out.println("Escreva o terceiro número: ");
                int p = ms.nextInt();

                triangulo(r, s, p);

                break;

            case 2:
                System.out.println("Escreva o valor a: ");
                int a = sc.nextInt();
                System.out.println("Escreva o valor b: ");
                int b = sc.nextInt();

                System.out.println("Escreva o tipo de polígono (triangulo retangulo ou retangulo): ");
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
