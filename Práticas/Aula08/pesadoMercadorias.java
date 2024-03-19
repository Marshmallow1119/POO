package Aula08;

public class pesadoMercadorias extends veiculo {
    private int nquadro;
    private double peso;
    private double cargamax;


public pesadoMercadorias(String matricula, String marca, String modelo, int cilindrada, int nquadro, double peso){
    super(matricula, marca, modelo, cilindrada);
    this.nquadro = nquadro;
    this.peso = peso;
}

public int getNquadro(){
    return nquadro;
}
public void setNquadro(int nquadro){
    this.nquadro = nquadro;
}

public double getPeso(){
    return peso;
}
public void setPeso(double peso){
    this.peso = peso;
}

public double getCargamax(){
    return cargamax;
}
public void setCargamax(double cargamax){
    this.cargamax = cargamax;
}

@Override
public String toString() {
    return "Pesado de Mercadorias" + "\n    Matrícula: " + this.getMatricula() + "\n    Marca: " + this.getMarca()
                + "\n    Modelo: " + this.getModelo();
}

}
