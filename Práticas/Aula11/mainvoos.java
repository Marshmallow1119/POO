package Aula11;

public class mainvoos {
    public static void main(String[] args) {
        Voo voo = new Voo();
        try{
            voo.load();
        }catch(Exception e){
            System.out.println(e);
        }
   
}
}
