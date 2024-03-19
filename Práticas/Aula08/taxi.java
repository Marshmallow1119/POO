package Aula08;

public class taxi extends veiculo {
    private int numerolicenca;

    public taxi(String matricula, String marca, String modelo, int cilindrada, int numerolicenca) {
        super(matricula, marca, modelo, cilindrada);
        this.numerolicenca = numerolicenca;
    }

    public int getNumerolicenca() {
        return numerolicenca;
    }
    public void setNumerolicenca(int numerolicenca) {
        this.numerolicenca = numerolicenca;
    }


    @Override
    public String toString() {
        return "Táxi" + "\n    Matrícula: " + this.getMatricula() + "\n    Marca: " + this.getMarca() + "\n    Modelo: "
                + this.getModelo();
    }
}
