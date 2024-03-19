package Aula08;

public class ProdutoComDesconto extends ProdutoGenerico {
    private int desconto;

    public ProdutoComDesconto(String nome, double preco, int quantidadeStock, int desconto) {
        super(nome, preco, quantidadeStock);
        this.desconto = desconto;
        this.getPreco();
    }

    public int getDesconto() {
        return desconto;
    }
    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    
    @Override
    public double getPreco() {
        return super.getPreco() * (1 - desconto / 100.0);
    }
    @Override
    public String toString() {
        return "ProdutoComDesconto: nome=" + this.getNome()+ ", preco=" + this.getPreco() + ", quantidadeStock=" + this.getQuantidade();
    }
}
  