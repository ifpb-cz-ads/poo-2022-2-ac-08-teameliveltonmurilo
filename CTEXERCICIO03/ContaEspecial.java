public class ContaEspecial extends Conta {
    private double limite;

    public boolean sacar (double valor){
        if(valor <= this.limite + this.saldo){
            saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public ContaEspecial(int numero, Cliente titular){
        super(numero, titular);
    }

}
