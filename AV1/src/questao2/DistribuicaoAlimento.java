package questao2;

class DistribuicaoAlimento extends Projeto {
    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    @Override
    public boolean validaProjeto() {
        return getDatafim().isEmpty();
    }

    @Override
    public String imprimeProjeto() {
        return "Nome do Projeto: " + getNomeProjeto() + "\nDescrição: " + getDescricao() + "\nData de Início: " + getDatainicio()
                + "\nData de Fim: " + getDatafim() + "\nDescrição do Alimento: " + getDescAlimento() + "\nQuantidade: " + getQtde();
    }
}
