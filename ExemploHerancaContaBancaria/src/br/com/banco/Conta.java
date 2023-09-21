package br.com.banco;
public class Conta {
    long numero;
    double saldo;
    public Conta(long n) {
        numero = n;
        saldo = 0;
    }
    public void depositar(double v){
        if (v>0)
            saldo = saldo + v;
    }
    public boolean sacar(double v){
        if ( v>0 && ((saldo-v) >= 0) ){
            saldo = saldo - v;
            return true;
        }
        else
            return false;
    }
    public double consultarSaldo(){
        return(saldo);
    }
    public long obterNumero(){
        return(numero);
    }
} // Fim da classe Conta

