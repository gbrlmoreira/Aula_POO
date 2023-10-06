package questao1;

public class Encontrar {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Gabriel", "gbrlmoreira@outlook.com", "12345");
        AchadoPerdido acpd = new AchadoPerdido("Segunda guerra", "Livro Alugado", "História", "Perdido");

        System.out.printf(acpd.buscarTitulo());
        System.out.printf(acpd.vizualizarDetalhes());

    }
}
