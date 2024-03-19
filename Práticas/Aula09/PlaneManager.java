package Aula09;

import java.util.ArrayList;


public class PlaneManager {
    ArrayList<Plane> planes;
    
    public PlaneManager(){
        this.planes= new ArrayList<Plane>();
    }

    public void addPlane(Plane plane){
        planes.add(plane);
    }
    public void removePlane(String id){
        for(Plane plane : planes){
            if(plane.getId().equals(id)){
                planes.remove(plane);
                return;
            }
        }
    }
    public Plane searchPlane(String id){
        for(Plane plane : planes){
            if(plane.getId().equals(id)){
                return plane;
            }
        }
        return null;
    }
    public void getCommercialPlanes(){
        for(Plane planes: planes){
            if(planes.getTypePlane()==TypePlane.COMMERCIAL){
                System.out.println(planes.toString());
                
            }
        }
        System.out.println(planes.toString());
        

    }
    public void getMilitaryPlanes(){
        for(Plane planes: planes){
            if(planes.getTypePlane()==TypePlane.MILITARY){
                System.out.println(planes.toString());
                
            }
        }
        System.out.println(planes.toString());
    }

    public void printallPlanes(){
        for(Plane plane : planes){
            System.out.println(plane.toString());
        }
    }

    public Plane getFastestPlane(){
        Plane fastest = planes.get(0);
        for(Plane plane : planes){
            if(plane.getVelocmax() > fastest.getVelocmax()){
                fastest = plane;
            }
        }
        return fastest;
    }
}
