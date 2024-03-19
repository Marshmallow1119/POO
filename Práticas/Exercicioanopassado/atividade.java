package Exercicioanopassado;

public abstract class atividade {
    private String atividade;
    private int participant;
    private int preco;
    private String modal;
    
    public atividade(String atividade, String modal, int participant, int preco) {
        this.atividade = atividade;
        this.participant = participant;
        this.modal = modal;
        this.preco = preco;
    }
    public String getAtividade() {
        return atividade;
    }
    public void String(String atividade) {
        this.atividade = atividade;
    }
    public int getParticipant() {
        return participant;
    }
    public void setParticipant(int participant) {
        this.participant = participant;
    }
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }
    public String getModal() {
        return modal;
    }
    public void setModal(String modal) {
        this.modal = modal;
    }
}
