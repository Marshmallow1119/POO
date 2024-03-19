package Aula12;

import java.util.*;
import java.io.*;
public class ex12_2 {


    public static void main(String[] args){
        Map<String, Integer> plavnum = new TreeMap<>();
        Map<String, Map<String, Integer>> plfinal = new TreeMap<>();

        try(Scanner sc = new Scanner(new File("A_cidade_e_as_serras.txt"), "UTF-8")){
            while(sc.hasNextLine()){
                String[] words = sc.nextLine().split("[\\s\\t\\n.,:''';?!\\-*{}=+«»&/()\\[\\]”“\"']");
                for(String word : words){
                    if (word.length() < 3)
                        continue;
                    if (Character.isUpperCase(word.charAt(0)))
                        word = word.toLowerCase();
                    

                    if(!plavnum.containsKey(word)){
                        plavnum.put(word, 1);
                    }else{
                        plavnum.put(word, plavnum.get(word)+1);
                    }
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        for (String word : plavnum.keySet()){
            String inicial = word.substring(0, 1);

            if (plfinal.containsKey(inicial)){
                plfinal.get(inicial).put(word, plavnum.get(word));
            }else{
                Map<String, Integer> temp = new TreeMap<>();
                temp.put(word, plavnum.get(word));
                plfinal.put(inicial, temp);
            }
        }

        Iterator<Map.Entry<String, Map<String, Integer>>> it = plfinal.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Map<String, Integer>> entry = it.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
            System.out.println();
        }

    }

    
}
