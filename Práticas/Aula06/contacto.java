package Aula06;

import java.util.regex.Pattern;

import Aula07.ex7_2.DateYMD;

public class contacto extends pessoa {
    private String email,numero;
    private int id;
    private static int count=1;
    

    public contacto(String nome, int cc, DateYMD nasc, String nummail) {
        super(nome, cc, nasc);
        if(validarnumero(nummail)){
            this.numero=nummail;
            this.email=null;
            this.id=count++;
        }else if(validaremail(nummail)){
            this.numero=null;
            this.email=nummail;
            this.id=count++;
        }
    }

    public contacto(String nome, int cc, DateYMD nasc, String email, String numero) {
        super(nome, cc, nasc);
        this.numero=numero;
        this.email=email;
        this.id=count++;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getId() {
        return id;
    }   


    public static boolean validarnumero(String numero){
        String regex="^9\\d{8}$";
        if(Pattern.matches(regex,numero)){
            return true;
        }else{
            return false;
        }

    }
    public static boolean validaremail(String email){
        String regex="^\\w+@\\w+\\.\\w+$";
        if(Pattern.matches(regex, email)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return id+"- Nome: "+this.getNome()+", CC: "+this.getCc()+", email: "+this.getEmail()+", número de telemóvel: "+ this.getNumero();
    }


    public void equals(contacto c){
        if(this.id == c.id){
            System.out.println("Contactos iguais");
        }else{
            System.out.println("Contactos diferentes");
        }
    }


/* 
    public static <contactos> void listarcontactos(contactos[] Contactos){
        if(Contactos.length<=0){
            System.out.println("Não existem contactos na tua lista");
        }else{
            for(int i=0;i<Contactos.length;i++){
                System.out.println(Contactos[i].toString());
            }
        } 
    }              Dúvidassssssssssssssssss*/

}

