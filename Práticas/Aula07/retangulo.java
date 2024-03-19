package Aula07;
import utils.UserInput;

public class retangulo extends forma {
    
    double comprimento;
    double altura;

public retangulo( double comprimento, double altura,String cor) {
    super(cor);
        if(comprimento<1){
            comprimento=UserInput.isPositiveDouble();
        }if(altura<1){
            altura=UserInput.isPositiveDouble();
        }
        this.comprimento = comprimento;
        this.altura = altura;
    }



    public double getComprimento() {
        return comprimento;
    }


    public void setComprimento(double comprimento) {
        if(comprimento<1)
            comprimento=UserInput.isPositiveDouble();
        this.comprimento = comprimento;
    }


    
public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        if(altura<1)
            altura=UserInput.isPositiveDouble();
       this.altura = altura;
    }

    @Override
    public String toString(){
        return "Comprimento "+comprimento+" ,Altura "+altura+" ,Perimetro= "+this.perimetro()+" ,area= "+this.area();
    }



    public double area (){
        double area=0;
        area=comprimento*altura;
        return area;
    }

    public double perimetro(){
        double perimetro;
        perimetro=comprimento*2+altura*2;
        return perimetro;
    }

    public boolean equals(Object r){
        if(r==this)
            return true;
        if(!(r instanceof retangulo))
            return false;
        
        retangulo r2= (retangulo) r; //converter c num circulo
        if((Double.compare(this.comprimento, r2.comprimento)==0) &&(Double.compare(this.altura, r2.altura)==0) && super.equals(r2)){
            return true;
        }
        return false;
    }

}