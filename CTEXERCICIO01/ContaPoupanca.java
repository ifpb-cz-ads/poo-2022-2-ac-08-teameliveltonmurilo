public class ContaPoupanca extends Conta{
    public boolean sacar (double valor){
        if(this.saldo>= valor){
            return true;
        } else {
            return false;
        }
    }

    public ContaPoupanca (int numero, String nome_titular, double saldo){
        super(numero, nome_titular, saldo);
    }

}
