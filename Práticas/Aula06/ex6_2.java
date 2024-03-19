package Aula06;

import java.util.Scanner;


import Aula07.ex7_2.DateYMD;

public class ex6_2 {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        String op="",nome,email,numero="";
        int count=0,cc;
        contacto[] contactos=new contacto[200];
        String numeronulo="",emailnulo="";
        DateYMD d=new DateYMD();
        String telefone;

        do{
            System.out.printf("%14s","Menu\n");
            System.out.println("1 - Inserir Contacto");
            System.out.println("2 - Alterar Contacto");
            System.out.println("3 - Deletar Contacto");
            System.out.println("4 - Procurar Contacto");
            System.out.println("5 - Listar Contactos");
            System.out.println("0 - exit");
            op=sc.next();
            switch(op){
                case "1":
                    System.out.println("1 - Inserir Contacto");
                    System.out.println("Nome do contacto: ");
                    nome=sc.nextLine();
                    String nome2=sc.nextLine();
                 
                    System.out.println("Número do Cartão de Cidadão: ");
                    cc=sc.nextInt();
                    
                    System.out.println("-----Data de nascimento------");
                    System.out.print("Dia: ");
                    int dia=sc.nextInt();
                    System.out.print("Mês: ");
                    int mes=sc.nextInt();
                    System.out.print("Ano: ");
                    int ano=sc.nextInt();
                    d=new DateYMD(dia, mes, ano);
                    
                    
                        System.out.println("Número de telefone: ");
                        sc.nextLine();
                        numero=sc.nextLine();


                        System.out.println("Email: ");
                        email=sc.nextLine();

                        

                        if(!email.equals(emailnulo) && numero.equals(numeronulo)){
                            if(contacto.validaremail(email)){
                                contactos[count]=new contacto(nome2, cc, d, email);
                                System.out.println("Contacto criado com sucesso");
                                System.out.println(contactos[count].toString());
                                count++;
                                break;
                            }else{
                                System.out.println("Dados inválidos. Insira novamente os dados88");
                                break;
                            }
                        }else if(email.equals(emailnulo) && !numero.equals(numeronulo)){
                            if(contacto.validarnumero(numero)){
                                contactos[count]=new contacto(nome2, cc, d, numero);
                                
                                System.out.println("Contacto criado com sucesso");
                                System.out.println(contactos[count].toString());
                                count++;
                                break;
                            }else{
                                System.out.println("Dados inválidos. Insira novamente os dados");
                                break;
                            }

                        }else if(email.equals(emailnulo) && numero.equals(numeronulo)){
                            System.out.println("Dados inválidos. Insira novamente os dados");
                            continue;
                        }else{
                            if(contacto.validaremail(email) && contacto.validarnumero(numero)){
                                System.out.println("Contacto criado com sucesso");
                                contactos[count]=new contacto(nome2, cc, d, email,numero);
                                count++;
                                break;
                            }else{
                                System.out.println("Dados inválidos. Insira novamente os dados");
                                break;
                            }
                        }
                case "2":
                    contacto[] alterar= new contacto[contactos.length];
                    int altera=0;
                    System.out.print("Nome do contacto?");
                    nome = sc.next();
                    for(int i=0; i<contactos.length; i++){
                        if(contactos[i] != null){
                        if(contactos[i].getNome().equals(nome)){
                            alterar[altera] = contactos[i];
                            altera++;
                        }
                    }
                    }
                    if(alterar.length==0){
                        System.out.println("Não existem contactos com esse nome.\n");
                        break;
                    }else if(altera==1){
                        System.out.println("Contacto a alterar:\n" + alterar[0].toString());
                        System.out.print("Telefone: ");
                        telefone = sc.next();
                        System.out.print("Email: ");
                        email = sc.next();

                        for(int i=0; i<contactos.length; i++){
                            if(contactos[i] != null){
                            if(contactos[i].getId() == alterar[0].getId()){
                                contactos[i].setNumero(telefone);
                                contactos[i].setEmail(email);
                                break;
                                }
                            }
                        }
                    }else{
                        System.out.println("Existem " + altera + " contactos com esse nome. Escolha um para alterar:");
                        for(int i=0; i<altera; i++)
                            System.out.println(alterar[altera]);
                        
                        System.out.print("ID do contacto a alterar:");
                        int idal = sc.nextInt();

                        for(int i=0; i<contactos.length; i++){
                            if(contactos[i] != null){
                            if(contactos[i].getId() == idal){
                                System.out.println("Contacto a alterar:\n" + contactos[i].toString());
                                System.out.print("Telefone: ");
                                telefone = sc.next();
                                System.out.print("Email: ");
                                email = sc.next();
                                
                                contactos[i].setNumero(telefone);
                                contactos[i].setEmail(email);
                                break;
                                }
                            }
                        }
                    }

                    break;
                case "3":
                    if(count == 0){
                    System.out.println("Não existem contactos.\n");
                    break;
                }

                contacto[] apagarcontacto = new contacto[contactos.length];
                int countapagado=0;
                System.out.println("Nome do contacto que quer apagar?");
                nome=sc.next();
                for(int i=0;i<contactos.length;i++){
                    if(contactos[i] != null){
                    if(contactos[i].getNome().equals(nome)){
                            apagarcontacto[countapagado]=contactos[i];
                            countapagado++;
                    }
                }
                }
                if(countapagado==0){
                    System.out.println("Não há contactos para serem apagados");
                    break;
                }else if(countapagado==1){
                    System.out.println("Contacto a apagar: " + apagarcontacto[0].toString());
                    for(int t=0; t<contactos.length; t++){
                        if(contactos[t] != null){
                        if(contactos[t].getNome().equals(nome)){
                                contactos[t]=null;
                                countapagado--;
                            }
                        }
                        }
                }else{
                    System.out.println("Existem: " + countapagado+" contactos com esse nome.Escolha um deles");
                    for(int i=0; i<countapagado; i++){
                        System.out.println(apagarcontacto[i]);
                    }
                        
                    System.out.print("ID do contacto a apagar: ");
                    int ida = sc.nextInt();

                    for(int a=0; a<contactos.length; a++){
                        if(contactos[a] != null){
                            if(contactos[a].getId()==ida){
                                contactos[a]=null;
                                countapagado--;
                            }
                        }
                        }
                    
                    }

                    break;
                case "4":
                int num=0;
                    if(contactos.length == 0){
                        System.out.println("Não existem contactos.\n");
                        break;
                    }
                    System.out.println("Nome que queres encontrar?");
                    nome=sc.next();

                    for(int i=0;i<contactos.length;i++){
                        if(contactos[i]!=null){
                        if(contactos[i].getNome().equals(nome)){
                            System.out.println(contactos[i].toString());
                            num++;
                        }
                    }
                    }

                    if(num==0){
                        System.out.println("Não existem contactos com esse nome.\n");
                        break;
                    }

                    break;
                case "5":
                if(contactos[0]== null){
                    System.out.println("Não existem contactos.");
                }else{
                    for(int i=0;i<count;i++){
                        System.out.println(contactos[i].toString());
                    }
                }
                
                break;
                case "0":
                    System.out.println("Obrigado");
                    System.exit(0);
            }
        }while(!(op=="0"));
        
        }
    }

