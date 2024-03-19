package Aula04;

import java.util.ArrayList;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int  getQuantity() {
        return quantity;
    }

    @Override
    public String toString(){
        return String.format("%-16s %5.2f %6d    %.2f",name,price,quantity,getTotalValue());
    }

}


class CashRegister  {
    double total;

    private ArrayList<Product> produtos=new ArrayList<>();

    public void addProduct(Product produto) {
        produtos.add(produto);
        
    }

    @Override
    public String toString(){
        String resultado="";
        Double total=(double) 0;

        resultado+="Product \t Price  Quantify Total \n";
        for(int a=0;a<produtos.size();a++){
            resultado+=produtos.get(a).toString()+"\n";
            total+=produtos.get(a).getTotalValue();
            
        }
        resultado+= String.format("Total value: %.2f", total);

        return resultado;
    }

}

public class CashRegisterDemo {

    public static void main(String[] args) {

        // Cria e adiciona 5 produtos
        CashRegister cr = new CashRegister();
        cr.addProduct(new Product("Book", 9.99, 3));
        cr.addProduct(new Product("Pen", 1.99, 10));
        cr.addProduct(new Product("Headphones", 29.99, 2));
        cr.addProduct(new Product("Notebook", 19.99, 5));
        cr.addProduct(new Product("Phone case", 5.99, 1));
        
        // Listar o conteúdo e valor total
        System.out.println(cr);
        
    }
}