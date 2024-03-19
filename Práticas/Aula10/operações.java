package Aula10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import Aula05.ex1.DateYMD;

public class operações {
    private Scanner sc = new Scanner(System.in);
	public Map<String, ArrayList<Book>> mapa = new HashMap<>();
	public ArrayList<Book> livros = new ArrayList<>();

    public void adicionar() throws NumberFormatException, Exception {
		System.out.print("Insira o Género: ");
		String genero = sc.next();
		sc.nextLine();
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
		livros.add(livro);
		mapa.put(genero, livros);
		System.out.println("Adicionado com sucesso! ");
	}

	public void alterar() throws NumberFormatException, Exception {
		System.out.print("genero: ");
		String genero = sc.next();

		sc.nextLine();

		if (mapa.containsKey(genero)) {
			System.out.print("Insira o livro a alterar: ");
			String significado = sc.nextLine();
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
        	DateYMD data2=new DateYMD(Integer.parseInt(dia),Integer.parseInt(mes),Integer.parseInt(ano));
			Book livro2 = new Book(title, author,data2);
			for(String genero1: mapa.keySet()){
				if (genero1.equals(genero)){
					for(Book b : mapa.get(genero1)){
						if (b.getTitulo().equals(significado)){
							mapa.get(genero1).set(mapa.get(genero1).indexOf(b),livro2 );
							System.out.println("Alterado com sucesso!");
							
						}
					}
					
				}
			}
		} else {
			System.out.print("O género inserido ainda não existe.");
		}
	}

	public void remover() {
		System.out.print("Género a eliminar: ");
		String genero = sc.next();

		if (mapa.containsKey(genero)) {
			System.out.printf("Pretende eliminar o seguinte género \"%s\" com os seguintes livros \"%s\" ?(S/N) ", genero, mapa.get(genero));
			String b = sc.next();
            String c = b.toUpperCase();

            if (c.equals("S")) {
				mapa.remove(genero);
				System.out.println("genero eliminada com sucesso!");
			}
		} else {
			System.out.print("Esta genero não existe no dicionário");
		}
	}
	public void listar() {
		for (String i: mapa.keySet()){
			System.out.println(i + " - " + mapa.get(i));
		}
	}
	public void chaves(){
		for (String i: mapa.keySet()){
			System.out.println(i);

		}
	}
	public void valores(){
		for (String i: mapa.keySet()){
			System.out.println(mapa.get(i));
		}
	}
	public void aleatorio(){
		System.out.print("Género: ");
		String genero = sc.next();
		sc.nextLine();

		if (mapa.containsKey(genero)) {
			int c = (mapa.get(genero)).size() ;
			int random_int = (int)Math.floor(Math.random()*(c-1-0+1)+0);
			System.out.println((mapa.get(genero)).get(random_int));
		} else {
			System.out.print("O género inserido ainda não existe.");
		}
	}

    @Override
    public String toString() {
        	StringBuilder sb = new StringBuilder();
            Set<String> generos = mapa.keySet();
    
            generos.forEach(p -> {
                sb.append(p);
                sb.append("-");
                sb.append(mapa.get(p));
                sb.append("\n");
            });
    
            return sb.toString();
    }
}

