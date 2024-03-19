package Aula11;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GradeBook{
    
    
    ArrayList<Student> alunos=new ArrayList<>();

    public void load(String path) throws Exception{
        Scanner scanner=new Scanner(new FileReader(path));
        
        while(scanner.hasNext()){
            List<Double> notas=new ArrayList<>();
            String line=scanner.nextLine();
            String[] aluno=line.split("\\|");
            String name=aluno[0];
            Double grade1=Double.parseDouble(aluno[1]);
            Double grade2=Double.parseDouble(aluno[2]);
            Double grade3=Double.parseDouble(aluno[3]);
            notas.addAll(List.of(grade1,grade2,grade3));
            Student student =new Student(name,notas);
            alunos.add(student);
            System.out.printf("Aluno: %18s : Notas: %20s\n",name,notas);
        }
    }

    public void removeStudent(String nome){
        for(int i=0; i<alunos.size();i++){
            if(alunos.get(i).getName().equals(nome)){
                alunos.remove(i);
            }
        }
    }

    public void addStudent(Student alunorem){
        if(!alunos.contains(alunorem)){
            alunos.add(alunorem);
        }
        else{
            System.out.println("Aluno já existe");
        }
    }

    public Student getStudent(String nome2){
        for(int i=0; i<alunos.size();i++){
            if(alunos.get(i).getName().equals(nome2)){
                return alunos.get(i);
            }
        }
        System.out.println("Aluno não existe");
        return null;
    }

    public Double calculateAverageGrade(String nome3){
        simplegradecalculator sc= new simplegradecalculator();
        for(int i=0; i<alunos.size();i++){
            if(alunos.get(i).getName().equals(nome3)){
                return sc.calculate(alunos.get(i).getGrades());
            }
        }
        return null;
    }

    public void printAllStudents(){
        for(Student aluno:alunos){
            System.out.printf("%-18s: %-20s %8.2f \n", aluno.getName(), aluno.getGrades(), calculateAverageGrade(aluno.getName()));
        }
    }
}















































