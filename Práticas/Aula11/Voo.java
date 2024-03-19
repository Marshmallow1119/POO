package Aula11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Voo {
    
    ArrayList<String> Voos = new ArrayList<String>();

    public void load() throws FileNotFoundException{
        try{
            Scanner sca =new Scanner(new FileReader("voos.txt"));
            while(sca.hasNext()){
                String[] voo= sca.nextLine().split("\t");
                //Boolean regex=Pattern.matches("[0-9]{2}:[0-9]{2} \\w{2,} [0-9]{4}\t\\w{4,}\t[0-9]{2}:[0-9]{2}",voo);
                String hora= voo[0];
                String VOO= voo[1];
                String origem= voo[2];
                String atraso= voo[3];
                Voos.addAll(List.of(hora,VOO,origem,atraso));
                for(int i=0;i<Voos.size();i++){
                    System.out.printf("%2s %4s %4s %4s\n",Voos.get(i),Voos.get(i+1),Voos.get(i+2),Voos.get(i+3));
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
            
        }
    }




