package Aula10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Aula05.ex1.DateYMD;

public class biblioteca10_1 {
        public static void main(String[] args) throws NumberFormatException, Exception {
        Map<String, Book> mapa = new HashMap<>(); //a cada género corresponde um livro
        int op;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("    Menu\n1 - adicionar\n2 - remover\n3 - alterar\n4 - listar por género-livro\n5 - listar géneros\n6 - listar livros\n7 - sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                System.out.print("Insira o Género: ");
                String genero = sc.next();
                sc.nextLine();
                if (!mapa.containsKey(genero)) {
                    System.out.print("Insira o título do livro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Insira o autor do livro: ");
                    String autor = sc.nextLine();
                    System.out.print("Insira a data de lançamento do livro: ");
                    System.out.println("Insira o dia: ");
                    String dia = sc.nextLine();
                    System.out.println("Insira o mês: ");
                    String mes = sc.nextLine();
                    System.out.println("Insira o ano: ");
                    String ano= sc.nextLine();
                    DateYMD data=new DateYMD(Integer.parseInt(dia),Integer.parseInt(mes),Integer.parseInt(ano));
                    Book livro = new Book(titulo, autor,data);
                    mapa.put(genero, livro);
                    System.out.println(" Livro adicionado com sucesso! ");
                } else {
                    System.out.println("Género já existente!");
                }
                    break;
                case 2:
                System.out.print("Insira o Género que pretende remover: ");
                String remover = sc.next();
                sc.nextLine();
                if (mapa.containsKey(remover)) {
                    mapa.remove(remover);
                    System.out.println("Removido com sucesso! ");
                } else {
                    System.out.println("Género já existente!");
                }        
                    break;
                case 3:
                System.out.print("Insira o Género: ");
                String alterar = sc.next();
                sc.nextLine();
                if (mapa.containsKey(alterar)) {
                    System.out.print("Insira o título do livro: ");
                    String title = sc.nextLine();
                    System.out.print("Insira o autor do livro: ");
                    String author = sc.nextLine();
                    System.out.print("Insira a data de lançamento do livro: ");
                    System.out.println("Insira o dia: ");
                    String dia = sc.nextLine();
                    System.out.println("Insira o mês: ");
                    String mes = sc.nextLine();
                    System.out.println("Insira o ano: ");
                    String ano= sc.nextLine();
                    DateYMD data=new DateYMD(Integer.parseInt(dia),Integer.parseInt(mes),Integer.parseInt(ano));
                    Book livro = new Book(title, author,data);
                    mapa.replace(alterar, mapa.get(alterar), livro);
                    System.out.println("Alterado com sucesso! ");
                } else {
                    System.out.println("Não é possível alterar, género não existente!");
                }
                    break;
                case 4:
                    System.out.println(mapa.entrySet()); //iteração
                    break;
                case 5:
                    System.out.println(mapa.keySet());
                    break;
                case 6:
                    System.out.println(mapa.values());
                    break;
            }
        }while(op != 7);

        sc.close();
    }

}

