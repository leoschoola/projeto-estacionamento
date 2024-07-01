public class Ticket extends Entrada {
    private int id;
    private String veiculo;
    private String cor;
    private String placa;
    private String marca;
    private String modelo;

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public int ticketAvulso() {
        return id + 1;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "\nTicket: " + ticketAvulso() +
                "\nVeículo: " + veiculo +
                "\nPlaca: " + placa +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nCor: " + cor;

    }
}
