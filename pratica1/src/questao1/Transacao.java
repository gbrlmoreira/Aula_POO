package questao1;

public class Transacao {
    private Cliente cliente;
    private Carro carro;
    private String tipo; // Pode ser "Compra" ou "Venda"
    private double valor;

    // Construtor
    public Transacao(Cliente cliente, Carro carro, String tipo, double valor) {
        this.cliente = cliente;
        this.carro = carro;
        this.tipo = tipo;
        this.valor = valor;
    }

    // Getters e Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
