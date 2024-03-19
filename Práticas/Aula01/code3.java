package Aula01;
public class code3 {

    public static void main(String[] args) {
       System.out.printf("%s | %s | %s | %s\n", "n", "Hn", "log n","Hn - log n");
       int n = 1;
       while (n <= 1000000) {
          double f1 = harmonic(n);
          double f2 = Math.log((double)n);
          System.out.printf("%d | %.3f | %.3f | %f\n", n, f1, f2,f1-f2);
          n *= 2;
       }
 
 
    }
 
    /**
     * Computes the Harmonic number Hn = 1 + 1/2 + 1/3 + ... + 1/n.
     */
    public static double  harmonic( int n) {
       double y=1;
       double f1=0;
       while(y<=n){
          f1+=1/y;
          y++;
       
       }
       return f1;
    }
 
 }
 