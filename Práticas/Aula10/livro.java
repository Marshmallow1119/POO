package Aula10;

public class livro {
    private Book book;
    private generos genre;
    private int id;
    public static int counter = 0;

    public livro(Book book, generos genre) {
        this.book = book;
        this.genre = genre;
        this.id = counter++;
    }

   public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }

    public generos getGenre() {
        return genre;
    }
    public void setGenre(generos genre) {
        this.genre = genre;
    }

    @Override
    public String toString(){
        return "Genre: " + this.genre + "\nBook: " + this.book;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((book == null) ? 0 : book.hashCode());
        result = prime * result + ((genre == null) ? 0 : genre.hashCode());
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
        livro other = (livro) obj;
        if(book == null){
            if(other.book != null)
                return false;
        }else if(!book.equals(other.book))
            return false;
        if(genre != other.genre)
            return false;
        return true;
    }
    
}
