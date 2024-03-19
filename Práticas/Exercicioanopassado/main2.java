package Exercicioanopassado;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Scanner;

// Notas:
// Não altere o código apresentado
// Deve completar o código da alinea 2
// Deve comentar o código para garantir que vai executando parcialmente

public class main2 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream fl = new PrintStream(new File("POO_2122EP.txt"));
		test(System.out); // executa e escreve na consola
		test(fl); // executa e escreve no ficheiro
		fl.close();
	}

	private static void test(PrintStream out) {
		alinea1(out);
		alinea2(out);
	}

	private static void alinea1(PrintStream out) {
		out.println("\nAlínea 1) ----------------------------------\n");

		EventManager grandesEventos = new EventManager("Great outdoors");

		cliente c1 = grandesEventos.addClient("The best", "Aveiro");
		cliente c2 = grandesEventos.addClient("Team mates", "Coimbra");
		cliente c3 = grandesEventos.addClient("Cool bunch", "Viseu");

		event e1 = grandesEventos.addEvent(c1, LocalDate.parse("2022-06-24"));
		e1.addAtividade(new Sport(Modalidade.KAYAK, 10));	
			e1.addAtividade(new Catering(Option.FULL_MENU, 12));
			e1.addAtividade(new Catering(Option.DRINKS_AND_SNACKS, 20));
		out.println(e1);
		event e2 = grandesEventos.addEvent(c2, LocalDate.parse("2022-06-30"));
		e2.addAtividade(new Catering(Option.LIGHT_BITES, 20));
			e2.addAtividade(new Culture(Option2.ARCHITECTURAL_TOUR, 10));
			e2.addAtividade(new Culture(Option2.RIVER_TOUR, 10));

		event e3 = grandesEventos.addEvent(c3, LocalDate.parse("2022-06-25"));
		e3.addAtividade(new Catering(Option.DRINKS_AND_SNACKS, 20));
			e3.addAtividade(new Culture(Option2.ART_MUSEUM, 20));

		event e4 = grandesEventos.addEvent(c1, LocalDate.parse("2022-07-10"));
		e4.addAtividade(new Sport(Modalidade.BIKE, 15));
			e4.addAtividade(new Culture(Option2.WINE_TASTING, 20));

		
		out.println(grandesEventos.listClients());
		out.println();
		out.println(grandesEventos.listEvents());
		
	}
	private static void alinea2(PrintStream out) {
		out.println("\nAlínea 2) ----------------------------------\n");
		
		// Adicione a seguir o código necessário para a leitura do ficheiro 
		EventManager em = new EventManager("Funny Sports"); // modificar
        event evento = null;
        Boolean check = false;
	try {
		Scanner input = new Scanner(new File("C:/Users/trmbr/Desktop/POO/testes/Resolução/src/events.txt"), "UTF-8");
		while (input.hasNextLine()) {
			String line = input.nextLine();
			if (line.startsWith("#")) {
				line = line.replace("# ", "");
				String[] coisas = line.split(",");
				cliente cliente = new cliente(coisas[0], coisas[1]);
				evento = em.addEvent(cliente, LocalDate.parse(coisas[2]));
			}
			if (line.startsWith("*")) {
				line = line.replace("* ", "");
				String[] coisas = line.split(",");
				if (coisas[0].equals("Sport")) {
					Sport sport = new Sport(Modalidade.valueOf(coisas[1]), Integer.parseInt(coisas[2]));
					evento.addAtividade(sport);
				}
				if (coisas[0].equals("Catering") && !check) {
					Catering catering = new Catering(Option.valueOf(coisas[1]), Integer.parseInt(coisas[2]));
					evento.addAtividade(catering);
					check = true;
				}
				if (coisas[0].equals("Culture")) {
					Culture culture = new Culture(Option2.valueOf(coisas[1]), Integer.parseInt(coisas[2]));
					evento.addAtividade(culture);
				}
			}
		}
	} catch (Exception e) {
		System.out.println("Error: " + e);
	}
        // não modifique o metodo a partir daqui. Pode comentar para executar o programa

		if (em != null) {
			out.println(em + ": CLIENTES COM EVENTOS");
			for (String s: em.getClientsWithEvents())  // devolve todos os clientes com eventos
				out.println(s); 
			out.println("\n" + em + ": LISTA DE PRÓXIMOS EVENTOS ORDENADOS POR DATA");	
			for (String s: em.getNextEventsByDate())  // devolve todos os eventos, ordenados por data
				out.println(s); 
			out.println();
		}
	
	
}
}
