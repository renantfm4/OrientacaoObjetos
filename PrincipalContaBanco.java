package Banco;

public class Aula {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(2222);
        p1.setDono("Cleiton");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(3333);
        p2.setDono("Josefina");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);

        p2.sacar(100);


        p1.estadoAtual();
        p2.estadoAtual();
    }
}
