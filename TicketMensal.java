public class TicketMensal extends Ticket{
    private String nome;
    private int cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return  "\nCliente: " + nome +
                "\nCPF: " + cpf +
                super.toString();
    }
}
