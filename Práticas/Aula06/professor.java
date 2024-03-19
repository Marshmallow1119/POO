package Aula06;


import Aula07.ex7_2.DateYMD;

public class professor extends pessoa {
    private String categoria;
    private String departamento;
    
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public professor(String nome, int cc, DateYMD nasc, String categoria,String departamento) {
        super(nome, cc, nasc);
        this.categoria=categoria;
        this.departamento=departamento;
    }
    

    @Override
    public String toString(){
        return "Nome: "+this.getNome()+", Categoria: "+this.categoria+", Departamento: "+this.departamento;
    }

}
