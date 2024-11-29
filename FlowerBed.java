public class FlowerBed {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0; 

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) && 
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) { 
                
                flowerbed[i] = 1; 
                count++; 

                if (count >= n) {
                    return true;
                }
            }
        }

        return count >= n;
    }
    public static void main(String[] args) {
        FlowerBed newFlowerBed = new FlowerBed();
        int [] flower ={1,0,0,0,1};
        int n = 3;
        boolean answer = newFlowerBed.canPlaceFlowers(flower, n);
        System.out.println(answer);
        
    }
}
