package Aula05.ex3;


import Aula05.ex1.DateYMD;

public class ex3 {
    public static void main(String[] args) throws Exception {
        agencia imobiliaria = new agencia();
        imobiliaria.newProperty("Glória", 2, 30000);
        imobiliaria.newProperty("Vera Cruz", 1, 25000);
        imobiliaria.newProperty("Santa Joana", 3, 32000);
        imobiliaria.newProperty("Aradas", 2, 24000);
        imobiliaria.newProperty("São Bernardo", 2, 20000);

        imobiliaria.sell(1001);
        imobiliaria.setAuction(1002, new DateYMD(21, 3, 2023), 4);
        imobiliaria.setAuction(1003, new DateYMD(1, 4, 2023), 3);
        imobiliaria.setAuction(1001, new DateYMD(1, 4, 2023), 4);
        imobiliaria.setAuction(1010, new DateYMD(1, 4, 2023), 4);

        System.out.println(imobiliaria);

    
}




    }

