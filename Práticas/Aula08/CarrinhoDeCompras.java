package Aula08;

import java.util.ArrayList;

public class CarrinhoDeCompras implements compra {
    ArrayList<produto> produtos = new ArrayList<>();
    produto produto;
    int quantidade;
    public int total=0;

    public CarrinhoDeCompras(produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public CarrinhoDeCompras() {
    }

    public produto getProduto() {
        return produto;
    }
    public void setProduto(produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    
    @Override
    public void adicionarProduto(produto produto, int quantidade) {
        produtos.add(produto);
        produto.setQuantidade(quantidade);
    }

    @Override
    public void listarProdutos() {
        for(int i=0;i<produtos.size();i++){
            System.out.println(produtos.get(i));
        }
    }

    @Override
    public void calcularTotal() {
        for(int i=0;i<produtos.size();i++){
            total+=produtos.get(i).getPreco()*produtos.get(i).getQuantidade();
        }
        System.out.println("Total: "+total+" euros");
    }
    
}
