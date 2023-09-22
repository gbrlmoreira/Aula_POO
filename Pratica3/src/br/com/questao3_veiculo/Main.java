package br.com.questao3_veiculo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main extends JFrame{
    // Atributos
    private JPanel painel = new JPanel();
    private JButton jButton1 = new JButton("Veiculo");
    private JButton jButton2 = new JButton("Ônibus");
    private JButton jButton3 = new JButton("Caminhão");
    private JLabel jLabelMensagem = new JLabel("Exemplo de Simples Janela");
    // Construtor
    public Main(){
        this.setTitle("Veículos");
        this.setSize(400,200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255,255,255));
        painel.add(jButton1);
        painel.add(jButton2);
        painel.add(jButton3);
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String placa = JOptionPane.showInputDialog("Digite a placa");
                String ano = JOptionPane.showInputDialog("Digite o ano");
                Veiculo veiculo = new Veiculo(placa,ano);
                JOptionPane.showMessageDialog(null,veiculo.exibirDados());
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String placa = JOptionPane.showInputDialog("Digite a placa");
                String ano = JOptionPane.showInputDialog("Digite o ano");
                String assento = JOptionPane.showInputDialog("Digite o número de assentos");
                Onibus onibus = new Onibus(placa,ano,assento);
                JOptionPane.showMessageDialog(null,onibus.exibirDados());

            }
        });
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String placa = JOptionPane.showInputDialog("Digite a placa");
                String ano = JOptionPane.showInputDialog("Digite o ano");
                String eixos = JOptionPane.showInputDialog("Digite o número de eixos");
                Caminhao caminhao = new Caminhao(placa,ano,eixos);
                JOptionPane.showMessageDialog(null,caminhao.exibirDados());
            }
        });
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); // Centralizar janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true); // Exibir janela
    }
    public static void main(String[] args) {
        new Main();

    }

}