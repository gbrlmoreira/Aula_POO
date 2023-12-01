package br.com.questao1;

import java.util.ArrayList;

public class Pedido {
    private int numeroPedido;
    private String dataHoraPedido;
    private double precoTotal;
    private int statusPedido;
    private ArrayList<PedidoItem> itensPedido;

    public Pedido(int numeroPedido, String dataHoraPedido, double precoTotal, int statusPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.precoTotal = precoTotal;
        this.statusPedido = statusPedido;
        this.itensPedido = new ArrayList<>();
    }

    public void alterarStatus(int novoStatus) {
        this.statusPedido = novoStatus;
    }

    public boolean consultarPedido(Pedido pedidoParaConsultar) {
        return this.numeroPedido == pedidoParaConsultar.getNumeroPedido();
    }

    public void inserirItensPedido(PedidoItem novoItem) {
        this.itensPedido.add(novoItem);
    }

    public void excluirItensPedido(PedidoItem itemParaExcluir) {
        this.itensPedido.remove(itemParaExcluir);
    }

    public double calculaTotalPagar() {
        double total = 0;
        for (PedidoItem item : itensPedido) {
            total += item.getPrecoUnitario();
        }
        this.precoTotal = total;
        return total;
    }


    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getDataHoraPedido() {
        return dataHoraPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public ArrayList<PedidoItem> getItensPedido() {
        return itensPedido;
    }
}

