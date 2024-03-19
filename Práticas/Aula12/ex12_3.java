package Aula12;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;


public class ex12_3 {
    
    public static void load(String path){
        
        try{
            ArrayList<movie> movieArray=new ArrayList<>();
            TreeMap<String, List<Object>> movies = new TreeMap<>();
            List<Object> arra = new ArrayList<>();
            Scanner scanner=new Scanner(new FileReader(path));
            scanner.nextLine();
            while(scanner.hasNext()){
                String[] line=scanner.nextLine().split("\t");
                String nome=line[0];
                double score=Double.parseDouble(line[1]);
                String rating=line[2];
                String genre=line[3];
                int runningTime=Integer.parseInt(line[4]);
                arra.addAll(List.of(score,rating,genre,runningTime));

                movie m =new movie(nome,score,rating,genre,runningTime);
                movieArray.add(m);
                System.out.println(m.toString());

                movies.put(nome,arra);

            }
            

            
            System.out.println("Valores ordenados por score:\n");
            Collections.sort(movieArray, new Comparator<movie>() {
                @Override
                public int compare(movie m1, movie m2){
                    return (int)(m1.getScore()-m2.getScore());
                }
            });
            for(movie m: movieArray){
                System.out.println(m);
            }
        
                
            

            System.out.println("Valores ordenados por running time:\n");
            Collections.sort(movieArray, new Comparator<movie>() {
                @Override
                public int compare(movie m1, movie m2){
                    return (int)(m1.getRunningTime()-m2.getRunningTime());
                }
            });
            for(movie m: movieArray){
                System.out.println(m);
            }
            

            
            System.out.println("Géneros distintos existentes (genre) e o número de filmes desse género\n");
            ArrayList<String> generos= new ArrayList<>();
            int count=0;
            for(movie filme:movieArray){
                if(!generos.contains(filme.getGenre())){
                    generos.add(filme.getGenre());
                    count++;
                }else{
                    count++;
                }
            }
            for(String f:generos){
                System.out.println(f);
            }

            System.out.printf("Número de filmes com esse género: %2d\n",count);


            scanner.close();

            Scanner scanner2=new Scanner(System.in);
            PrintWriter out = new PrintWriter(new File("scoreorder.txt"));
            System.out.println("Qual é o género que queres por ordem de score?");
            String genre=scanner2.next();
            for(movie filme2:movieArray){
                if(filme2.getScore()>60 && filme2.getGenre().equals(genre)){
                    out.printf("Nome do filme: %10s,score: %10s,Rating: %10s,Genre: %10s,RunningTime: %10s \n",filme2.getName(),filme2.getScore(),filme2.getRating(),filme2.getGenre(),filme2.getRunningTime());
                }
            }
            out.close();
            scanner2.close();
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }



    public static void main(String[] args) throws Exception {
        load("movies.txt");
    }
}

