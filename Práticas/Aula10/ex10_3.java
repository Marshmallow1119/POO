package Aula10;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;


public class ex10_3 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String frase;
        HashMap<String,ArrayList<Integer>> map = new HashMap<>(); //Associa uma key a um value
        System.out.println("Insira uma frase: ");
        frase = sc.nextLine();	
        char[] frase_array = frase.toCharArray();
        for (int i = 0; i<frase_array.length;i++){
            if(map.containsKey(Character.toString(frase_array[i]))){
                map.get(Character.toString(frase_array[i])).add(i);
            }
            else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(Character.toString(frase_array[i]), temp);
            }
        }
        for (String c : map.keySet()){
            System.out.println("'"+c+"'" + " -> " + map.get(c));
        }
        
    }
}
