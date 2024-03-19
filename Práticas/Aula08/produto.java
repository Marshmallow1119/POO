package Aula08;

public interface produto {
    String getNome();
    double getPreco();
    int getQuantidade();
    void adicionarQuantidade(int quantidade);
    void removerQuantidade(int quantidade);
    void setQuantidade(int quantidade);
}
