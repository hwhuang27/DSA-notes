package searching.questions;

import java.util.HashMap;

public class Sol1346 {
    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
        boolean ans = checkIfExist(arr);
        System.out.println(ans);

    }

    public static boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(ans.containsValue(arr[i]*2) || (ans.containsValue(arr[i]/2) && arr[i]%2 == 0)){
                return true;
            }
            ans.put(i, arr[i]);
        }
        return false;
    }
}
