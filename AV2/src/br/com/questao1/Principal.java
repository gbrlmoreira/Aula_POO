package br.com.questao1;

import java.util.ArrayList;
import java.util.Date;

public class Principal {
    private static br.com.questao1.Produto Produto;

    public static void main(String[] args) {
        Produto produto1 = new Produto("Toddy", 11.0, "Achocolatado em pó 800g", 74, new Categoria("Alimentos"));
        Produto produto2 = new Produto("Coca-Cola", 8.0, "Refrigerante de 1 litro", 13, new Categoria("Bebidas"));
        Produto produto3 = new Produto("OMO", 25.0, "Sabão em pó para roupas 1kg", 32, new Categoria("Limpeza"));
        Produto produto4 = new Produto("Lays", 8.0, "Batata Frita Lays Pacote 80g", 68, new Categoria("Alimentos"));
        Produto produto5 = new Produto("Heineken", 9.0, "Cerveja 600ml", 47, new Categoria("Bebida alcoólica"));

        Pedido pedido1 = new Pedido(1, getCurrentDateTime(), 0, 1);
        Pedido pedido2 = new Pedido(2, getCurrentDateTime(), 0, 1);

        PedidoItem item1 = new PedidoItem(1, "Toddy", 11.0, 2);
        PedidoItem item2 = new PedidoItem(2, "Coca-Cola", 8.0, 3);
        PedidoItem item3 = new PedidoItem(3, "OMO", 25.0, 1);

        PedidoItem item4 = new PedidoItem(4, "Lays", 8.0, 2);
        PedidoItem item5 = new PedidoItem(5, "Heineken", 9.0, 4);

        pedido1.inserirItensPedido(item1);
        pedido1.inserirItensPedido(item2);
        pedido1.inserirItensPedido(item3);

        pedido2.inserirItensPedido(item4);
        pedido2.inserirItensPedido(item5);


        atualizarEstoqueAposInsercao(pedido1);
        atualizarEstoqueAposInsercao(pedido2);

        atualizarStatusPedidoPara2(pedido1);
        atualizarStatusPedidoPara2(pedido2);

        calcularValorTotalAPagar(pedido1);
        calcularValorTotalAPagar(pedido2);
    }

    private static String getCurrentDateTime() {
        return new Date().toString();
    }
    
    private static boolean validarPedidoItem(PedidoItem pedidoItem, ArrayList<Produto> listaProdutos) {
        for (Produto produto : listaProdutos) {
            if (produto.getNomeProduto().equals(pedidoItem.getNomeItem())) {
                return true;
            }
        }
        return false;
    }

    private static void atualizarEstoqueAposInsercao(Pedido pedido) {
        ArrayList<PedidoItem> itensPedido = pedido.getItensPedido();

        for (PedidoItem item : itensPedido) {
            Produto produto = buscarProdutoPorDescricao(item.getDescricaoItem());
            if (produto != null) {
                item.atualizaEstoqueItem(produto, item.getQtdItem());
                System.out.println("Estoque atualizado para o produto: " + produto.getNomeProduto());
            } else {
                System.out.println("Produto não encontrado para o item: " + item.getDescricaoItem());
            }
        }
    }

    private static Produto buscarProdutoPorDescricao(String descricao) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(new Produto("Toddy", 11.0, "Achocolatado em pó", 74, new Categoria("Alimentos")));
        listaProdutos.add(new Produto("Coca-Cola", 8.0, "Refrigerante de 1 litro", 13, new Categoria("Bebidas")));
        listaProdutos.add(new Produto("OMO", 25.0, "Sabão em pó para roupas 1kg", 32, new Categoria("Limpeza")));
        listaProdutos.add(new Produto("Lays", 8.0, "Batata Frita Lays Pacote 80g", 68, new Categoria("Alimentos")));
        listaProdutos.add(new Produto("Heineken", 9.0, "Cerveja 600ml", 47, new Categoria("Bebida alcoólica")));

        for (Produto produto : listaProdutos) {
            if (produto.getDescProduto().equals(descricao)) {
                return produto;
            }
        }
        return null;
    }


    private static void atualizarStatusPedidoPara2(Pedido pedido) {
        pedido.alterarStatus(2);
        System.out.println("Status do Pedido " + pedido.getNumeroPedido() + " atualizado para 2.");
    }

    private static void calcularValorTotalAPagar(Pedido pedido) {
        double totalPagar = pedido.calculaTotalPagar();
        System.out.println("Valor total a pagar para o Pedido " + pedido.getNumeroPedido() + ": " + totalPagar);
    }
}

