package Aula02;

import java.util.Scanner;

public class ex29 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N;

        
        System.out.print("N?");
        N=sc.nextInt();

        for(int x=0;N>=x;N--){
            if(N==0){
                System.out.print(N);
            }else if(N%10==0){
                System.out.println(N+", ");
            }else{
                System.out.print(N+", ");
            }
            
            
        }

        sc.close();

    }
}
