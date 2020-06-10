package Main;

import Conta.Conta;
import java.util.Calendar;

public class Main {
    public static void main(String[] args){
          int nContas = 0;
        Conta pessoa1 = new Conta();
        nContas++;
        //Conta pessoa = new Conta("Eduardo Gonçalves", "056.765.191-6", nContas);
       
        
        
        pessoa1.setNome("Puta");
        pessoa1.setCpf("056.165.754-05");
        pessoa1.setIdentificador(nContas);
        
        System.out.println(pessoa1.setData(30,2,2020) +"\n");
        
        /*System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getCpf());
        System.out.println(pessoa1.getIdentificador());
        System.out.println(pessoa1.getDia() +"/"+ pessoa1.geMes() +"/"+ pessoa1.getAno());*/

    }
}
