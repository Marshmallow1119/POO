package Aula08;


public class pratoDieta extends prato {
    double maxcalorias;
    double calorias;

    public double getMaxcalorias() {
        return maxcalorias;
    }
    public void setMaxcalorias(double maxcalorias) {
        this.maxcalorias = maxcalorias;
    }


    public pratoDieta(String nome,Double maxcalorias) {
        super(nome);
        this.maxcalorias=maxcalorias;
    }	
    @Override
    public boolean addIngrediente(alimento c) {
        if (c instanceof alimentovegetariano) {
            super.addIngrediente(c);
            calorias+=c.getCalorias();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Prato %s, composto por %d Ingredientes - Dieta (%.2f Calorias)", super.getNome(),super.getConjunto().size(),calorias); 
       }
    
}
