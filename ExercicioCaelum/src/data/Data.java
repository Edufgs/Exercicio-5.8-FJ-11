package data;


public class Data {
    private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    
   public Data(int dia, int mes, int ano){
        
        if (dia> 31) {
            System.out.println("Dia Invalido");
            System.exit(0);
        }
        if (mes> 12) {
            System.out.println("Mes Invalido");
            System.exit(0);
        }
        if (((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) && (dia > 30)) {
            System.out.println("Mes Invalido");
            System.exit(0);
        }
        if (mes == 2) {
            
            if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
			if(dia > 29){
                            System.out.println("Ano Invalido");
                            System.exit(0);
                        }
            }
            else{
                if(dia > 28){
                    System.out.println("Dia Invalido");
                    System.exit(0);
                }
            }            
        }
        this.dia = dia;
        this.mes = mes;
        this.ano  = ano;
    }
}
