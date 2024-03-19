package Aula07.ex7_2;

import utils.UserInput;

public abstract class Date {
    protected int day=0;
    protected int month=0;
    protected int year=0;


    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }


    public static boolean bissexto(int ano) {
        if((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)){
            return true;
        }else{
            return false;
        }
    }

    public boolean validMonth(int month){
        if(UserInput.validarint(month)){
            if(month<=12){
                return true;
            }else{
               return false; 
            }
        }else{
            return false;
        }
    
}

    public boolean valid(int day, int month, int year){
        if(day<=UserInput.monthdays(month, year) && validMonth(month) && (year>=1000)){
            return true;
        }else{
            return false;
        }
    
}


public static int monthdays(int mes, int ano){
    int days;

    if(mes==1|| mes==3 || mes==5 || mes==7 || mes==8 || mes==9 || mes==12){
        days=31;
    }else if(mes==2){
        if(bissexto(ano))
            days=29;
        else
            days=28;  
    }else{
        days=30;
    }
    return days; 
}


public void incdata(){
    if(day==UserInput.monthdays(month, year)){
        month++;
        day=1;
    }else if((month==12) && (day==UserInput.monthdays(month, year))){
        month=1;
        year++;
    }else{
        day++;
    }
    }


public void dedata(){
    day--;
    if((day==0)){
        month--;
        if(!validMonth(month))
        {
            month=12;
            year--;
        }
        day=UserInput.monthdays(month, year);
    }
    
    }


    public Date(){ 
        this.day = 1;
        this.month = 1;
        this.year = 2023;
    }
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object o){
        if(o == this)
            return true;
        if(!(o instanceof Date))
            return false;
        Date d = (Date) o;
        return day == d.day && month == d.month && year == d.year;
    }

}
