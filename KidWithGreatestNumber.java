import java.util.List;

public class KidWithGreatestNumber {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
           while(true){
            int result;
            for(int i = 0; i<candies.length; i++){
            result = candies[i] +extraCandies;

            int great = result;
            if(candies[i]> result){
                candies[i] = great;   
                     }
            }

            
    }

}
public static void main(String[] args) {
    KidWithGreatestNumber instance = new KidWithGreatestNumber();
    int[] kids = {2, 3, 1, 6, 8};
    int extraCandies = 3;
    System.out.println(instance.kidsWithCandies(kids, extraCandies));
}
}
