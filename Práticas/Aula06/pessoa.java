package Aula06;


import Aula07.ex7_2.DateYMD;

public class pessoa {
    private String nome;
    private int cc;
    private DateYMD nasc;

    public pessoa(String nome,int cc,DateYMD dateYMD){
        this.nome=nome;
        this.cc=cc;
        this.nasc=dateYMD;
    }


    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCc(){
        return cc;
    }
    public void setNome(int cc) {
        this.cc = cc;
    }
    public DateYMD getNasc(){
        return nasc;
    }
    public void setNasc(DateYMD nasc) {
        this.nasc = nasc;
    }


    @Override
    public String toString(){
        return "Nome: "+this.nome+", CC: "+cc+", Data de nascimento: "+this.nasc;
    }

    @Override
    public boolean equals(Object o){
        if(o==this) return true;
        if(!(o instanceof pessoa)) return false;
        pessoa p = (pessoa) o;
        return p.cc==this.cc;
    }

    @Override
    public int hashCode(){
        return this.cc;
    }

}
