package Aula08;

public class cereal extends alimento implements alimentovegetariano  {
    String nome;

    public cereal(String nome, double proteina, double calorias, double peso) {
        super(proteina, calorias, peso);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("Cereal %s, %s", nome, super.toString());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        cereal other = (cereal) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    
    public boolean isVegetarian() {
        return true;
    }

}
