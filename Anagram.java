import java.util.*;

public class Anagram {

    public static boolean CheckAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for(int val : arr){
            if(val != 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String ans = (CheckAnagram(s,t))?"True":"False";
        System.out.println(ans);
        sc.close();
    }
}
