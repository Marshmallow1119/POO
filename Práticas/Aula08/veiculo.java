package Aula08;


public class veiculo implements kmPercorridos {	
    private String matricula;
    private String marca;
    private String modelo;
    private int cilindrada;
    private int kilototais=0;
    private int kilometrosatuais=0;
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public veiculo(String matricula, String marca, String modelo, int cilindrada) {
        if(vlidarmatricula(matricula)){
            this.matricula = matricula;
        }
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public int getKilototais() {
        return kilototais;
    }
    public void setKilototais(int kilototais) {
        this.kilototais = kilototais;
    }



 public boolean vlidarmatricula(String matricula) {
        if (matricula.length() != 8) {
            System.out.println("Matricula inválida");
            return false;
        } else if(matricula.charAt(2)!='-' || matricula.charAt(5)!='-'){
            System.out.println("Matricula inválida");
            return false;
        }else{
            return true;
        }
    }






    @Override
    public void trajeto(int km) {
        kilometrosatuais=km;
        kilototais+= km;
    }
    @Override
    public int ultimotrageto() {
        return kilometrosatuais;
    }
    @Override
    public int distanciatotal() {
        return kilototais;
    }
}
