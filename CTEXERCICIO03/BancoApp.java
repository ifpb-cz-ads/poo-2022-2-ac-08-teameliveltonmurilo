import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        System.out.println("Por favor, digite sua escolha\n" + "1- Cadastrar conta\n" + "0 - Sair");
        Scanner entrada = new Scanner(System.in);
        int escolha = entrada.nextInt();
        int numero;
        String nomeTitular;
        String cpfTitular;
        Cliente cliente;
        Scanner nomeContaEspecial = new Scanner(System.in);

        while(escolha == 1){
            System.out.println("Por favor, digite sua escolha\n" + "1 - Cadastrar Conta especial\n" + "2 - Cadastrar Conta poupança");
            escolha = entrada.nextInt();

            switch(escolha){
                case 1: 
                System.out.print("Digite o número da conta: ");
                Scanner numContaEspecial = new Scanner(System.in);
                numero = numContaEspecial.nextInt();

                System.out.print("Digite o nome da conta: ");
                nomeTitular = nomeContaEspecial.nextLine();
                System.out.print("Digite o CPF da conta: ");
                cpfTitular = nomeContaEspecial.nextLine();
                cliente = new Cliente(nomeTitular, cpfTitular);                
                
                ContaEspecial contaEspecial = new ContaEspecial(numero, cliente);

                System.out.println("\n|| CONTA ESPECIAL ||\n" + contaEspecial.getNumero() + " " + contaEspecial.getTitular());

                
                break;

                case 2:
                System.out.print("Digite o número da conta: ");
                Scanner numContaPoupanca = new Scanner(System.in);
                numero = numContaPoupanca.nextInt();

                System.out.print("Digite o nome da conta: ");
                nomeTitular = nomeContaEspecial.nextLine();
                System.out.print("Digite o CPF da conta: ");
                cpfTitular = nomeContaEspecial.nextLine();
                cliente = new Cliente(nomeTitular, cpfTitular);
                System.out.print("Digite o saldo da conta: ");
                int saldo = nomeContaEspecial.nextInt();

                ContaPoupanca contaPoupanca = new ContaPoupanca(numero, cliente, saldo);

                System.out.println("\n|| CONTA POUPANÇA ||\n" + contaPoupanca.getNumero() + " " + contaPoupanca.getTitular());
                break;
            }
            

        };

        entrada.close();



    }
}