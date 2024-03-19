package exercicio2anos;

public class Documentario extends Produto implements PVP{
    private String title;
    private String time;
    public Documentario(String title, String time, double price) {
        super("D", price);
        this.title = title;
        this.time = time;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    @Override
    public String getDescricao(){
        return title;
    }
    @Override
    public double precoVendaAoPublico(){
        return getPrice()+getPrice()*0.23;
    }
    @Override
    public String toString() {
        return "Documentario [title=" + title + ", time=" + time + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((time == null) ? 0 : time.hashCode());
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
        Documentario other = (Documentario) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (time == null) {
            if (other.time != null)
                return false;
        } else if (!time.equals(other.time))
            return false;
        return true;
    }
}
