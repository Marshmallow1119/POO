package Aula08;

public class motociclo extends veiculo {
    private String tipo;

public motociclo(String matricula, String marca, String modelo, int cilindrada, String tipo) {
        super(matricula, marca, modelo, cilindrada);
        this.tipo = tipo;
    }

public String getTipo(){
        return tipo;
    }
public void setTipo(String tipo){
        this.tipo = tipo;
    }

@Override
public String toString() {
    return "Motociclo" + "\n    Matrícula: " + this.getMatricula() + "\n    Marca: " + this.getMarca()
    + "\n    Modelo: " + this.getModelo();
    }

}
