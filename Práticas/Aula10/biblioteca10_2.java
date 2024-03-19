package Aula10;

import java.util.Scanner;

public class biblioteca10_2 {
    public static void main(String[] args) throws NumberFormatException, Exception{
        Scanner sc = new Scanner (System.in);
		operações opcao = new operações();
        
        int op;
        do{
            System.out.println("    Menu\n1 - adicionar\n2 - remover\n3 - alterar\n4 - listar por género-livro\n5 - listar géneros\n6 - listar livros\n7 - selecionar livro aleatório\n8 - sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    opcao.adicionar();
                    break;
                case 2:
                    opcao.remover();
                    break;
                case 3:
                    opcao.alterar();
                    break;
                case 4:
                    opcao.listar();
                    break;
                case 5:
                    opcao.chaves();
                    break;
                case 6:
                    opcao.valores();
                    break;
                case 7:
                    opcao.aleatorio();;             
                    break;
            }
        }while(op != 8);

        sc.close();
    }
}

