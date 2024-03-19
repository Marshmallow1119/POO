package TesteP;

import java.time.LocalDate;

public class Booking {
    private LocalDate datainicio;
    private LocalDate datafinal;
    private CampingSpace tipo;


    public Booking(CampingSpace tipo) {
        this.tipo = tipo;
    }


    public Booking(LocalDate datainicio, LocalDate datafinal, CampingSpace tipo) {
        this.datainicio = datainicio;
        this.datafinal = datafinal;
        this.tipo = tipo;
    }
    
    
    public LocalDate getDatainicio() {
        return datainicio;
    }
    public void setDatainicio(LocalDate datainicio) {
        this.datainicio = datainicio;
    }
    public LocalDate getDatafinal() {
        return datafinal;
    }
    public void setDatafinal(LocalDate datafinal) {
        this.datafinal = datafinal;
    }
    public CampingSpace getTipo() {
        return tipo;
    }
    public void setTipo(CampingSpace tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((datainicio == null) ? 0 : datainicio.hashCode());
        result = prime * result + ((datafinal == null) ? 0 : datafinal.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
        Booking other = (Booking) obj;
        if (datainicio == null) {
            if (other.datainicio != null)
                return false;
        } else if (!datainicio.equals(other.datainicio))
            return false;
        if (datafinal == null) {
            if (other.datafinal != null)
                return false;
        } else if (!datafinal.equals(other.datafinal))
            return false;
        if (tipo != other.tipo)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Booking [datainicio=" + datainicio + ", datafinal=" + datafinal + ", tipo=" + tipo + "]";
    }
        

}
