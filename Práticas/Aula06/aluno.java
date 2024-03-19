package Aula06;

import Aula07.ex7_2.DateYMD;
import java.time.*;

public class aluno extends pessoa {
    private int nmec;
    protected DateYMD datainsc;
    private static int n=100;


    public aluno(String nome, int cc, DateYMD nasc) throws Exception {
        super(nome, cc, nasc);
        int year=LocalDate.now().getYear();
        int month=LocalDate.now().getMonthValue();
        int day=LocalDate.now().getDayOfMonth();
        this.datainsc=new DateYMD(day,month,year);
        nmec=n++;
    }
    public aluno(String nome, int cc, DateYMD nasc,DateYMD datainsc) {
        super(nome, cc, nasc);
        this.datainsc=datainsc;
        nmec=n++;
    }
    

    public int getNmec(){
        return nmec;
    }
    public void setNmec(int nmec){
        this.nmec=nmec;   
    }
    public DateYMD getDatainsc() {
        return datainsc;
    }
    public void setDatainsc(DateYMD datainsc) {
        this.datainsc = datainsc;
    }


    @Override
    public String toString(){
        return "Nome: "+this.getNome()+", Data de nascimento: "+this.getNasc()+", Nmec: "+this.getNmec()+", Data de inscrição: "+datainsc;
    }

}
