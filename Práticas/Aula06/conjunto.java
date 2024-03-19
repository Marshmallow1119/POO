package Aula06;

import java.util.Vector;


public class conjunto {
    //utilizar vetores para implementar funções
    //atributo
    private Vector<Integer> conjunto; 
    
    //caso seja dado um vetor com alguns numeros
    
    public conjunto(int[] conjunto) {
        this.conjunto = new Vector<>();
        for(int i=0;i<conjunto.length;i++){
            this.conjunto.add(conjunto[i]);
        }
    }

    //vetor vazio 
    public conjunto(){
        this.conjunto=new Vector<>();
    }

    public Vector<Integer> getConjunto() {
        return conjunto;
    }

    public void setConjunto(Vector<Integer> conjunto) {
        this.conjunto = conjunto;
    }

    @Override
    public String toString(){
        String a="";
        for(int i=0;i<this.conjunto.size();i++){
           a+=this.conjunto.get(i)+" "; //pra obter o elemento dessa posição
        }
        return a;
    }

    public void insert(int n){
        if(!this.conjunto.contains(n)){
            this.conjunto.add(n);
    }
}

    public boolean contains(int n){
        if(this.conjunto.contains(n)){
            return true;
        }else{
            return false;
        }
    }

    public void remove(int n){
        if(this.conjunto.contains(n)){
            this.conjunto.remove(this.conjunto.indexOf(n));
        }
    }

    public void empty(){
        this.conjunto.clear();
    }

    public int size(){
        return this.conjunto.size();
    }

    public boolean equals(conjunto c){
        if(this.conjunto.size()==c.conjunto.size()){
            for(int i=0; i< this.conjunto.size();){
                if(this.conjunto.get(i)==c.conjunto.get(i)){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }

    public conjunto uniao(conjunto u){
        conjunto c =new conjunto();
        for(int i=0;i< this.conjunto.size();i++){
            c.insert(this.conjunto.get(i));
        }
        for(int i=0;i<u.conjunto.size();i++){
            c.insert(u.conjunto.get(i));
        }
        return c;
    }

    public conjunto intersecao(conjunto inter){
        conjunto c= new conjunto();
        for(int i=0;i<this.conjunto.size();i++){
            for(int t=0;t<inter.conjunto.size();t++){
                if(inter.conjunto.contains(this.conjunto.get(t))){
                    c.insert(this.conjunto.get(t));
                }
            }    
        }
        return c;
    }
    public conjunto diferenca(conjunto d){
        conjunto a=new conjunto();
        for(int i=0;i<this.conjunto.size();i++){
            if(!d.conjunto.contains(this.conjunto.get(i))){
                a.insert(this.conjunto.get(i));
            }
        }
        return a;
    }

    
    }

