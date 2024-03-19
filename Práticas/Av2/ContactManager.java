package Av2;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Pattern;



public class ContactManager implements ContactManagerInterface {
    
    ArrayList<Contact> contactos=new ArrayList<>();

    public void load(String filePath) {
        try{
            Scanner scanner = new Scanner(new File("contactos.txt"), "UTF-8");
            scanner.nextLine();
            while(scanner.hasNext()){
                String[] line=scanner.nextLine().split("\t");
                String nome=line[0];
                int telefone=Integer.parseInt(line[1]);
                String email=line[2];
                LocalDate data=LocalDate.parse(line[3]);
                Contact m =new Contact(nome,telefone,email,data);
                contactos.add(m);
                System.out.println(m.toString());
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void save(String filePath) {
        try{
            PrintWriter out = new PrintWriter(new FileWriter(filePath));
            for(Contact finalcontacts:contactos){
                out.println(finalcontacts.getName()+","+finalcontacts.getPhoneNumber()+","+finalcontacts.getEmail()+","+finalcontacts.getBirthDate());
            }
            out.close();
        }catch(Exception e){
            System.out.println(e);
        } 
        }
        


    @Override
    public boolean validateEmail(String email) {
        String regex="^\\w+@\\w+\\.\\w+$";
        if(Pattern.matches(regex, email)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean validatePhoneNumber(String phoneNumber) {
        String regex="{9}[0-9]{8}";
        if(Pattern.matches(regex, phoneNumber)){
            return true;
        }else{
        return false;
        }
    }

    @Override
    public boolean addContact(Contact person) {
        if(!contactos.contains(person)){
            contactos.add(person);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean removeContact(Contact person) {
        for(Contact c:contactos){
            if(c.equals(person)){
                contactos.remove(c);
                return true;
            }
        }
        return false;
    }

    @Override
    public Contact searchContactByname(String name) {
        for(Contact c:contactos){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;    
    }

    @Override
    public Contact searchContactByEmail(String email) {
        for(Contact c:contactos){
            if(c.getEmail().equals(email)){
                return c;
            }
        }
        return null;
    }

    @Override
    public Contact searchContactByPhoneNumber(int phoneNumber) {
        for(Contact c:contactos){
            if(c.getPhoneNumber()==phoneNumber){
                return c;
            }
        }
        return null;
    }

    @Override
    public void listAllContacts() {
        for(Contact c:contactos){
            System.out.println(c.toString());
        }
    }


    @Override
    public void listContactsByName() {
        System.out.println("Contactos ordenados pelo nome:\n");
        Collections.sort(contactos, new Comparator<Contact>() {
                @Override
                public int compare(Contact m1, Contact m2){
                    return m1.getName().compareTo(m2.getName());
                }
            });
            for(Contact m: contactos){
                System.out.println(m);
            }
    }

    @Override
    public void listContactsByPhoneNumber() {
        System.out.println("Contactos ordenados pelo número:\n");
        Collections.sort(contactos, new Comparator<Contact>() {
                @Override
                public int compare(Contact m1, Contact m2){
                    return m1.getPhoneNumber()-m2.getPhoneNumber();
                }
            });
            for(Contact m: contactos){
                System.out.println(m);
            }
    }

    @Override
    public void listContactsByemail() {
        System.out.println("Contactos ordenados pelo email:\n");
        Collections.sort(contactos, new Comparator<Contact>() {
                @Override
                public int compare(Contact m1, Contact m2){
                    return m1.getEmail().compareTo(m2.getEmail());
                }
            });
            for(Contact m: contactos){
                System.out.println(m);
            }
    }
    

    @Override
    public void listContactsByBirthDate() {
        System.out.println("Contactos ordenados pela data:\n");
        Collections.sort(contactos, new Comparator<Contact>() {
                @Override
                public int compare(Contact m1, Contact m2){
                    return m1.getBirthDate().compareTo(m2.getBirthDate());
                }
            });
            for(Contact m: contactos){
                System.out.println(m);
            }
    }
    
}
