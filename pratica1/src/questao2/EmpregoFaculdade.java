package questao2;

public class EmpregadoDaFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    public EmpregadoDaFaculdade(String nome, double salario, int horasAula) {
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }

    double getGastos() {
        return this.salario + (40 * this.horasAula); // Adicionando o bônus de R$ 40 por hora/aula
    }

    String getInfo() {
        return "nome: " + this.nome + " com salário: " + (this.salario + (40 * this.horasAula));
    }

    public static void main(String[] args) {
        EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade("João", 2000.0, 10);

        System.out.println("Gastos: " + empregado.getGastos());
        System.out.println("Informações: " + empregado.getInfo());
    }
}
