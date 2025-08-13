import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] Solve(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val = target - arr[i];
            if (map.containsKey(val)) {
                return new int[] { map.get(val), i };
            }
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }
    public static void main(String[] args) {
        int[] arr = {2, 72, 7, 15};
        int target = 9;
        int[] res = Solve(arr, target);
        System.out.println(Arrays.toString(res));
    }
}