package Model;

import exception.SaldoInicialnsuficienteException;

public class ContaPoupanca extends  Conta{

    private Double taxaJuros;

    public ContaPoupanca(Double saldo, Double taxaJuros) throws SaldoInicialnsuficienteException {
        super(saldo);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public Double CalculaJuros(){
        //setSaldo(getSaldo() + taxaJuros * getSaldo());
        return taxaJuros * getSaldo();
    }
}
