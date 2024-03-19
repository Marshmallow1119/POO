package Aula08;

public class legume extends alimento implements alimentovegetariano {
    private String nome;

    public String getName() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public legume(String name,double proteina, double calorias, double peso) {
        super(proteina, calorias, peso);
        this.nome=name;
    }

    @Override
    public String toString() {
        return String.format("Legume %s, %s", nome, super.toString());
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
        legume other = (legume) obj;
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
