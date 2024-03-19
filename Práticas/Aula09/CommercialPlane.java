package Aula09;

public class CommercialPlane extends Plane {
    private int numOfCrewMembers;

    public int getNumOfCrewMembers() {
        return numOfCrewMembers;
    }
    public void setNumOfCrewMembers(int numOfCrewMembers) {
        this.numOfCrewMembers = numOfCrewMembers;
    }

    public CommercialPlane(String id, String manufacturer, String model, int year, int maxNumOfPassengers, double maxSpeed, int numOfCrewMembers) {
        super(id, manufacturer, model, year, maxNumOfPassengers, numOfCrewMembers);
        this.numOfCrewMembers=numOfCrewMembers;
    }

    @Override
    public String toString() {
        return "CommercialPlane: " +
                "numOfCrewMembers=" + numOfCrewMembers +
                ", id='" + this.getId()+ '\'' +
                ", fabricante='" + this.getFabricante() + '\'' +
                ", modelo='" + this.getModelo() + '\'' +
                ", anoprod=" + this.getAnoprod() +
                ", numeromaxpass=" + this.getNumeromaxpass() +
                ", velocmax=" + this.getVelocmax();
    }

        public TypePlane getPlaneType(){
            return TypePlane.COMMERCIAL;
        }
    
}
