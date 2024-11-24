
public class GreatestCommonDivisor {
    public static String gcdOfStrings(String str1, String str2) {
        int gcdLength = gcd(str1.length(), str2.length());
        
        String candidate = str1.substring(0, gcdLength);
        
        if (isDivisible(str1, candidate) && isDivisible(str2, candidate)) {
            return candidate;
        }
        return "";
    }
    
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    
    private static boolean isDivisible(String str, String candidate) {
        int lenStr = str.length();
        int lenCandidate = candidate.length();
        
        if (lenStr % lenCandidate != 0) {
            return false;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lenStr / lenCandidate; i++) {
            sb.append(candidate);
        }
        return sb.toString().equals(str);
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC")); 
        System.out.println(gcdOfStrings("ABABAB", "ABAB")); 
        System.out.println(gcdOfStrings("LEET", "CODE"));   
    }
}
