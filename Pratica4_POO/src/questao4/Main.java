package questao4;

public class Main {
    public static void main(String[] args) {
        CelularFabricanteA celularA = new CelularFabricanteA(false, 6800.00);
        CelularFabricanteB celularB = new CelularFabricanteB(false, 5200.00);

        System.out.println("Celular Fabricante A:");
        System.out.println("TV: " + celularA.tv);
        System.out.println("Preço: R$ " + celularA.preco);

        System.out.println("\nCelular Fabricante B:");
        System.out.println("Rádio: " + celularB.radio);
        System.out.println("Preço: R$ " + celularB.preco);
    }
}
