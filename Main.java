package Main;

import Conta.Conta;


public class Main {
    public static void main(String[] args){
        Conta pessoa = new Conta("Eduardo Gonçalves", "056.765.191-6", "25546-5", 500, 16, 6, 2000);
           
        //Conta pessoa1 = new Conta();
        
                
        //pessoa1.setNome("Puta");
        //pessoa1.setCpf("056.165.754-05");
        
        
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getCpf());
        System.out.println(pessoa.getIdentificador());
        //System.out.println(pessoa.getDia() +"/"+ pessoa.getMes() +"/"+ pessoa.getAno());
    }
}
