package Aula09;

public class Plane{
    private String id;
    private String fabricante;
    private String modelo;
    private int anoprod;
    private int numeromaxpass;
    private int velocmax;


    public Plane(String id, String fabricante, String modelo, int anoprod, int numeromaxpass, int velocmax) {
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anoprod = anoprod;
        this.numeromaxpass = numeromaxpass;
        this.velocmax = velocmax;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoprod() {
        return anoprod;
    }
    public void setAnoprod(int anoprod) {
        this.anoprod = anoprod;
    }

    public int getNumeromaxpass() {
        return numeromaxpass;
    }
    public void setNumeromaxpass(int numeromaxpass){
        this.numeromaxpass = numeromaxpass;
    }

    public int getVelocmax() {
        return velocmax;
    }
    public void setVelocmax(int velocmax) {
        this.velocmax = velocmax;
    }

    public TypePlane getTypePlane() {
        return TypePlane.NORMAL;
    }


    @Override
    public String toString() {
        return "Plane: " + "id=" + id + ", fabricante=" + fabricante + ", modelo=" + modelo + ", anoprod=" + anoprod + ", numeromaxpass=" + numeromaxpass + ", velocmax=" + velocmax;
    }


}
