package Aula08;

public class ProdutoGenerico implements produto {
    private String nome;
    private double preco;
    private int quantidadeStock;

    public ProdutoGenerico(String nome, double preco, int quantidadeStock) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeStock = quantidadeStock;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    } 

    public int getQuantidade() {
        return quantidadeStock;
    }
    public void setQuantidade(int quantidade) {
        this.quantidadeStock = quantidade;
    }

    @Override
    public void adicionarQuantidade(int quantidade) {
        quantidadeStock+=quantidade;
        
    }

    @Override
    public void removerQuantidade(int quantidade) {
        quantidadeStock-=quantidade;
    }


    @Override
    public String toString() {
        return "ProdutoGenerico: nome=" + nome + ", preco=" + preco + ", quantidadeStock=" + quantidadeStock;
    }
}
