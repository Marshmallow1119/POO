package Aula05.ex2;

import Aula05.ex1.DateYMD;
import utils.UserInput;

public class calender {
    private int ano, primeiro;
    private String[] semana={"Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sábado"};
    private String[] meses={ "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
    "Setembro", "Outubro", "Novembro", "Dezembro" };

    private static Object[][] eventos = new Object[12][31]; 
    //array bidimensional que indica que para cada mês há 31 dias


    public calender(){

    }

    public calender(int ano, int primeiro) throws Exception {
        if((UserInput.validarint(primeiro)) && ((UserInput.validarint(ano)) && (ano>1000))){
            this.ano = ano;
            this.primeiro=primeiro;
        }else{
            throw new Exception("Data Inválida");
        }
    }

    public int getAno(){
        return ano;
    }

    public void setANO( int ano){
        this.ano=ano;
    }

    public int getPrimeiro(){
        return primeiro;
    }
    
    public void setFirstday(int primeiro) {
        this.primeiro = primeiro;
    }

    public int year(){
        return getAno();
    }

    public String primeiroano(){
        return semana[primeiro-1]; //domingo corresponde ao 1 mas na array é 0
    }

    public int primeiromes(int month){
        int inicio=this.primeiro; // se o dia é 4
        for(int i=1;i<month;i++){ // de 1 ate 4
            inicio+=UserInput.monthdays(i,ano); //se o primeiro dia do ano é 4 entao somamos o numero de dias do mes
            inicio%=7;
            if(inicio==0){
                inicio=7;
            }
        }
        return inicio ;
    }

    public String printMonth(int month){
        StringBuilder mes = new StringBuilder("\n");
        String linha = String.format("         %s %d\n  %s  %s  %s  %s  %s  %s  %s  \n",meses[month-1],ano,"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");
        mes.append(linha);
        int dmonth=primeiromes(month);


        for (int j=1;j<dmonth; j++) {
            String dias0 = String.format("%4s", "");
            mes.append(dias0);
        }
        for (int i=1;i<=UserInput.monthdays(month,ano);i++) {
            if (eventos[month-1][i-1]!=null){
                String texto = "*" + Integer.toString(i);
                String dias =String.format("%4s", texto);
                dmonth+=1;
                mes.append(dias);
            }
            else {
                String dias =String.format("%4d", i);
                mes.append(dias);
                if (dmonth%7==0){
                    mes.append("\n");
                }
                dmonth+=1;
            }
            
        }
        mes.append("\n");
        return mes.toString();
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i<=12; i++) {
            sb.append(printMonth(i));
        }
        return sb.toString();
    }
    public static void addEvent(DateYMD data){
        int mes =  data.getMonth();
        int dia = data.getDay();
        eventos[mes-1][dia-1] = true;
    }
    public static void removeEvent(DateYMD data){
        int mes =  data.getMonth();
        int dia = data.getDay();
        eventos[mes-1][dia-1] = null;
    }
}
