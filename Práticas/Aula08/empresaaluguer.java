package Aula08;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class empresaaluguer {
    private String nome;
    private String codigopostal;
    private String email; 
    private List<veiculo> veiculos = new ArrayList<>();
    
    public String getEmail() {
        return email;
    }
    public List<veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public empresaaluguer(String nome, String codigopostal, String email) {
        if(validaremail(email)){
            this.email = email;
        }       
        this.nome = nome;
        this.codigopostal = codigopostal;
        this.email = email;
    }

    public void addVeiculo(veiculo veiculo){
        veiculos.add(veiculo);
    }

    public void removeVeiculo(veiculo veiculo){
        veiculos.remove(veiculo);
    }

    public void listVeiculos(){
        for (veiculo veiculo : veiculos) {
            System.out.println(veiculo);
        }
    }

    public List<veiculo> getVeiculosList() {
        return veiculos;
    }

    @Override
    public String toString() {
        return "empresaaluguer [codigopostal=" + codigopostal + ", email=" + email + ", nome=" + nome + ", veiculos="
                + veiculos + "]";
    }

    public static boolean validaremail(String email){
        String regex="^\\w+@\\w+\\.\\w+$";
        if(Pattern.matches(regex, email)){
            return true;
        }else{
            return false;
        }
    }
}
