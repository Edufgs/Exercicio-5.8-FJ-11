package br.com.caelum.contas.modelo;

import data.Data;

/**
 * Opção de Conta (Conta Corrente)
 * @author Eduardo Gonçalves da Silva
 */
public class ContaCorrente implements ContaTributavel {
    private static int totalContas = 0;
    private String nome;
    private String cpf;
    private String agencia;
    private int numero;
    private double saldo;
    private Data data;
    private final int identificador;
    
    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void deposita(double valor) {
        this.saldo += valor;
	System.out.println("Depositado: "+valor);
    }

    @Override
    public void saca(double valor) {
        this.saldo -= valor;
	System.out.println("Saque:"+valor+ "  ContaAtural:"+this.saldo);
    }

    @Override
    public void atualiza(double taxaSelic) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }
    public ContaCorrente(String nome, String cpf, String agencia, int numero, int dia, int mes, int ano) {
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numero = numero;
        this.data = new Data(dia,mes,ano);
        totalContas++;
        this.identificador = totalContas;
        
    }

    public ContaCorrente() {
        totalContas++;
        this.identificador = totalContas;
        
    }
       
    public static int getTotalContas() {
        return totalContas;
    }

    public String getTitular() {
        return nome;
    }
    
    @Override
    public void setTitular(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getAgencia() {
        return agencia;
    }
    
    @Override
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }
    
    @Override
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return this.data.toString();
    }

    public void setData(int dia, int mes, int ano) {
        this.data = new Data(dia,mes,ano);
    }

    public int getIdentificador() {
        return identificador;
    }
    
    @Override
     public void transfere(double valor, Conta conta){
        this.saca(valor);
        conta.deposita(valor);
    }    
   
}
