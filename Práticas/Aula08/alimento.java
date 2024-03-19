package Aula08;

public class alimento {
    private double proteinas;
    private double calorias;
    private double peso;

    public alimento(double proteina, double calorias, double peso) {
        this.proteinas = proteina;
        this.calorias = calorias;
        this.peso = peso;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return String.format("Proteínas %.1f, calorias %.1f, Peso %.1f", proteinas, calorias, peso);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(calorias);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(peso);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(proteinas);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        alimento other = (alimento) obj;
        if (Double.doubleToLongBits(calorias) != Double.doubleToLongBits(other.calorias))
            return false;
        if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
            return false;
        if (Double.doubleToLongBits(proteinas) != Double.doubleToLongBits(other.proteinas))
            return false;
        return true;
    }

}
