class MostWater {
    public int maxArea(int [] height){
        int maxArea = 0;
        int pointer1 = 0;
        int pointer2 = height.length -1;

        while(pointer1 < pointer2){
            int area = Math.min(height[pointer1], height[pointer2]) * (pointer2 - pointer1);
            maxArea = Math.max(maxArea, area);
            

            if(height[pointer1] < height[pointer2]){
                pointer1 ++ ;
            }else{
                pointer2 --;
            }
        }

    return maxArea;
}

public static void main(String[] args) {
    MostWater cont = new MostWater();
    int []container = {2, 7, 3, 2, 3, 7};

    System.out.println(cont.maxArea(container));
}
}
