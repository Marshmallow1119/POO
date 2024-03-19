package aula03;

import java.util.Scanner;
import utils.UserInput;

public class Ex05 {
    public static int monthDays(String month, int year){
        int days = 0;
        switch(month){
            case "January":
                days = 31;
                break;
            case "February":
                // check if it's leap year
                if(year%4 == 0 && year%100 != 0 || year%400 == 0)
                    days = 29;
                else
                    days = 28;
                break;
            case "March":
                days = 31;
                break;
            case "April":
                days = 30;
                break;
            case "May":
                days = 31;
                break;
            case "June":
                days = 30;
                break;
            case "July":
                days = 31;
                break;
            case "August":
                days = 31;
                break;
            case "September":
                days = 30;
                break;
            case "October":
                days = 31;
                break;
            case "November":
                days = 30;
                break;
            case "December":
                days = 31;
                break;
        }
        return days;
    }

    public static void main(String[] args){
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int mes=-1,ano=-1;
        Scanner sc = new Scanner(System.in);
        String date;

        date = UserInput.validarData();

        String[] splitdate = date.split("/");
        mes = Integer.parseInt(splitdate[0]);
        ano = Integer.parseInt(splitdate[1]);

        System.out.print("Enter first week day of the month (1-Mo, 2-Tu, 3-We, 4-Th, 5-Fr, 6-Sa, 7-Su): ");
        int firstDay = UserInput.Validate(1, 7);

        System.out.printf("%n%10s %4d%n", months[mes-1], ano);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int days = monthDays(months[mes-1], ano);

        // print days of the month
        for(int i=1; i<=days; i++){
            //print spaces before first day of the month
            if(i == 1){
                if(firstDay == 7)
                    firstDay = 0;
                for(int j=1; j<firstDay+1; j++)
                    System.out.print("   ");
            }
            // print days
            System.out.printf("%2d ", i);
            // print new line after saturday
            if((i+firstDay)%7 == 0)
                System.out.println();
        }
        sc.close();
    }
}