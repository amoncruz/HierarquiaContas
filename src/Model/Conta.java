package Model;

import exception.SaldoInicialnsuficienteException;

public class Conta {

    private Double saldo;
    protected String tipo;

    public Conta(Double saldo) throws SaldoInicialnsuficienteException {

        if(saldo < 0 ){
            throw new SaldoInicialnsuficienteException("Não é possível criar conta com saldo negativo");
        }

        this.saldo = saldo;
        this.tipo = tipo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean Debito(Double valor){
        if(saldo - valor < 0) {
            System.out.println("O valor do débito excedeu o saldo da conta");
            return false;
        }
            this.saldo = saldo - valor;
            System.out.println("Transação realizada com sucesso");
        return true;

    }

    public boolean Credito(Double valor){
        this.saldo = saldo + valor;
        return true;
        //System.out.println("Transação realizada com sucesso");
    }



}
