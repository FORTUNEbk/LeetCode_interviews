import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOccurence {
    public boolean uniqueOccurrences(int[] arr) {


        HashMap<Integer, Integer> occurence = new HashMap<>();
        for(int num:arr){
            occurence.put(num, occurence.getOrDefault( num, 0) + 1);
        }

        HashSet <Integer>  occurrenceSet = new HashSet<>();
        for(int count: occurence.values()){
            if(!occurrenceSet.add(count)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        UniqueNumberOccurence myMethod = new UniqueNumberOccurence();
        int []arr = {1,2,2,1,1,3};

        System.out.println(myMethod.uniqueOccurrences(arr));
    }
}
