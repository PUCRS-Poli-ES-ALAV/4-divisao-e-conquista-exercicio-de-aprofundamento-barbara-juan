import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 32; i++) {
            numbers.add((int)Math.random());
        }
        long start = System.currentTimeMillis();
        mergeSort(numbers);
        long time = System.currentTimeMillis() - start;
        System.out.println("Tempo gasto: " + time);

    }

   public static List<Integer> mergeSort(List<Integer> sortedList) {
       if (sortedList.size()==1) {
           return sortedList;
       }
       int halfSize = sortedList.size()/2; 
       List<Integer> a = sortedList.subList(0,halfSize);
       List<Integer> b = sortedList.subList(halfSize,sortedList.size());
       a = mergeSort(a);
       b = mergeSort(b);
       sortedList = merge(a,b); 
       return sortedList;  
    }

    public static List<Integer> merge(List<Integer> a, List<Integer> b){
        ArrayList<Integer> merged = new ArrayList<>();
        int i = 0;
        int j = 0;
        for (int counter = 0; counter <(a.size()*2); counter++) {
            if (j>=b.size()) {
                merged.add(a);
            }
            else if (condition) {
                
            }
            if (a.get(i)<= b.get(j)) {
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
    
}