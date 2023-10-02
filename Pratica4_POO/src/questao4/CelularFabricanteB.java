package questao4;

class CelularFabricanteB extends CelularComum {
    boolean radio;

    CelularFabricanteB(boolean radio, double preco) {
        super(true, true, true, true, preco);
        this.radio = radio;
    }

    @Override
    public boolean ligar() {
        return true;
    }

    @Override
    public boolean desligar() {
        return true;
    }

    @Override
    public boolean camera() {
        return true;
    }

    @Override
    public boolean foneDeOuvido() {
        return true;
    }

    @Override
    public boolean controleDeVolume() {
        return true;
    }
}
