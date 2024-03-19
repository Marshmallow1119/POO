package exercicio2anos;

public abstract class Produto {
    private String code;
    private static int counter=500;
    private int stock;
    private double price;
    public Produto(String code, double price) {
        this.code = code+ Integer.toString(2*counter++);
        this.stock = 1;
        this.price = price;
    }
    public String getCode() {
        return code;
    }
    public double precoVendaAoPublico(){
        return 0;
    }
    public void addStock(int add){
        this.stock = stock + add;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getPrice() {
        return price;
    }
    public ClasseEnergetica getEnerg(){
        return null;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean vender(int v){
        if(v>this.stock){
            return false;
        }
        else{
            int newstock = this.stock-v;
            setStock(newstock);
            return true;
        }
    }
    public String getDescricao(){
        return "";
    }
}
