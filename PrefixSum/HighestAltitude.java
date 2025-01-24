public class HighestAltitude{
    public int largestAltitude(int []gain){
      int altitude = 0;
      int maxAltitude = 0;
      for(int i = altitude; i < gain.length; i++){
        altitude += gain[i];
        maxAltitude = Math.max(maxAltitude, altitude);
      }
        return maxAltitude;
    }
    public static void main(String[] args) {
        HighestAltitude myMethod = new HighestAltitude();
        int []gain = {-5,1,5,0,-7};

        System.out.println(myMethod.largestAltitude(gain));
    }
}