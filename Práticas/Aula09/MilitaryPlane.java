package Aula09;


public class MilitaryPlane extends Plane {
    private int numMissiles;

    public int getNumMissiles() {
        return numMissiles;
    }
    public void setNumMissiles(int numMissiles) {
        this.numMissiles = numMissiles;
    }

    public MilitaryPlane(String id, String manufacturer, String model, int year, int maxPassengers, double maxSpeed, int numMissiles) {
        super(id, manufacturer, model, year, maxPassengers, numMissiles);
        this.numMissiles=numMissiles;
    }

    @Override
    public String toString() {
        return "MilitaryPlane: " +
                "numMissiles=" + this.getNumMissiles() +
                ", id='" + this.getId()+ '\'' +
                ", fabricante='" + this.getFabricante() + '\'' +
                ", modelo='" + this.getModelo() + '\'' +
                ", anoprod=" + this.getAnoprod() +
                ", numeromaxpass=" + this.getNumeromaxpass() +
                ", velocmax=" + this.getVelocmax();
    }
    
    
}