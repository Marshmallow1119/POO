package Exercicioanopassado;

public class Culture extends atividade {
private Option2 option2;

    public Culture(Option2 option,int numeroParticipantes) {
        super("Culture", String.valueOf(option),numeroParticipantes,22 );
        this.option2=option;
    }

    public Option2 getOption2() {
        return option2;
    }
    public void setOption2(Option2 option2) {
        this.option2 = option2;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((option2 == null) ? 0 : option2.hashCode());
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
        Culture other = (Culture) obj;
        if (option2 != other.option2)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Culture: option2=" + option2;
    }
}
