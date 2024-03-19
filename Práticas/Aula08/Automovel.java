package Aula08;

public class Automovel extends veiculo {
    private int nquadro;
    private int capacidade;

public Automovel(String matricula, String marca, String modelo, int cilindrada, int nquadro, int capacidade) {
    super(matricula, marca, modelo, cilindrada);
    this.nquadro = nquadro;
    this.capacidade = capacidade;
}

public int getNquadro(){
    return nquadro;
}
public void setNquadro(int nquadro){
    this.nquadro = nquadro;
}

public int getCapacidade(){
    return capacidade;
}
public void setCapacidade(int capacidade){
    this.capacidade = capacidade;
}

@Override
public String toString() {
    return "Automóvel Ligeiro" + "\n    Matrícula: " + this.getMatricula() + "\n    Marca: " + this.getMarca()
                + "\n    Modelo: " + this.getModelo();
}

}



