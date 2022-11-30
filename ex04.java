import java.util.Scanner;

public class eee {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o tipo de figura geometrica: ");
        String figurageometrica = sc.nextLine();

        if(figurageometrica.equals("circulo")){
            System.out.println("Escreva o valor do raio: ");
            int r = sc.nextInt();
            System.out.println("Área: " + (3.14*(Math.pow(r,2))));
            System.out.println("Perimetro: " + (2*3.14*r));
        } else if(figurageometrica.equals("retangulo")){
            System.out.println("Escreva o valor da base: ");
            int b = sc.nextInt();
            System.out.println("Escreva o valor da altura: ");
            int a = sc.nextInt();
            System.out.println("Altura: " + b*a);
            System.out.println("Perimetro: " + ((b*2) + (a*2)));
        } else if(figurageometrica.equals("quadrado")){
            System.out.println("Escreva o valor dos lados: ");
            int l = sc.nextInt();
            System.out.println("Perimetro: " + (4*l));
            System.out.println("Área: " + (Math.pow(l,2)));
        }

        {

        }

    }
}
