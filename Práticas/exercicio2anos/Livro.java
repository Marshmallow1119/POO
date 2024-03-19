package exercicio2anos;
import java.util.*;

public class Livro extends Produto implements PVP{
    private String title;
    private HashSet<Autor> autores;
    public Livro(String title, double price, List<Autor> autoress) {
        super("L", price);
        this.title = title;
        this.autores = new HashSet<>();
        for(Autor c : autoress){
            autores.add(c);
        }
    }
    public Livro(String title, double price) {
        super("L", price);
        this.title = title;
        this.autores = new HashSet<>();
    }
    public void add(Autor a){
        autores.add(a);
    }
    public String getTitulo() {
        return title;
    }
    public int numeroAutores(){
        return autores.size();
    }
    public void setTitulo(String title) {
        this.title = title;
    }
    public HashSet<Autor> getLista() {
        return autores;
    }
    public HashSet<Autor> autores() {
        return autores;
    }
    public void setAutores(HashSet<Autor> autores) {
        this.autores = autores;
    }
    @Override
    public String getDescricao(){
        return title;
    }
    @Override
    public double precoVendaAoPublico(){
        return getPrice()+getPrice()*0.06;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((autores == null) ? 0 : autores.hashCode());
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
        Livro other = (Livro) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (autores == null) {
            if (other.autores != null)
                return false;
        } else if (!autores.equals(other.autores))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Livro [title=" + title + ", autores=" + autores + "]";
    }
}
