import java.util.ArrayList;
import java.util.List;

public class KidWithGreatestNumber {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int maxCandies = 0;
         for(int candy: candies){
            maxCandies = Math.max(maxCandies, candy);
         }
         List <Boolean> result = new ArrayList<>();

         for(int candy: candies){
            result.add(extraCandies+ candy >= maxCandies);
         }

         return result;

}
public static void main(String[] args) {
    KidWithGreatestNumber instance = new KidWithGreatestNumber();
    int[] kids = {2, 3, 1, 6, 8};
    int extraCandies = 3;
    System.out.println(instance.kidsWithCandies(kids, extraCandies));
}
}
