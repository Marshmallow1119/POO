package Av1;
public class Boxer extends Fighter {
    int range; //alcance do lutador
    int damage;
    int velocidade;

public Boxer(String nome) {
        super(nome);
        this.nome=nome;
        this.range=(int)(Math.random()*10+1);
        this.velocidade=(int)(Math.random()*10+1);
    }



    public int getRange() {
        return range;
    }
    public void setRange(int range) {
        this.range = range;
    }

    

    public void attack(Fighter fighter){ //random number 
            distance=(int)(Math.random()*10+1);
            if(distance>this.range){
                damage=(int)(Math.random()*10+1);
                this.setVida(this.vida-damage);
            }else{
                System.out.println("O lutador não consgue alcançar o adversário");
            }
        }

    
    

    
}
