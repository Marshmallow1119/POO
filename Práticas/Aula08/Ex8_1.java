package Aula08;

import java.util.ArrayList;
import java.util.Collections;

public class Ex8_1 {
    public static void main(String args[]){
        int max=0;
        empresaaluguer empresa = new empresaaluguer("Automóveis Silva","3050-314","empresasilva@gmail.com");
        motociclo m1 = new motociclo("12-34-AB","Honda","CBR 600",100,"Deportiva");
        Automovel a1= new Automovel("AB-54-RT","Nissan","Hybrid",200,123456,5);
        taxi t1= new taxi("TT-55-YY", "Peugeot", "208", 150, 987621);
        pesadoMercadorias p1= new pesadoMercadorias("AB-12-CD", "Mercedes", "Actros", 201, 123456, 10000);
        pesadoPassageiros p2= new pesadoPassageiros("AB-45-33", "Audi", "Actros", 220, 145789, 1000);
        empresa.addVeiculo(m1);
        empresa.addVeiculo(a1);
        empresa.addVeiculo(t1);
        empresa.addVeiculo(p1);
        empresa.addVeiculo(p2); 
        empresa.listVeiculos();


        m1.trajeto(3000);
        a1.trajeto(1000);
        t1.trajeto(500);
        p1.trajeto(10000);
        p2.trajeto(7000);

        for (veiculo veiculo : empresa.getVeiculosList()) {
            System.out.println(veiculo);
            System.out.println();
        }
        for (veiculo veiculo : empresa.getVeiculosList()) {
            if (veiculo.getKilototais() > max) {
                max = veiculo.getKilototais();
            }
        }
        for (veiculo veiculo : empresa.getVeiculosList()) {
            if (veiculo.getKilototais() == max) {
                System.out.println("Veículo com mais km percorridos: " + veiculo.getKilototais()+ " km");
                System.out.println(veiculo);
            }
        }

        automoveleletrico a2= new automoveleletrico("BB-44-TT","Renault","Hybrid",222,999999,5);
        empresa.addVeiculo(a2);
        pessadopassageiroseletrico p3= new pessadopassageiroseletrico("CC-55-YY", "BMW", "Actros", 333, 123456, 1000);
        empresa.addVeiculo(p3);
        a2.carregar(70);
        System.out.println(a2.autonomia()+"% de autonomia");

        ArrayList<Integer> potencias=new ArrayList<>();
        for(int i=0;i<empresa.getVeiculosList().size();i++){
            potencias.add(empresa.getVeiculosList().get(i).getCilindrada());
        }

        Collections.sort(potencias);
        System.out.println(potencias);
        int potenciamax=potencias.get(potencias.size()-1);
        System.out.println("Potência máxima: "+potenciamax);
        System.out.println("Veículos ordenados por potência: ");
        for(int i=0;i<potencias.size();i++){
            if(potencias.get(i)!=null){
                System.out.println(potencias.get(i));
            }
        }
    }
        
    }

