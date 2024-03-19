package exercicio2anos;
import java.util.*;
public class Loja {
    private String nome, web;
    private TreeMap<String, Produto> produtos;
    public Loja(String nome, String web) {
        this.nome = nome;
        this.web = web;
        this.produtos = new TreeMap<>();;
    }
    public void add(Produto product){
        produtos.put(product.getCode(),product);
    }
    public int totalItems(){
        int total = 0;
        for(Produto a : produtos.values()){
            total+=a.getStock();
        }
        return total;
    }
    public String getProdutoPelaDescricao(String d){
        for(Produto p : produtos.values()){
            if(p.getDescricao().equals(d)){
                return p.toString();
            }
        }
        return "";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getWeb() {
        return web;
    }
    public void setEnderecoWeb(String web) {
        this.web = web;
    }
    public TreeMap<String, Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(TreeMap<String, Produto> produtos) {
        this.produtos = produtos;
    }
    public void reorder(){
        List<Produto> produtosbydesc = new ArrayList<>(produtos.values());
        produtosbydesc.sort(Comparator.comparing(Produto::getDescricao, String::compareToIgnoreCase));
        produtos.clear();
        for(Produto p : produtosbydesc){
            produtos.put(p.getDescricao(),p);
        }
    }
    public String electrodomesticosClasseX(String a){
        String print="";
        for(Produto p : produtos.values()){
            if(a.equals(String.valueOf(p.getEnerg()))){
                print += String.format("%-40s%10.2f %s%n", p.getDescricao(), p.precoVendaAoPublico(), String.valueOf(p.getEnerg()));
            }
        }
        return print;
    }
    public ArrayList<Produto> produtosPrecoFinalSuperiorA(double preco){
        ArrayList<Produto> aqui = new ArrayList<>();
        for(Produto p : produtos.values()){
            if(p.precoVendaAoPublico()>500){
                aqui.add(p);
            }
        }
        return aqui;

    }
    @Override
    public String toString() {
        String print ="Loja "+ nome+"\n\n";
        print+= String.format("%-45s%10s%10s%n", "Código produto", "Em Stock", "PVP");
        for(Produto p : produtos.values()){
            print+=String.format("%-45s%10d%10.2f%n", p.getCode()+" "+ p.getDescricao(), p.getStock(), p.precoVendaAoPublico());
        }
        return print;
    }
    
}
