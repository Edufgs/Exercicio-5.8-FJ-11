package br.com.caelum.contas.modelo;
        
import data.Data;

/**
* Classe responsável por moldar a Conta
*
* @author Eduardo Gonçalves da SIlva
*/
public class Conta {
    
    private static int totalContas = 0;
    private String nome;
    private String cpf;
    private String agencia;
    private double saldo;
    private Data data;
    private int identificador;
    
    public Conta (String nome, String cpf, String agencia, int dia, int mes, int ano){
        this.nome = nome;
        this.cpf = cpf;
        totalContas++;
        this.identificador = totalContas;
        this.agencia = agencia;
        this.saldo = 0;
        this.data = new Data(dia,mes,ano);
    }
    
    public Conta(){
        this.identificador = totalContas+1;
        
    }
        
    public void sacar(double valor){
	this.saldo -= valor;
	System.out.println("Saque:"+valor+ "  ContaAtural:"+this.saldo);
    }

    public void depositar(double valor){
        this.saldo += valor;
	System.out.println("Depositado: "+valor);
    }
    
    //setters
    public void setDate(int dia, int mes, int ano) {
         data = new Data(dia,mes,ano);
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
        return this.saldo; 
    }
     
    public String getNome(){
        return this.nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public int getIdentificador(){
        return this.identificador;
    }
    
    public int getDia() {
        return this.data.getDia();
    }

    public int getMes() {
        return this.data.getMes();
    }

    public int getAno() {
        return this.data.getAno();
    }    
    public String getAgencia(){
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public static int getTotalContas() {
        return totalContas;
    }
    
}

    
