package Aula08;

public class automoveleletrico extends veiculo implements veiculoeletrico{

    public automoveleletrico(String matricula, String marca, String modelo, int cilindrada, int i, int j) {
        super(matricula, marca, modelo, cilindrada);
    }
    
    @Override
    public int autonomia() {
        int autonomia=(int)(Math.random()*100+1);
        return autonomia;
    }

    @Override
    public void carregar(int percentagem) {
        if(percentagem>100){
            System.out.println("Não é possível carregar mais do que 100%!");
        }
        else{
            System.out.println("Carregou "+ (100-percentagem) +"%!");
        }
    }
    
}
