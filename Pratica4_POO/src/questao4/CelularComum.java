package questao4;

abstract class CelularComum implements Celular {
    boolean enviarMensagem;
    boolean acessarInternet;
    boolean emails;
    boolean verificarSistemaDeArquivos;
    double preco;

    CelularComum(boolean enviarMensagem, boolean acessarInternet, boolean emails, boolean verificarSistemaDeArquivos, double preco) {
        this.enviarMensagem = enviarMensagem;
        this.acessarInternet = acessarInternet;
        this.emails = emails;
        this.verificarSistemaDeArquivos = verificarSistemaDeArquivos;
        this.preco = preco;
    }
}
