package interfaces;

public class ContaCorrente implements Conta{
    private double saldo = 100.00;
    private final double taxaOperacao = 0.60;

    @Override
    public void depositar(double valor){
        this.saldo += valor - taxaOperacao;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor - taxaOperacao;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
}
