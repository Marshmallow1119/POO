package Aula07;

import java.util.Scanner;
import utils.UserInput;

public class ex1 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int figura;
        double raio;
        double lado1, lado2, lado3;
        double altura, comprimento;
        String cor = "Branco";
        Object[] o = new Object[100];
        int io=0;
        do{
            
            System.out.println("Que figura deseja criar?\n1 - Círculo\n2 - Triângulo\n3 - Retângulo\n4 - Comparar figuras\n5 - Sair");
            System.out.println("--------raio--------");
            figura = UserInput.Validar(1, 5);
            switch(figura){
                case 1:
                    if(io==100){
                        System.out.println("Limite de figuras atingido!");
                        continue;
                    }
                    // create circle and push it to array
                    raio = UserInput.ValidateDouble(0.000000001, 300.0, "Insira um valor positivo e maior que 0 para o raio: ");
                    System.out.print("Insira uma cor: ");
                    cor = sc.next();
                    circulo c1 = new circulo(raio, cor);
                    o[io++] = c1;
                    System.out.println("Círculo criado! " + c1.toString());
                    break;
                case 2:
                    if(io==100){
                        System.out.println("Limite de figuras atingido!");
                        continue;
                    }
                    // create triangle and push it to array
                    lado1 = UserInput.ValidateDouble(0.000000001, 300.0, "Insira um valor positivo e maior que 0 para o lado 1: ");
                    lado2 = UserInput.ValidateDouble(0.000000001, 300.0, "Insira um valor positivo e maior que 0 para o lado 2: ");
                    lado3 = UserInput.ValidateDouble(0.000000001, 300.0, "Insira um valor positivo e maior que 0 para o lado 3: ");
                    System.out.println("Insira uma cor: ");
                    cor = sc.next();
                    triangulo t1 = new triangulo(lado1, lado2, lado3, cor);
                    o[io++] = t1;
                    System.out.print("Triângulo criado! " + t1.toString());
                    break;
                case 3:
                    if(io==100){
                        System.out.println("Limite de retângulos atingido!");
                        continue;
                    }
                    // create rectangle and push it to array
                    altura = UserInput.ValidateDouble(0.000000001, 300.0, "Insira um valor positivo e maior que 0 para a altura: ");
                    comprimento = UserInput.ValidateDouble(0.000000001, 300.0, "Insira um valor positivo e maior que 0 para o comprimento: ");
                    System.out.print("Insira uma cor: ");
                    cor = sc.next();
                    retangulo r1 = new retangulo(altura, comprimento, cor);
                    o[io++] = r1;
                    System.out.println("Retângulo criado! " + r1.toString());
                    break;
                case 4:
                    // if there is 1 figure or less, there is nothing to compare
                    if(io<2){
                        System.out.println("Não existem figuras suficientes para comparar!");
                        break;
                    }

                    // compare two figures
                    int f1, f2;
                    System.out.println("Existem " + io + " figuras criadas.");
                    System.out.println("Insira o número da figura 1: ");
                    f1 = UserInput.Validar(0, io-1);
                    System.out.println("Insira o número da figura 2: ");
                    f2 = UserInput.Validar(0, io-1);
                    //print figures
                    System.out.println("Figura 1: " + o[f1].toString());
                    System.out.println("Figura 2: " + o[f2].toString());
                    if(o[f1].equals(o[f2]))
                        System.out.println("Figuras " + f1 + " e " + f2 + " são iguais!");
                    else
                        System.out.println("Figuras " + f1 + " e " + f2 + " são diferentes!");
                    break;
                case 5:
                    System.out.println("Sair!");
                    break;
            }
        }while(figura != 5);
    }

}
