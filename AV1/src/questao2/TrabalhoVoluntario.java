package questao2;

class TrabalhoVoluntario extends Projeto {
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim, String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    @Override
    public boolean validaProjeto() {
        return duracaoTrabalho > 2;
    }

    @Override
    public String imprimeProjeto() {
        return "Nome do Projeto: " + getNomeProjeto() + "\nDescrição: " + getDescricao() + "\nData de Início: " + getDatainicio()
                + "\nData de Fim: " + getDatafim() + "\nTipo de Trabalho: " + getTipoTrabalho() + "\nDuração do Trabalho (horas): " + getDuracaoTrabalho();
    }
}

