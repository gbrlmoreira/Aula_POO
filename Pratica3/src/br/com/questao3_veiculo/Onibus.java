package br.com.questao3_veiculo;

import javax.swing.*;

public class Onibus {
    private String placa;
    private String ano;
    private String assento;

    public Onibus(String placa, String ano, String assento) {
        this.placa = placa;
        this.ano = ano;
        this.assento = assento;
    }

    public String getPlaca() {
        return placa;
    }
    public String getAno() {
        return ano;
    }
    public String getAssento() {
        return assento;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public void setAssento(String assento) {
        this.assento = assento;
    }

    public Object exibirDados(){
        JOptionPane.showMessageDialog(null,"Dados do Ônibus\n\n" + "Placa: " + getPlaca() + "\nAno: " + getAno()+  "\nAssentos: " + getAssento());

        return null;
    }
}