package br.com.carnaval;

public class Normal extends Ingresso{
    public Normal(double valorIngresso) {
        super(valorIngresso);
    }
    public void imprimeIngresso() {
        System.out.println("Ingresso Normal - Valor"
                             + getValorIngresso());
    }
}
