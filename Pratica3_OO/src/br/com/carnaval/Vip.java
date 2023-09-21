package br.com.carnaval;

public class Vip extends Ingresso{

    private double valorAdicional;

    public Vip(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }

    public void valorImprime() {
        System.out.println("Ingresso Vip - valor"
                            + (getValorIngresso() + valorAdicional));
    }
}
