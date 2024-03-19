package Exercicioanopassado;

public class Sport extends atividade{
    public Modalidade modalidade;

    public Sport(Modalidade modalidade,int numeroParticipantes) {
        super("Sport",String.valueOf(modalidade), numeroParticipantes,30);
        this.modalidade=modalidade;
    }
    public Modalidade getModalidade() {
        return modalidade;
    }
    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((modalidade == null) ? 0 : modalidade.hashCode());
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
        Sport other = (Sport) obj;
        if (modalidade != other.modalidade)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Sport: modalidade=" + modalidade ;
    }

    
    
}
