package Aula03;
import utils.UserInput;

public class ex31 {
    public static void main(String args[]){
    
        int num;
        int soma=0;

        num=UserInput.isPositive();
    
        for(int i=2;i<=num;i++){
            if(UserInput.validarprimo(i))
                soma+=i;      
        }
        if(UserInput.validarprimo(num)){
            System.out.println("O número é primo.");
        }else{
        System.out.println("O número não é primo.");
        }
        System.out.println("A somo dos números primos é "+soma);
    }
}

    

    



        


