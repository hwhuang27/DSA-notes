package Sorting_Questions;


public class Sol41 {
    public static void main(String[] args) {
        int[] arr = {2,1};
        int ans = firstMissingPositive(arr);
        System.out.println(ans);
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        int len = nums.length;
        while(i < len){
            if(nums[i] > 0 && nums[i] < len){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums, i, correct);
                }
                else{
                    i++;
                }
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < len; j++) {
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return len+1;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
