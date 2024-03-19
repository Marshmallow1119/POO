package Aula05.ex3;

import Aula05.ex1.DateYMD;


public class imovel {
    private int id;
        private String location;
        private int numquartos;
        private int price;
        private boolean sold;
        private DateYMD auctionDate;


        public imovel(String location, int numquartos, int price, int id){
            this.id = id;
            this.location = location;
            this.numquartos = numquartos;
            this.price = price;
            this.sold = false;
            this.auctionDate = null;
        }

        public int getId(){return this.id;}
        public String getLocation(){return this.location;}
        public int getNumquartos(){return this.numquartos;}
        public int getPrice(){return this.price;}
        public boolean getSold(){return this.sold;}
        public DateYMD getAuctionDate(){return this.auctionDate;}



        public void sell(){
            if(this.sold == false){
                this.sold = true;
                this.auctionDate = null;
            }
        }

        public void setAuction(DateYMD date, int duration){
            if(this.sold == false){
                this.auctionDate = date;
            }
        }
        
        public String toString(){
            String s = "Imóvel: "+this.id+"; ";
            s += "quartos: "+this.numquartos+"; ";
            s += "localidade: "+this.location+"; ";
            s += "preço: "+this.price+"; ";
            if (this.sold==false)
                s += "disponível: sim; ";
            else
                s += "disponível: não; ";
            if(this.auctionDate != null){
                s += "leilão " +this.auctionDate.toString() +" : "+this.auctionDate.toString();
            }
            return s;
        }

    }


