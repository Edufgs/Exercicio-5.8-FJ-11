package Conta;

import Conta.Data;
        
public class Conta {
    
    private static int totalContas;
    private String nome;
    private String cpf;
    private String agencia;
    private double saldo;
    private Data data;
    private int identificador;
    
    public Conta (String nome, String cpf, String agencia, double saldo, int dia, int mes, int ano){
        this.nome = nome;
        this.cpf = cpf;
        this.identificador = totalContas++;
        this.agencia = agencia;
        this.saldo = 0;
        this.data.setData(dia, mes, ano);
    }
    
    public Conta(){
        this.identificador = totalContas++;
        
    }
        
    public void sacar(int valor){
	this.saldo -= valor;
	System.out.println("Saque:"+valor+ "  ContaAtural:"+this.saldo);
    }

    public void depositar(int valor){
        this.saldo += valor;
	System.out.println("Depositado:"+valor);
    }
    
    //setters
    public void setDate(int dia, int mes, int ano) {
        this.data.setData(dia, mes, ano);
    }
    
      public void setNome(String nome){
        this.nome = nome;
        this.saldo = 0;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    
    //getters
     public double getRendimento(){
	saldo+=saldo*0.1;
        return saldo; 
    }
     
    public String getNome(){
        return nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public int getIdentificador(){
        return identificador;
    }
    
    public int getDia() {
        return data.getDia();
    }

    public int getMes() {
        return data.getMes();
    }

    public int getAno() {
        return data.getAno();
    }    
}

    
