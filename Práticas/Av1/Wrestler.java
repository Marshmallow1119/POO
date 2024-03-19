package Av1;

public class Wrestler extends Fighter {
    int velocidade,distance,damage;
    
    public Wrestler(String nome) {
        super(nome);
        this.velocidade=(int)(Math.random()*10+1);
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(int velocidade){
        this.velocidade=velocidade;
    }


    public void attack(Fighter fighter){
        distance=(int)(Math.random()*10+1);
        if(this.velocidade>distance){
            damage=(int)(Math.random()*100+1);
            fighter.setVida(fighter.vida-damage);
        }
    }

}
