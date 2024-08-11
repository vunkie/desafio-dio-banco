public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();

        Cliente c1 = new Cliente("Fulano", "123.456.789-00", "Desenvolvedor");
        Cliente c2 = new Cliente("Ciclano", "987.654.321-00", "Analista");

        ContaCorrente cc = new ContaCorrente(c1);
        ContaPoupanca cp = new ContaPoupanca(c2);

        //TESTES

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);



        cc.depositar(1000);


        cc.transferir(250, cp);

        //banco.buscarConta(2).imprimirInfo();
        banco.imprimirContas();
        cp.atualizarSaldo();
        banco.removerConta(cc);
        banco.imprimirContas();

    }

}
