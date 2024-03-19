package Aula08;

import java.util.ArrayList;
import java.util.List;

public class Ementa {
    private String nome;
    private String local;
    private List<prato> listprato= new ArrayList<>();
    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }

    public List<prato> getListprato() {
        return listprato;
    }
    public void setListprato(List<prato> listprato) {
        this.listprato = listprato;
    }

    public Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");

        for (prato p : listprato) {
            sb.append(p.toString() + "\n");
        }

        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((listprato == null) ? 0 : listprato.hashCode());
        result = prime * result + ((local == null) ? 0 : local.hashCode());
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
        Ementa other = (Ementa) obj;
        if (listprato == null) {
            if (other.listprato != null)
                return false;
        } else if (!listprato.equals(other.listprato))
            return false;
        if (local == null) {
            if (other.local != null)
                return false;
        } else if (!local.equals(other.local))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    public void addPrato(prato p) {
        listprato.add(p);
    }
}

