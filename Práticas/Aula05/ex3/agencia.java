package Aula05.ex3;

import Aula05.ex1.DateYMD;

class agencia{
    private imovel[] properties;
    private int count;

    public agencia(){
        this.properties = new imovel[100];
        this.count = 0;
    }

    public void newProperty(String location, int numquartos, int price){
        int id= 1000 + this.count;
        imovel p = new imovel(location,numquartos,price,id);
        this.properties[this.count] = p;
        this.count++;
    }

    public void sell(int id){
        for (int i = 0; i < this.count; i++) {
            if(this.properties[i].getId() == id){
                this.properties[i].sell();
                System.out.println("Imóvel "+id +" vendido.");
            }
        }
        System.out.println("Imóvel "+ id +" não está disponível.");
    }

    public void setAuction(int id, DateYMD date, int duration){

        for (int i = 0; i < this.count; i++) {
            if(this.properties[i].getId() == id){
                this.properties[i].setAuction(date, duration);
                return;
            }
        }
        System.out.println("Imóvel "+ id +" não existe.");
    }

    public String toString(){
        String s = "Propriedades: \n";
        for (int i = 0; i < this.count; i++) {
            s += this.properties[i].toString()+"\n";   }
        return s;
    }    
}




