package Aula08;

public class praatovegetariano extends prato{
    public praatovegetariano(String nome) {
        super(nome);
    }
    
    @Override
    public boolean addIngrediente(alimento c) {
        if (c instanceof alimentovegetariano) {
            super.addIngrediente(c);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
            return String.format("Prato %s, composto por %d Ingredientes - Prato Vegetariano", super.getNome(),super.getConjunto().size());
    }
    

}
