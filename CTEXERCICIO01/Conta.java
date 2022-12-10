public abstract class Conta {
    private int numero;
    private String nome_titular;
    protected double saldo;

    public Conta(int numero, String nome_titular, double saldo){
        this.numero = numero;
        this.nome_titular = nome_titular;
        this.saldo = saldo;
    }

    public Conta(int numero, String nome_titular){
        this.numero = numero;
        this.nome_titular = nome_titular;
        saldo = 0;
    }

    public abstract boolean sacar(double valor);
    
}
