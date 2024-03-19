package Aula11;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnergyUsageReport{
    
    
    ArrayList<Customer> clientes=new ArrayList<>();

    public void load(String path) throws Exception{
        Scanner scanner=new Scanner(new FileReader(path));
        
        while(scanner.hasNext()){
            List<Double> leituras=new ArrayList<>();
            String line=scanner.nextLine();
            String[] cliente=line.split("\\|");
            Integer idString=Integer.parseInt(cliente[0]);
            Double leituras0=Double.parseDouble(cliente[1]);
            Double leituras1=Double.parseDouble(cliente[2]);
            Double leituras2=Double.parseDouble(cliente[3]);
            Double leituras3=Double.parseDouble(cliente[4]);
            leituras.addAll(List.of(leituras0,leituras1,leituras2,leituras3));
            Customer clienCustomer =new Customer(idString,leituras);
            clientes.add(clienCustomer);
            System.out.printf("ID: %6s : Leituras: %10s\n",idString,leituras);
        }
    }

    public void removeCustomer(Integer CustomerID){
        for(int i=0; i<clientes.size();i++){
            if(clientes.get(i).getCustomerId()==CustomerID){ 
                clientes.remove(i);
            }
        }
    }

    public void addCustomer(Customer custodd){
        if(!clientes.contains(custodd)){
            clientes.add(custodd);
        }
        else{
            System.out.println("Customer já existe");
        }
    }

    public Customer getCustomer(Integer customerid){
        for(int i=0; i<clientes.size();i++){
            if(clientes.get(i).getCustomerId()==customerid){
                return clientes.get(i);
            }
        }
        System.out.println("Aluno não existe");
        return null;
    }

    public Double calculateTotalUsage(Integer customerid){
        double totalgast=0;
        for(int i=0; i<clientes.size();i++){
            if(clientes.get(i).getCustomerId()==customerid){
                for(int j=0;j<clientes.get(i).getMeterReadings().size();j++){
                    totalgast+=clientes.get(i).getMeterReadings().get(j);
                }
                return totalgast;
            }
        }
        return null;
    }

    public void generateReport(String path) throws IOException{
        PrintWriter out = new PrintWriter(new File(path));
        for(Customer client:clientes){
            out.printf("Id do cliente: %10s,Energia consumida: %10s \n",client.getCustomerId(),calculateTotalUsage(client.getCustomerId()));
        }
        out.close();
        

    }
}












