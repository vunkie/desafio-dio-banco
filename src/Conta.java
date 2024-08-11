public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public Cliente getCliente() {
        return this.cliente;
    }


    public String toString() {
        return "Agencia: " + this.agencia + "\nNumero: " + this.numero + "\nSaldo: " + this.saldo + "\nCliente: " + this.cliente;
    }

    protected void imprimirInfo() {
        System.out.println(String.format("Agencia: %02d", this.agencia));
        System.out.println(String.format("Conta: %04d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println("Cliente: " + this.cliente);
        System.out.println("=================================");
    }

}
