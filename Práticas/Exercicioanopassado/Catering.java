package Exercicioanopassado;

public class Catering extends atividade {
    private Option opcao;
    
    
    public Catering(Option option,int numeroParticipantes) {
        super("Catering", String.valueOf(option), numeroParticipantes, 25);
        this.opcao=option;
    }


    public Option getOpcao() {
        return opcao;
    }
    public void setOpcao(Option opcao) {
        this.opcao = opcao;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((opcao == null) ? 0 : opcao.hashCode());
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
        Catering other = (Catering) obj;
        if (opcao != other.opcao)
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Catering: opcao=" + opcao ;
    }

    
  
    
}
