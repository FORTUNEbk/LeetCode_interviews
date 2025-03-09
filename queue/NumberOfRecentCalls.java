import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> requests;
    
    public RecentCounter() {
        requests = new LinkedList<>();
    }
    
    public int ping(int t) {
        requests.offer(t);
        while (requests.peek() < t - 3000) {
            requests.poll();
        }
        return requests.size();
    }
}

public class NumberOfRecentCalls {
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(1));
        System.out.println(recentCounter.ping(100));
        System.out.println(recentCounter.ping(3001));
        System.out.println(recentCounter.ping(3002));
    }
}
