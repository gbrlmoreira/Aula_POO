package br.com.questao1;

public class PedidoItem {
    private int nomeItem;
    private String descricaoItem;
    private double precoUnitario;
    private int qtdItem;

    public PedidoItem(int nomeItem, String descricaoItem, double precoUnitario, int qtdItem) {
        this.nomeItem = nomeItem;
        this.descricaoItem = descricaoItem;
        this.precoUnitario = precoUnitario;
        this.qtdItem = qtdItem;
    }

    public void atualizaEstoqueItem(Produto produto, int quantidade) {
        int novoEstoque = produto.getEstoqueAtual() - quantidade;
        produto.setEstoqueAtual(novoEstoque);
    }

    public int getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(int nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }
}
;



