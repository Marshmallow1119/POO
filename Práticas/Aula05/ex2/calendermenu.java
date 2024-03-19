package Aula05.ex2;


import java.util.Scanner;

import Aula05.ex1.DateYMD;

public class calendermenu {

    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws Exception{
       
     String op;
     int first,year;
     
     calender C= new calender();
     DateYMD date= null;
        do{
            
            System.out.printf("%14s","Menu\n");
            System.out.println("1 - create new calendar");
            System.out.println("2 - print calendar month");
            System.out.println("3 - print calendar");
            System.out.println("4 - Add Event");
            System.out.println("5 - Remove Event");
            System.out.println("0 - exit");
            op=sc.next();
            switch(op){
                case "1":
                    System.out.print("Primeiro dia do ano: ");
                    first=sc.nextInt();
                    System.out.print("Ano: ");
                    year=sc.nextInt();
                    try{
                         C= new calender(year, first);
                        System.out.println("Calendário criado com sucesso");
                    }catch(Exception ex){
                        System.out.println(ex.getMessage());
                    }
                    
                    break;
                case "2":
                    System.out.println("Qual o mês que queres representar?");
                    int month=sc.nextInt();
                    System.out.println(C.printMonth(month));
                    break;
                case "3":
                    System.out.println(C.toString());
                    break;
                case "4":
                    System.out.println("Qual o dia que queres marcar o evento?");
                    int day=sc.nextInt();
                    System.out.println("Em que mês?");
                    int monthe=sc.nextInt();
                    System.out.println("De que ano?");
                    int yeare=sc.nextInt();
                    date = new DateYMD(day, monthe, yeare);
                    calender.addEvent(date);
                    
                    break;
                case "5":
                    System.out.println("Qual o dia que queres retirar o evento?");
                        int dayr=sc.nextInt();
                    System.out.println("Em que mês?");
                        int monthr=sc.nextInt();
                    System.out.println("De que ano?");
                        int yearr=sc.nextInt();
                date = new DateYMD(dayr, monthr, yearr);
                calender.removeEvent(date);
                    break;
                case "0":
                System.out.println("Obrigado");
                System.exit(0);
            }
        }while(!(op=="0"));
        




    
    }
}
