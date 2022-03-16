import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MaxVal {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100));
        }
        System.out.println("lista original: "+ numbers);
        long start = System.currentTimeMillis();
        System.out.println("\n"+maiorValor(numbers, numbers.size()));
        long time = System.currentTimeMillis() - start;
        System.out.println("Tempo gasto: " + time);      
    }
    
    public static int maiorValor(List<Integer>a, int n){
        int max = a.get(0);
        for (int i = 1; i < n; i++) {
           if( a.get(i) > max ) 
            max = a.get(i);
        }
        return max;
    }
}