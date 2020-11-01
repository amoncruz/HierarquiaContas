package Model;

import exception.SaldoInicialnsuficienteException;

public class ContaCorrente extends Conta{

    private Double taxaCobradaTransacao;

    public ContaCorrente(Double saldo,Double taxaCobradaTransacao) throws SaldoInicialnsuficienteException {
        super(saldo);
        this.taxaCobradaTransacao = taxaCobradaTransacao;
    }


    @Override
    public boolean Debito(Double valor) {
        if(getSaldo() - valor - taxaCobradaTransacao < 0){
            System.out.println("O valor do débito excedeu o saldo da conta");
            return false;
        }

        setSaldo(getSaldo() - valor - taxaCobradaTransacao);
        System.out.println("Transação realizada com sucesso!");

        return true;
    }

    @Override
    public boolean Credito(Double valor) {
        if(getSaldo() + valor - taxaCobradaTransacao < 0){
            System.out.println("O valor do débito excedeu o saldo da conta");
            return false;
        }
        System.out.println("Transação realizada com sucesso!");
        setSaldo(getSaldo() + valor - taxaCobradaTransacao);

        return true;

    }
}
