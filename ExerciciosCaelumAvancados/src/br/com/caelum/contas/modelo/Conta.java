package br.com.caelum.contas.modelo;

/**
* Classe responsável por moldar a Conta
*
* @author Eduardo Gonçalves da Silva
*/

public interface Conta {
    public double getSaldo();
    public void deposita(double valor);
    public void saca(double valor);
    public void atualiza(double taxaSelic);
    public void setAgencia(String agencia);
    public void setNumero(int numero);
    public void setTitular(String nome);
    public void transfere(double valor, Conta conta);
    
}