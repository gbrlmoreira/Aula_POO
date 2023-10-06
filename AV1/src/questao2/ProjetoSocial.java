package questao2;
import javax.swing.*;
import java.util.Scanner;

public class ProjetoSocial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Projeto Distribuir Alimentos");
            System.out.println("2. Cadastrar Projeto Trabalho Voluntário");
            System.out.println("3. Sair");

            choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (choice) {
                case 1:
                    System.out.println("Digite o nome do projeto:");
                    String nomeAlimento = scanner.nextLine();
                    System.out.println("Digite a descrição do projeto:");
                    String descricaoAlimento = scanner.nextLine();
                    System.out.println("Digite o endereço:");
                    String enderecoAlimento = scanner.nextLine();
                    System.out.println("Digite a data de início:");
                    String dataInicioAlimento = scanner.nextLine();
                    System.out.println("Digite a data de fim (deixe em branco se não aplicável):");
                    String dataFimAlimento = scanner.nextLine();
                    System.out.println("Digite a descrição do alimento:");
                    String descAlimento = scanner.nextLine();
                    System.out.println("Digite a quantidade:");
                    float qtdeAlimento = scanner.nextFloat();

                    DistribuicaoAlimento projetoAlimento = new DistribuicaoAlimento(nomeAlimento, descricaoAlimento, enderecoAlimento,
                            dataInicioAlimento, dataFimAlimento, descAlimento, qtdeAlimento);

                    if (projetoAlimento.validaProjeto()) {
                        System.out.println("Projeto válido:");
                        System.out.println(projetoAlimento.imprimeProjeto());
                    } else {
                        System.out.println("Projeto inválido. Data de Fim não está vazia.");
                    }
                    break;

                case 2:
                    System.out.println("Digite o nome do projeto:");
                    String nomeTrabalho = scanner.nextLine();
                    System.out.println("Digite a descrição do projeto:");
                    String descricaoTrabalho = scanner.nextLine();
                    System.out.println("Digite o endereço:");
                    String enderecoTrabalho = scanner.nextLine();
                    System.out.println("Digite a data de início:");
                    String dataInicioTrabalho = scanner.nextLine();
                    System.out.println("Digite a data de fim (deixe em branco se não aplicável):");
                    String dataFimTrabalho = scanner.nextLine();
                    System.out.println("Digite o tipo de trabalho:");
                    String tipoTrabalho = scanner.nextLine();
                    System.out.println("Digite a duração do trabalho (horas):");
                    int duracaoTrabalho = scanner.nextInt();

                    TrabalhoVoluntario projetoTrabalho = new TrabalhoVoluntario(nomeTrabalho, descricaoTrabalho, enderecoTrabalho,
                            dataInicioTrabalho, dataFimTrabalho, tipoTrabalho, duracaoTrabalho);

                    if (projetoTrabalho.validaProjeto()) {
                        System.out.println("Projeto válido:");
                        System.out.println(projetoTrabalho.imprimeProjeto());
                    } else {
                        System.out.println("Projeto inválido. Duração do Trabalho menor ou igual a 2 horas.");
                    }
                    break;

                case 3:
                    System.out.println("Saindo do programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
