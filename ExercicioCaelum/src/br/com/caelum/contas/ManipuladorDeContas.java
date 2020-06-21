package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

/**
 *Classe que que sera responsavel pela ponte entre a tela e a classe de Conta
 * @author Eduardo Gonçalves da Silva
 */

public class ManipuladorDeContas {
     private Conta conta;
    
    public void criaConta(Evento evento){
        this.conta = new Conta();
        this.conta.setAgencia("7846-5");
        this.conta.setNumero(55456);
        this.conta.setTitular("Eduardo");
    }
    
    public void deposita(Evento evento){
        double valorDigitado = evento.getDouble("valor");
        this.conta.depositar(valorDigitado);
    }
    
    public void saca(Evento evento){
        double valorDigitado = evento.getDouble("valor");
        this.conta.sacar(valorDigitado);
    }
}
