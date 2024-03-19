package Aula05.ex1;

import utils.UserInput;

public class DateYMD implements Comparable<DateYMD> {
    int day;
    int month;
    int year;
    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    


    public DateYMD(int day,int month,int year) throws Exception {
        if(valid(day, month, year)){
            this.day=day;
            this.month=month;
            this.year=year;
        }else{
            throw new Exception("Data Inválida");
        }
    }

    public DateYMD(){
        
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


    @Override
    public String toString(){
        return String.format("%04d-%02d-%02d",this.year,this.month,this.day) ;
    }

    @Override
    public boolean equals(Object o){
        if(o==this) return true;
        if(!(o instanceof DateYMD)) return false;
        DateYMD d = (DateYMD) o;
        return d.day==this.day && d.month==this.month && d.year==this.year;
    }

    @Override
    public int hashCode(){
        return this.day+this.month+this.year;
    }
    @Override
    public int compareTo(DateYMD d){
        if(this.year>d.year){
            return 1;
        }else if(this.year<d.year){
            return -1;
        }else{
            if(this.month>d.month){
                return 1;
            }else if(this.month<d.month){
                return -1;
            }else{
                if(this.day>d.day){
                    return 1;
                }else if(this.day<d.day){
                    return -1;
                }else{
                    return 0;
                }
            }
        }
    }
}
