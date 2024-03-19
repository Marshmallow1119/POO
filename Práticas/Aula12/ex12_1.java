package Aula12;

import java.io.File;
import java.util.*;

public class ex12_1 {

     public static void load(String path) throws Exception {
            int eqwords=0;
            int dffwords=0;
            
            try{
                Scanner scanner= new Scanner(new File(path),"UTF-8");
                while(scanner.hasNext()){
                    ArrayList<String> words= new ArrayList<>();
                    String[] w1=scanner.nextLine().toLowerCase().split(" ");
                    for(int i=0; i<w1.length;i++){
                        if(!words.contains(w1[i])){
                            words.add(w1[i]);
                            dffwords++;
                        }else{
                            dffwords--;
                            eqwords++;
                        }
                    }
            }
            }catch(Exception e){
                throw new Exception("O ficheiro inserido não existe");
            }

            System.out.println("Number of different words: "+dffwords);
            System.out.println("Number of equal words: "+eqwords);
            
    }
}




