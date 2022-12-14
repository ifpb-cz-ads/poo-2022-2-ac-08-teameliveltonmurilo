public abstract class Conta {
    private int numero;
    private Cliente titular;
    protected double saldo;

    public Conta(int numero, Cliente titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta(int numero, Cliente titular){
        this.numero = numero;
        this.titular = titular;
        saldo = 0;
    }

    public abstract boolean sacar(double valor);

    public Conta(int numero, String nomeTitular, String cpfTitular){
        this.numero = numero;
        this.titular = new Cliente(nomeTitular, cpfTitular);
        saldo = 0;
    }

    public Cliente getTitular(){
        return titular;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }
    
}
