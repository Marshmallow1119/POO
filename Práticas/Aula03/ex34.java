package Aula03;

import utils.*;

public class ex34 {
    public static void main (String args[]){
        int na;
        double NP;
        double NT;
        int NF=0;

        System.out.print("Número de Alunos? ");
        na=UserInput.Validar(1, 50);
        
        double[][] notas= new double[na][3]; //nº de aluno=linhas e por cada linha quero duas notas

        System.out.printf("%10s %10s %10s\n", "NotaT", "NotaP", "Pauta");
        for(int aluno=0;aluno<na;aluno++){//com o for vou percorrer cada aluno e depois faz a tabela 
           NP=notas[aluno][0]=UserInput.randomnumber(0,20);
           NT=notas[aluno][1]=UserInput.randomnumber(0, 20);
           NF=(int)(notas[aluno][2]=UserInput.validanota(NP, NT));
           System.out.printf("%10s %10s %10s\n", NT, NP, NF);	
        }
        
        
            
        }
        


    }

