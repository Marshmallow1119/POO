package Av1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fighter[] Fighter = new Fighter[10];
        int num,num2;
        
        int choice = 0;
        do {
            System.out.println("Game menu:");
            System.out.println("1. Generate fighters");
            System.out.println("2. Show all fighters");
            System.out.println("3. Start fight between selected fighters");
            System.out.println("4. Start fight between random fighters");
            System.out.println("5. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                //random fighters
                int tipo=(int)(Math.random()*2+1);
                for (int i = 0; i < Fighter.length; i++) {
                    if(tipo==1){
                        Fighter[i]=new Boxer(String.valueOf(i));
                    }else{
                        Fighter[i]=new Wrestler(String.valueOf(i));
                    }
                }
                System.out.println("Fighters criados com sucesso");
                    break;
                case 2:
                    // show fighters
                    for (int i = 0; i < Fighter.length; i++) {
                        System.out.println(Fighter[i].toString());
                    }
                    break;
                case 3:
                    //simulate a fight between selected fighters
                    System.out.println("Digite o nº do lutador 1");
                    num=scanner.nextInt();
                    System.out.println("Digite o nº do lutador 2");
                    num2=scanner.nextInt();
                    Fighter[num].attack(Fighter[num2]);
                    break;
                case 4:
                    System.out.println("Lutador 1: ");
                    num=(int)(Math.random()*10+1);
                    System.out.println("Lutador 2: ");
                    num2=(int)(Math.random()*10+1);
                    Fighter[num].attack(Fighter[num2]);

                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Opção não existe!");
                    break;
            }

        } while (choice != 5);

        scanner.close();
    }
}
