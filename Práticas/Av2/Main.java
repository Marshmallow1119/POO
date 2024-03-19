package Av2;

import java.time.LocalDate;
import java.util.Scanner;


public class Main  {
    public static void main(String[] args) {
        ContactManager cmContactManager = new ContactManager();
        cmContactManager.load("contactos.txt");
        Scanner scanner = new Scanner(System.in);
        
        int choice = 0;
        do {
            System.out.println("Lista telefónica:");
            System.out.println("1. Add new contact");
            System.out.println("2. Modify contact");
            System.out.println("3. Remove contact");
            System.out.println("4. Search contact by name");
            System.out.println("5. Search contact by phone number");
            System.out.println("6. Search contact by email");
            System.out.println("7. List all contacts");
            System.out.println("8. List contacts by name");
            System.out.println("9. List contacts by phone number");
            System.out.println("10. List contacts by email");
            System.out.println("11. List contacts by birth date");
            System.out.println("12. Exit");
 

            System.out.println("Choose an option:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                System.out.println("Add new contact");
                System.out.println("Name:");
                scanner.nextLine();
                String name=scanner.nextLine();
                System.out.println("Phone number:");
                int phoneNumber = scanner.nextInt();
                System.out.println("Email:");
                String email = scanner.next();
                System.out.println("Birth date:");
                LocalDate birthDate = LocalDate.parse(scanner.next());
                Contact contact = new Contact(name, phoneNumber, email, birthDate);
                cmContactManager.contactos.add(contact);
                break;

                case 2:
                    System.out.println("Modify contact");
                    System.out.println("Qual o nome do contacto que deseja modificar?");
                    String nome = scanner.next();
                    for(Contact c:cmContactManager.contactos){
                        if(c.getName().equals(nome)){
                            System.out.println("O que deseja modificar?");
                            System.out.println("1. Name");
                            System.out.println("2. Phone number");
                            System.out.println("3. Email");
                            System.out.println("4. Birth date");
                            int opcao=scanner.nextInt();
                            switch(opcao){
                                case 1:
                                    System.out.println("Qual o novo nome?");
                                    String novoNome=scanner.next();
                                    c.setName(novoNome);
                                    break;
                                case 2:
                                    System.out.println("Qual o novo número de telefone?");
                                    int novoTelefone=scanner.nextInt();
                                    c.setPhoneNumber(novoTelefone);
                                    break;
                                case 3:
                                    System.out.println("Qual o novo email?");
                                    String novoEmail=scanner.next();
                                    c.setEmail(novoEmail);
                                    break;
                                case 4:
                                    System.out.println("Qual a nova data de nascimento?");
                                    LocalDate novaData=LocalDate.parse(scanner.next());
                                    c.setBirthDate(novaData);
                                    break;
                                default:
                                    System.out.println("Opção não existe!");
                                    break;
                            }
                        }
                    }
                    System.out.println("Contacto modificado com sucesso!");
                    break;

                case 3:
                    System.out.println("Remove contact");
                    System.out.println("Qual o nome do contacto que deseja remover?");
                    String nomeRemover = scanner.next();
                    for(Contact c:cmContactManager.contactos){
                        if(c.getName().equals(nomeRemover)){
                            cmContactManager.removeContact(c);
                        }
                    }
                    System.out.println("Contacto removido com sucesso!");
                    break;

                case 4:
                    System.out.println("Search contact by name");
                    System.out.println("Qual o nome do contacto que deseja procurar?");
                    scanner.nextLine();
                    String nomesearch = scanner.nextLine();
                    System.out.println(cmContactManager.searchContactByname(nomesearch));
                    break;

                case 5:
                    System.out.println("Search contact by phone number");
                    System.out.println("Qual o número do contacto que deseja procurar?");
                    Integer phonenumbersearch = scanner.nextInt();
                    System.out.println(cmContactManager.searchContactByPhoneNumber(phonenumbersearch));
                    break;

                case 6:
                    System.out.println("Search contact by email");
                    System.out.println("Qual o email do contacto que deseja procurar?");
                    String emailsearch = scanner.next();
                    System.out.println(cmContactManager.searchContactByEmail(emailsearch));
                    break;

                case 7:
                    System.out.println("List all contacts");
                    cmContactManager.listAllContacts();
                    break;

                case 8:
                    System.out.println("List contacts by name");
                    cmContactManager.listContactsByName();
                    break;

                case 9:
                    System.out.println("List contacts by phone number");
                    cmContactManager.listContactsByPhoneNumber();
                    break;

                case 10:
                    System.out.println("List contacts by email");
                    cmContactManager.listContactsByemail();
                    break;

                case 11:
                    System.out.println("List contacts by birth date");
                    cmContactManager.listContactsByBirthDate();
                    break;

                case 12:
                    System.out.println("Goodbye!");
                    cmContactManager.save("save.txt");
                    break;
                    
                default:
                    System.out.println("Opção não existe!");
                    break;
            }

        } while (choice != 5);

        scanner.close();
    }
}


