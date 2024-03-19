package Aula06;

import Aula07.ex7_2.DateYMD;

public class ex6 {
    public static void main(String[] args) throws Exception{
        //DateYMD d=new DateYMD(5,10,1988);
        //pessoa p=new pessoa("Ana Santos", 98012244, d);

        aluno a1=new aluno("Andreia Melo", 9855678, new DateYMD(18,7,1990), new DateYMD(11,5,2018));
        professor p1 = new professor("Francisca Silva", 9855678,new DateYMD(18, 7, 1990), "Associado","Deti");
        bolseiro bls = new bolseiro ("Igor Santos", 8976543, new DateYMD(11, 5, 1985),p1,900);
        
        bls.setMontante(1050);
 
        System.out.println("Aluno: " + a1.getNome());
        System.out.println(a1);
 
        System.out.println("Bolseiro: " + bls.getNome() + ", NMec: " + bls.getNmec() + ", Bolsa: " + bls.getMontante() + ", Orientador: " + bls.getOrientador());
        System.out.println(bls);


        }
    }
