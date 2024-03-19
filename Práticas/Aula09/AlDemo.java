package Aula09;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import Aula07.ex7_2.DateYMD;

import Aula06.*;


public class AlDemo {
        public static void main(String[] args) throws Exception {
                ArrayList<Integer> c1 = new ArrayList<>();
                for (int i = 10; i <= 100; i+=10) 
                        c1.add(i);
                System.out.println("Size: " + c1.size());
                for (int i = 0; i < c1.size(); i++) 
                        System.out.println("Elemento: " + c1.get(i));
                ArrayList<String> c2 = new ArrayList<>();
                c2.add("Vento");
                c2.add("Calor");
                c2.add("Frio");
                c2.add("Chuva");
                System.out.println(c2);
                Collections.sort(c2);
                System.out.println(c2);
                c2.remove("Frio"); 
                c2.remove(0);
                System.out.println(c2);

                Set<pessoa> c3 = new HashSet<>();
                c3.add (new pessoa("João", 20212121,new DateYMD(18,7,1990)));
                c3.add (new pessoa("Ana", 272838282,new DateYMD(22,5,1999)));
                c3.add (new pessoa("Ana", 272838282,new DateYMD(22,5,1999)));
                c3.add (new pessoa("Eduardo", 458484848,new DateYMD(10,3,2000)));
                for(pessoa p : c3)
                        System.out.println(p);

                Set<DateYMD> c4 = new TreeSet<>();
                c4.add(new DateYMD(11,7,2001));
                c4.add(new DateYMD(29,4,2009));
                c4.add((new DateYMD(22,5,2020)));
                for (DateYMD d : c4)
                        System.out.println(d);
                }

                


                


        }
        

