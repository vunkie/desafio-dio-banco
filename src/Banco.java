import java.util.*;

public class Banco {
    private List<Conta> contas;
    private int quantidadeContas;


    public Banco() {
        this.contas = new ArrayList<Conta>();
        this.quantidadeContas = 0;
    }
    

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
        this.quantidadeContas++;
    }

    public void removerConta(Conta conta) {
        this.contas.remove(conta);
        this.quantidadeContas--;
    }

    public void imprimirContas() {
        for (Conta conta : this.contas) {
            conta.imprimirInfo();
        }
    }

    public Conta buscarConta(int numero) {
        for (Conta conta : this.contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public int getQuantidadeContas() {
        return this.quantidadeContas;
    }


    public List<Conta> getContas() {
        return contas;
    }


    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }


}
