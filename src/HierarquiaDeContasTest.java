import Model.*;
import exception.SaldoInicialnsuficienteException;

import java.util.ArrayList;
import java.util.List;

public class HierarquiaDeContasTest {
    public static void main(String[] args) throws SaldoInicialnsuficienteException {

        ContaPoupanca contaReges = new ContaPoupanca(300.0,0.45);

        List<Cliente> clienteList  = new ArrayList<>();

        Cliente cliente1 = new Cliente("Bruno Reges",contaReges);

        clienteList.add(cliente1);

        Banco banco = new Banco(clienteList);

        Conta conta = new ContaCorrente(245.20,0.75);
        contaReges.CalculaJuros();

        conta.Credito(400.0);
        conta.Debito(644.45);
        System.out.println(conta.getSaldo());
        contaReges.Credito(contaReges.CalculaJuros());
        System.out.println(contaReges.Debito(230.0));
        System.out.println(contaReges.getSaldo());
        //System.out.println(conta.getTipo());
    }

}