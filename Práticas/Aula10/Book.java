package Aula10;

import Aula05.ex1.DateYMD;

public class Book{
    private String titulo;
    private String autor;
    private DateYMD data;


    public Book(String titulo, String autor, DateYMD data) {
        this.titulo = titulo;
        this.autor = autor;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public DateYMD getData() {
        return data;
    }
    public void setData(DateYMD data) {
        this.data = data;
    }


    @Override
    public String toString(){
        return "Titulo: " + this.titulo + ";\n Autor: " + this.autor + ";\n Data de lançamento: " + this.data;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime*result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime*result + ((autor == null) ? 0 : autor.hashCode());
        result = prime*result + ((data == null) ? 0 : data.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;

        Book other = (Book) obj;
        if(titulo == null){
            if(other.titulo != null)
                return false;
        }else if(!titulo.equals(other.titulo))
            return false;
        if(autor == null){
            if(other.autor != null)
                return false;
        }else if(!autor.equals(other.autor))
            return false;
        if(data == null){
            if(other.data != null)
                return false;
        }else if(!data.equals(other.data))
            return false;
        return true;
    }

}
