package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

/**
 * Teste a criação das contas
 * @author Eduardo Gonçalves da Silva
 */
public class Main {
    public static void main(String[] args){
        Conta pessoa1 = new Conta("Eduardo Gonçalves", "056.765.191-6", "25546-5", 16, 6, 2000);
        pessoa1.depositar(500);        
        
        System.out.println(pessoa1.getTitular());
        System.out.println(pessoa1.getCpf());
        System.out.println(pessoa1.getIdentificador());
        System.out.println(pessoa1.getAgencia());
        System.out.println(pessoa1.getSaldo());
        System.out.println(pessoa1.getDia() +"/"+ pessoa1.getMes() +"/"+ pessoa1.getAno());
        
        System.out.println("=================================================");
        
        Conta pessoa2 = new Conta("Puta Gonçalves", "088.888.895-07", "4444-5", 20, 05, 2014);
        pessoa2.depositar(1000);        
        
        System.out.println(pessoa2.getTitular());
        System.out.println(pessoa2.getCpf());
        System.out.println(pessoa2.getIdentificador());
        System.out.println(pessoa2.getAgencia());
        System.out.println(pessoa2.getSaldo());
        System.out.println(pessoa2.getDia() +"/"+ pessoa2.getMes() +"/"+ pessoa2.getAno());
    }
}