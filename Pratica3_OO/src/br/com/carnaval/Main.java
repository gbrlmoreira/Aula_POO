package br.com.carnaval;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Escolha a sua opcao: "
                +"\n1) Ingresso Normal"
                +"\n2) VIP"
                +"\n3) Camarote"
                +"\n Sua opcao: ");

        Ingresso ingressoSelecionado = null;
        int opc = in.nextInt();
        if (opc == 1){
            ingressoSelecionado = new Normal(50);
        }else if (opc == 2){
            ingressoSelecionado= new Vip(50, 20);
        }else if (opc == 3){
            ingressoSelecionado= new Camarote(50, 40, "Belo Horizonte");
        }
    }
}
