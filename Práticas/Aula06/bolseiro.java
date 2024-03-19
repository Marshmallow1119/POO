package Aula06;

import Aula07.ex7_2.DateYMD;


public class bolseiro extends aluno {
    private double montante;
    private professor orientador;
    
    public bolseiro(String nome, int cc, DateYMD nasc,professor orientador,double montante) throws Exception {
        super(nome, cc, nasc);
        this.montante = montante;
        this.orientador = orientador;
    }
    public double getMontante() {
        return montante;
    }
    public void setMontante(double montante) {
        this.montante = montante;
    }
    
    public String getOrientador() {
        return orientador.getNome();
    }
    public void setOrientador(professor orientador) {
        this.orientador = orientador;
    }



    @Override
    public String toString(){
        return "Nome: "+this.getNome()+", Nmec: "+this.getNmec()+", Valor da bolsa: "+this.montante+", Orientador: "+this.getOrientador();
    }


}
