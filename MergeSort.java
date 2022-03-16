import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            //numbers.add(Math.random());
            numbers.add(rand.nextInt(100));
        }
        System.out.println("lista original: "+ numbers);
        int count = 0;
        long start = System.currentTimeMillis();
        System.out.println("\n"+mergeSort(numbers, count));
        long time = System.currentTimeMillis() - start;
        System.out.println("Tempo gasto: " + time);      
    }

    public static List<Integer> mergeSort(List<Integer> sortedList, int count) {
        count++;    
        if (sortedList.size()==1) {
            System.out.println(count);
            return sortedList;       
        }
       
       int halfSize = sortedList.size()/2; 
       List<Integer> a = sortedList.subList(0,halfSize);
       List<Integer> b = sortedList.subList(halfSize,sortedList.size());
       a = mergeSort(a,count);
       b = mergeSort(b,count);
       sortedList = merge(a,b);
       return sortedList;  
    }

    public static List<Integer> merge(List<Integer> a, List<Integer> b){
        ArrayList<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        for (int counter = 0; counter <(a.size()*2); counter++) {
            if (j>=b.size()) {
                merged.add(a.get(i));
                i++;
            }
            else if (i>=a.size()) {
                merged.add(b.get(j));
                j++;
            }
            else if (a.get(i)<= b.get(j)) {
                merged.add(a.get(i));
                i++;
            }
            else{//a.get(i)> b.get(j)
                merged.add(b.get(j));
                j++;
            }
        }
        return merged;
    }
    
    /*public static int maiorValor(List<Integer>a, int n){
        int max = a.get(0);
        for (int i = 1; i < n; i++) {
           if( a.get(i) > max ) 
            max = a.get(i);
        }
        return max;
    }*/
}