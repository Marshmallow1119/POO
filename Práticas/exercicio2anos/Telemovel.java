package exercicio2anos;
import java.util.*;

public class Telemovel extends Produto implements PVP{
    private String marca;
    private String modelo;
    private List<String> notas;
    
    public Telemovel(String marca, String modelo, List<String> notas, double price) {
        super("T", price);
        this.marca = marca;
        this.modelo = modelo;
        this.notas = notas;
    }
    public Telemovel(String marca, String modelo, double price) {
        super("T", price);
        this.marca = marca;
        this.modelo = modelo;
        this.notas = new ArrayList<>();;
    }
    public void addNota(String newe){
        notas.add(newe);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<String> getNotas() {
        return notas;
    }

    public void setNotas(List<String> notas) {
        this.notas = notas;
    }
    @Override
    public String getDescricao(){
        return marca.toUpperCase()+"/"+modelo;
    }
    @Override
    public double precoVendaAoPublico(){
        return getPrice()+getPrice()*0.23;
    }
    @Override
    public String toString() {
        return "Telemovel [marca=" + marca + ", modelo=" + modelo + ", notas=" + notas + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + ((notas == null) ? 0 : notas.hashCode());
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
        Telemovel other = (Telemovel) obj;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        if (notas == null) {
            if (other.notas != null)
                return false;
        } else if (!notas.equals(other.notas))
            return false;
        return true;
    }

}
