package Banco;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);
        if(tipo == "CC"){
            this.setSaldo(50);
        }
        else if (tipo == "CP"){
            this.setSaldo(150);
        }
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        }
        else if(this.getSaldo() < 0){
            System.out.println("Conta em débito");
        }
        else {
            setStatus(false);
        }
    }

    public void depositar(float v){
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }
        else{
            System.out.println("Impossível depositar");
        }
    }

    public void sacar(float v){
        if(this.getStatus() == true){
            if (getSaldo() >= v){
                setSaldo(getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else{
            System.out.println("Impossível sacar");
        }
    }

    public void pagarMensal(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus() == true){
            if (getSaldo() > v){
                this.setSaldo(getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + getDono());
            } else{
                System.out.println("Saldo insuficiente");
            }
        }
        else {
            System.out.println("Impossível pagar");
        }

    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getDono() {
        return dono;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean getStatus(){
        return status;
    }


}
