package exercicio2anos;

public class Electrodomestico extends Produto implements PVP{
    private String tipo, marca, modelo;
    private ClasseEnergetica energ;
    private int potencia;
    public Electrodomestico(String tipo, String marca, String modelo, int pot,double price) {
        super("E", price);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }
    public Electrodomestico(String tipo, String marca, String modelo,double price) {
        super("E", price);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    @Override
    public ClasseEnergetica getEnerg() {
        return energ;
    }
    public String getDescricao(){
        return tipo+":"+marca+"/"+modelo;
    }
    public void setClasse(ClasseEnergetica energ) {
        this.energ = energ;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPot(int pot) {
        this.potencia = pot;
    }
    @Override
    public double precoVendaAoPublico(){
        return getPrice()+getPrice()*0.23;
    }
    @Override
    public String toString() {
        return "Electrodomestico [tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + ", energ=" + energ
                + ", potencia=" + potencia + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + ((energ == null) ? 0 : energ.hashCode());
        result = prime * result + potencia;
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
        Electrodomestico other = (Electrodomestico) obj;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
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
        if (energ != other.energ)
            return false;
        if (potencia != other.potencia)
            return false;
        return true;
    }
}
