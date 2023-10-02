package questao4;

class CelularFabricanteA extends CelularComum {
    boolean tv;

    CelularFabricanteA(boolean tv, double preco) {
        super(true, true, true, true, preco);
        this.tv = tv;
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
