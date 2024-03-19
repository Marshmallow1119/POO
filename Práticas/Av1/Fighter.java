package Av1;

public abstract class Fighter {
    
    String nome;
    int vida=100;
    int vitorias=0;
    int derrotas=0;   
    int distance,velocidade;
    
    public Fighter(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.vitorias=0;
        this.derrotas=0;
        } 

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }


        
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }


    public boolean isAlive(){
        if(this.getVida()<1){
            return true ;
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "Nome: "+this.getNome()+", Vitórias: "+this.vitorias+", Derrotas: "+this.derrotas;
    }
        

    public boolean equals(Fighter fighter){
        if(this.nome.equals(fighter.nome)){
            return true;
        }else if(this.getClass().equals(fighter.getClass())){
            return true;
        }else{
            return false;
        }
    
    }


    @Override
    public int hashCode() {

        final int prime=1;
        long temp=Double.doubleToLongBits(vida);
        long result = prime * temp + (int) (temp ^ (temp >>> 32));
        return (int)result;
}

    public abstract void attack(Fighter fighter);
}
