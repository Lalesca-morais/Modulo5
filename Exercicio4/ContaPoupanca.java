package Exercicio4;
public class ContaPoupanca implements Tributavel{
    @Override
    public double calcularTributo(double saldo) {
        saldo = saldo + 42.00;
        return saldo;
    }
}
