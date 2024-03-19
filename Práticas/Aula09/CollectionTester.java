package Aula09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;



public class CollectionTester {
    
    public static void main(String[] args) {
        int[] DIM = {1000, 5000, 10000, 20000, 40000,100000};
        Collection<Integer>[] col = new Collection[4];
        col[0]= new ArrayList<>();
        col[1]= new LinkedList<>();
        col[2]= new HashSet<>();
        col[3]= new TreeSet<>();

        System.out.print("Collection");
        for (int i = 0; i < DIM.length; i++) {
            String s = String.format("%7d", DIM[i]);
            System.out.print("\t"+ s);
        }

        for (int j = 0; j < col.length; j++) {
            System.out.print("\n " +col[j].getClass().getSimpleName() + " \n");
            
            String metadd = String.format("%-12s", "add") + "\t";
            String metsearch = String.format("%-12s", "search")+ "\t";
            String metremove = String.format("%-12s", "remove")+ "\t";
            for (int i = 0; i < DIM.length; i++) {
                double[] result = checkPerformance(col[j], DIM[i]);
                metadd += String.format("%7.1f", result[0]) + "\t";
                metsearch += String.format("%7.1f", result[1]) + "\t";
                metremove+= String.format("%7.1f", result[2]) + "\t";
            }
            metadd += "\n";
            metsearch += "\n";
            metremove += "\n";
            System.out.print(metadd);
            System.out.print(metsearch);
            System.out.print(metremove);
            }
    }


    private static double[] checkPerformance(Collection<Integer> col, int dIM) {
        double start, stop, delta,alpha=0,beta;
        // Add
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<dIM; i++ ){
            col.add( i );
        stop = System.nanoTime(); // clock snapshot after
        alpha = (stop-start)/1e6; // convert to milliseconds
        }

        // Search
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<dIM; i++ ) {
            int n = (int) (Math.random()*dIM);
            col.contains(n);
        }
        stop = System.nanoTime(); // clock snapshot after
        beta = (stop-start)/1e6; // convert nanoseconds to milliseconds
        // Remove
        start = System.nanoTime(); // clock snapshot before
        Iterator<Integer> iterator = col.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert nanoseconds to milliseconds

        return new double[] {alpha, beta, delta};
    }
}