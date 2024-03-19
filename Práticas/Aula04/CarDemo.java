
package Aula04;

import java.util.Scanner;
import java.util.regex.Pattern;

class Car {
    public String make;
    public String model;
    public int year;
    public int kms;

    public Car(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public void drive(int distance) { //acumular distância percorrida
        this.kms+=distance;
    }

}

public class CarDemo {

    static Scanner sc = new Scanner(System.in);

    static int registerCars(Car[] cars) {
        // pede dados dos carros ao utilizador e acrescenta ao vetor
        // registo de carros termina quando o utilizador inserir uma linha vazia 
        // devolve número de carros registados
        int carrosr=0; //contar o numero de  carros registados
        String regex = "^\\w+ [\\w ]+ \\d{4} \\d+$"; //uma palavra; duas palavras {1,0} duas palavras ou mais;
        //[12][0-9]{3} significa que comeca 
    do{
        System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
        String dados=sc.nextLine(); //next lê até ser encontrado um espaço; nextLine lê linha;
        if((dados.isEmpty()) || (carrosr==10)) //Verifica se está vazio (isEmpty)
            return carrosr;
        if(Pattern.matches(regex,dados)){
            String[] MMAQ=dados.split(" ");
            String Marca=MMAQ[0];
            int year=Integer.parseInt(MMAQ[MMAQ.length-2]);
            int quilómetros=Integer.parseInt(MMAQ[MMAQ.length-1]);
            String Modelo="";
            for(int i=1;i<MMAQ.length-1;i++){
                Modelo+=MMAQ[i];
                if (i<MMAQ.length-3) {
                    Modelo+=" ";
                }
            }
            cars[carrosr] = new Car(Marca, Modelo, year, quilómetros);
            carrosr++;


        }else{
            System.out.println("Dados inválidos.Introduza novamente os dados dos carros");

        }
    }while(carrosr<10);
    return carrosr;
        
   }

    static void registerTrips(Car[] cars, int numCars) {
        // pede dados das viagens ao utilizador e atualiza informação do carro
        // registo de viagens termina quando o utilizador inserir uma linha vazia 
        int carro, distancia;
        String cdistancia;
        do{
            System.out.print("Registe uma viagem no formato \"carro:distância\": ");
            cdistancia = sc.nextLine();
            String[] sep =cdistancia.split(":");
            carro=Integer.parseInt(sep[0]);
            distancia=Integer.parseInt(sep[1]);
            cars[carro].drive(distancia);
            System.out.print("Registe uma viagem no formato \"carro:distância\": ");
            cdistancia= sc.nextLine();
        }while(!(cdistancia.isEmpty()));
    }


    static void listCars(Car[] cars) {
        System.out.println("\nCarros registados: ");
        // lista todos os carros registados
        // Exemplo de resultado
        // Carros registados: 
        // Toyota Camry, 2010, kms: 234346
        // Renault Megane Sport Tourer, 2015, kms: 32536
        
        for(int i=0; i<cars.length; i++){
            if(cars[i]!=null){
                System.out.println(cars[i].make+" "+cars[i].model+", "+cars[i].year+", kms: "+cars[i].kms);
            }
        }
        
        System.out.println("\n");
    }

    public static void main(String[] args) {

        Car[] cars = new Car[10];

        int numCars = registerCars(cars);

        if (numCars>0) {
            listCars(cars);
            registerTrips(cars, numCars);
            listCars(cars);
        }

        sc.close();

    }
}