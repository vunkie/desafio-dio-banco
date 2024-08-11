public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    private static final double TAXA_DEPOSITO = 0.10;

    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Corrente");
        this.imprimirInfo();
    }


    @Override  
    public void depositar(double valor) {
        this.saldo += valor - TAXA_DEPOSITO;
    }

    

}
