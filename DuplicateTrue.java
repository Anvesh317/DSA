import java.util.*;
public class DuplicateTrue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(hs.contains(arr[i])){
                System.out.println("True");
                return;
            }
            else{
                hs.add(arr[i]);
            }
        }
        System.out.println("False");        
    }
}
