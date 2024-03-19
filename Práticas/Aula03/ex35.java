package Aula03;

import utils.UserInput;

public class ex35 {
    public static void main (String args[]){
    int dia;
    int mes;
    int ano;

    String [] data=UserInput.validadata();
    System.out.print("Em que dia da semana começa o mês:(1 = Segunda, 2 = Terça, 3 = Quarta, 4 = Quinta, 5 = Sexta, 6 = Sábado, 7 = Domingo): ");
    dia=UserInput.Validar(1, 7);

    mes=Integer.parseInt(data[0]);
    ano=Integer.parseInt(data[1]);
    int days=UserInput.monthdays(mes,ano);
    String[] meses={"Janeiro","fevereiro","Março","Abril","Maio","Junho", "Julho", "Agosto","Setembro","Outubro","Novembro","Dezembro"};
    System.out.printf("%12s "+ano+"\n",meses[mes-1]);
    System.out.printf("%2s %2s %2s %2s %2s %2s %2s","Su","Mo","Tu","We","Th","Fr","Sa");
    System.out.println();

    for(int i=1; i<=days; i++){//espaços brancos
        
        if(i == 1){
            if(dia == 7)
                dia = 0;
            for(int j=1; j<dia+1; j++)
                System.out.print("   ");
        }

        System.out.printf("%2d ", i);
        if((i+dia)%7 == 0)
            System.out.println();
    }
    }
}




    



