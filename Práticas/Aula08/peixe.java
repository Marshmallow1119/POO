package Aula08;

public class peixe extends alimento {

    variedadePeixe variedade;


    public peixe(variedadePeixe variedade,double proteina, double calorias, double peso) {
        super(proteina, calorias, peso);
        this.variedade = variedade;
    }
    

    public variedadePeixe getVariedade() {
        return variedade;
    }
    public void setVariedade(variedadePeixe variedade) {
        this.variedade = variedade;
    }


    @Override
    public String toString() {
        return String.format("Peixe %s, %s", variedade, super.toString());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((variedade == null) ? 0 : variedade.hashCode());
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
        peixe other = (peixe) obj;
        if (variedade != other.variedade)
            return false;
        return true;
    }

}


