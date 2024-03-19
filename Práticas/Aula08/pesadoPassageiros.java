package Aula08;

public class pesadoPassageiros extends veiculo{
    private int nquadro;
    private double peso;
    private int nummaxpass;

    public pesadoPassageiros(String matricula, String marca, String modelo, int cilindrada, int nquadro, double peso) {
        super(matricula, marca, modelo, cilindrada);
        this.nquadro = nquadro;
        this.peso = peso;
    }
    

    public int getNummaxpass() {
        return nummaxpass;
    }

    public void setNummaxpass(int nummaxpass) {
        this.nummaxpass = nummaxpass;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getNquadro() {
        return nquadro;
    }

    public void setNquadro(int nquadro) {
        this.nquadro = nquadro;
    }


    @Override
    public String toString() {
        return "Pesado de Passageiros" + "\n    Matrícula: " + this.getMatricula() + "\n    Marca: " + this.getMarca()
                + "\n    Modelo: " + this.getModelo();
    }
}