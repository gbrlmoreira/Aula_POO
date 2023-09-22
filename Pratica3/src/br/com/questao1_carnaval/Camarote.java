package br.com.questao1_carnaval;

public class Camarote extends Ingresso{
    private double valorAdicional;
    private String localizacao;

    public Camarote(double valor, double valorAdicional, String localizacao) {
        super(valor);
        this.valorAdicional = valorAdicional;
        this.localizacao = localizacao;
    }

    public void imprimeValor() {
        System.out.println("Ingresso Camarote - Localização: "
                + localizacao + " - Valor Total: R$" + (getValorIngresso() + valorAdicional));
    }
}