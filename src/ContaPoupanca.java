public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Poupanca");
        this.imprimirInfo();
    }

    private static final double JUROS = 0.02;
    
    public void atualizarSaldo() {
        this.saldo += this.saldo * JUROS;
    }
    

}
