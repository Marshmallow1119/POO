package Exercicioanopassado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class event implements IEvent{
    private LocalDate date;
    private List<atividade> atividades = new ArrayList<>();

    public event(LocalDate date) {
        this.date = date;
    }

    @Override
    public event addAtividade(atividade activity) {
        boolean g = false;
        for(atividade i : atividades){
            if((i.getModal().equals("Catering")) && (activity.getModal().equals("Catering")) ){
                g=true;
                break;
            }
            else{
                g=false;
            }
        }
        if(!g){
            atividades.add(activity);
        }
        event event = new event(getDate());
        return event ;
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    @Override
    public double totalprice() {
        double total = 0;
        for (atividade a : atividades) {
            total += a.getParticipant() * a.getPreco();
        }
        return total;
    }

    public List<atividade> getAtividades() {
        return atividades;
    }

    @Override
    public String toString() {
        String res = "*** Evento em "+this.date + ", total="+this.totalprice()+"\n";
        for (atividade a : this.atividades){
            res += "\t"+a+"\n";
        }
        return res.substring(0, res.length()-1);
    }


    }

