public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;

    public Cliente(String nome, String cpf, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String toString() {
        return "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nProfissao: " + this.profissao;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof Cliente) {
            Cliente cliente = (Cliente) obj;
            return this.cpf.equals(cliente.getCpf());
        }

        return false;
    }



}
