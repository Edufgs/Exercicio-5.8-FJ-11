package Conta;

public class Conta {
 
    private String nome;
    private String cpf;
    private String agencia;
    private double saldo;
    private int dia;
    private int mes;
    private int ano;
    private int identificador;
    
    public Conta (String nome, String cpf, int identificador, String agencia, double saldo){
        this.nome = nome;
        this.cpf = cpf;
        this.identificador = identificador;
        this.agencia = agencia;
        this.saldo = 0;
    }
    
    public Conta(){
        
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
    
    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }
    
    public boolean setData(int dia, int mes, int ano){
        
        if (dia> 31) {
            return false;
        }
        if (mes> 12) {
            return false;
        }
        if (((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) && (dia > 30)) {
            return false;
        }
        if (mes == 2) {
            
            if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
			if(dia > 29){
                            return false;
                        }
            }
            else{
                if(dia > 28){
                    return false;
                }
            }            
        }
        this.dia = dia;
        this.mes = mes;
        this.ano  = ano;
        return true;
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
    
    public int getDia(){
        return dia;
    }  
    
    public int geMes(){
        return mes;
    }
    
    public int getAno(){
        return ano;
    }
}

    
