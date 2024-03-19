package Aula08;

import java.util.ArrayList;
import java.util.List;

public class prato {
    private String nome;
    private List<alimento> conjunto = new ArrayList<>();
    
    public prato(String nome) {
        this.nome = nome;
    }
    public List<alimento> getConjunto() {
        return conjunto;
    }
    public void setConjunto(List<alimento> conjunto) {
        this.conjunto = conjunto;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
            return String.format("Prato %s, composto por %d Ingredientes", this.getNome(), this.getConjunto().size());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((conjunto == null) ? 0 : conjunto.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        prato other = (prato) obj;
        if (conjunto == null) {
            if (other.conjunto != null)
                return false;
        } else if (!conjunto.equals(other.conjunto))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    public boolean addIngrediente(alimento c) {
        conjunto.add(c);
        return true;
    }
}
