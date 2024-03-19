package Aula04;
import utils.UserInput;

public class triangulo {
    public static int length;
    double lado1,lado2,lado3;


    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        if(lado1<1)
            lado1=UserInput.isPositiveDouble();
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        if(lado2<1)
            lado2=UserInput.isPositiveDouble();
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        if(lado3<1)
            lado3=UserInput.isPositiveDouble();
        this.lado3 = lado3;
    }

    public triangulo(double lado1, double lado2, double lado3) {
        if(lado1<1){
            lado1=UserInput.isPositiveDouble();
        }if(lado2<1){
            lado2=UserInput.isPositiveDouble();
        }if(lado3<1){
            lado3=UserInput.isPositiveDouble();
        }
        while((lado1+lado2<lado3) ||(lado2+lado3<lado1) || (lado1+lado3<lado2)){
            lado1=UserInput.isPositiveDouble();
            lado2=UserInput.isPositiveDouble();
            lado3=UserInput.isPositiveDouble();
        };
        this.lado1 = lado1;            
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public String toString(){
        return "Lado1= "+lado1+" ,lado2= "+lado2+" ,lado3= "+lado3+" ,Perimetro= "+this.perimetro()+" ,area= "+this.area();
    }
    
    public double area (){
        double area=0;
        double S=0;
        S=(lado1+lado2+lado3)/2;
        area=Math.sqrt(S*(S-lado1)*(S-lado2)*(S-lado3));
        return area;
    }

    public double perimetro(){
        double perimetro;
        perimetro=lado1+lado2+lado3;
        return perimetro;
    }
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (!(obj instanceof triangulo))
            return false;
        triangulo t1 = (triangulo) obj;
        return (Double.compare(this.lado1, t1.lado1)==0 && Double.compare(this.lado2, t1.lado2)==0 && Double.compare(this.lado3, t1.lado3)==0);
        }
        
    
    }

