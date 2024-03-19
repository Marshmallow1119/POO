package Aula10;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class ex10_4 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new FileReader("Maravilha.txt")); //Na pasta do projeto, caso seja executado a partir do IDE
        Set<String> palavras=new HashSet<String>();
        Set<String> palavcoms=new HashSet<String>();

        while (input.hasNext()) {
            String word = input.next();
            System.out.println(word);
            if(word.length()>3){
                palavras.add(word);
            }if(word.endsWith("s")){
                palavcoms.add(word);
            }
        }
        System.out.println("Palavras que terminam com s");
        for(String s: palavcoms){
            System.out.println(s);
        }
        System.out.println("Palavras com tamanho maior que 2");
        for(String s: palavras){
            System.out.println(s);
        }
        System.out.println("Palavras constituidas apenas por letras");
        ArrayList<String> palvrasf =new ArrayList<>();
        for(String s: palavras){
            palvrasf.add(s);
        }
        for(int b = 0; b< palvrasf.size();b++){
            String newword = palvrasf.get(b);
            for(int i=0;i<newword.length();i++){
                if(!Character.isLetter(newword.charAt(i))){
                    palavras.remove(newword);
                }
            }
        }
        System.out.println(palavras);
        }
        
        
}


