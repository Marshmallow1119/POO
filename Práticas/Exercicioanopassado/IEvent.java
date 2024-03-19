package Exercicioanopassado;

import java.time.LocalDate;

public interface IEvent {
    event addAtividade(atividade atividade);
    double totalprice();
    LocalDate getDate();
}
