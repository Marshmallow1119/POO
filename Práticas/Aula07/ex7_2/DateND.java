package Aula07.ex7_2;

public class DateND extends Date {
   
    private int dist;
    
    public DateND(int day, int month, int year) {
        super(day, month, year);
        // dist is equal to the number of days since 2000/01/01
        dist = 0;
        for(int i = 2000; i < year; i++){
            if(Date.bissexto(year)){
                dist += 366;
            }else{
                dist += 365;
            }
        }
        for(int i = 1; i < month; i++){
            dist += Date.monthdays(i, year);
        }
        dist += day-1;
    }
    public DateND() {
        super();
        dist=0;
    }

    public int getDist() {
        return dist;
    }

    @Override
    public String toString() {
        return String.format("%d days", this.getDist());
    }
    

}
