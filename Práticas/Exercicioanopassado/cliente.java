package Exercicioanopassado;

public class cliente {
    private String Nome;
    private String localidade;


    public cliente(String nome, String localidade) {
        this.Nome = nome;
        this.localidade = localidade;
    }


    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getLocalidade() {
        return localidade;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }


    @Override
    public String toString() {
        return this.Nome + " ["+this.localidade+"]";
    }
    
    
}
