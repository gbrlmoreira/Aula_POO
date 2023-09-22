package br.com.questao3_veiculo;

import javax.swing.*;

public class Caminhao {
    private String placa;
    private String ano;
    private String eixos;

    public Caminhao(String placa, String ano, String eixos) {
        this.placa = placa;
        this.ano = ano;
        this.eixos = eixos;
    }
    public String getPlaca() {
        return placa;
    }
    public String getAno() {
        return ano;
    }
    public String getEixos() {
        return eixos;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public void setEixos(String eixos) {
        this.eixos = eixos;
    }

    public Object exibirDados(){
        JOptionPane.showMessageDialog(null,"Dados do Caminhão\n\n" + "Placa: " 
        							+ getPlaca() + "\nAno: " + getAno()+  "\nAssentos: " + getEixos());

        return null;
    }
}