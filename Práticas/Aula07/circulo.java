package Aula07;
import utils.UserInput;

public class circulo extends forma {
    double raio;
    

    public circulo(double raio,String cor) {
        super(cor);
        if(raio<1)
            raio=UserInput.isPositiveDouble();
        this.raio = raio;
    }


    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        if(raio<1)
            raio=UserInput.isPositiveDouble();
        this.raio=raio;

    }
    @Override
    public String toString(){
        return "Raio= "+this.raio+" ,Perimetro= "+this.perimetro()+" ,area= "+this.area();
    }

    public double area (){
        double area=0;
        area=Math.PI*Math.pow(raio,2);
        return area;
    }

    public double perimetro(){
        double perimetro;
        perimetro=Math.PI*(raio*2);
        return perimetro;
    }


    public boolean equals(Object c){
        if(c==this)
            return true;
        if(!(c instanceof circulo))
            return false;
        
        circulo c2= (circulo) c; //converter c num circulo
        if(Double.compare(this.raio, c2.raio)==0 && super.equals(c2)){
            return true;
        }
        return false;
        
    }

}
