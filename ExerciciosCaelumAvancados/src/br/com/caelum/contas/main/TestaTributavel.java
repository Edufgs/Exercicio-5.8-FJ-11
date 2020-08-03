package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Tributavel;

/**
 *
 * @author Eduardo Gonçalves da Silva
 */
public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        System.out.println(cc.getValorImposto());
        System.out.println(cc.getSaldo());
        // testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.getValorImposto());
        //System.out.println(t.getSaldo()); //erro pq não tem metodo getSaldo dentro da classe Tributavel
        
    }
}
