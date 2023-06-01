package Exercicio4;
public class ContaCorrente implements Tributavel{
    @Override
    public double calcularTributo(double saldo) {
        saldo = saldo * 0.01;
        return saldo;
    }
}
