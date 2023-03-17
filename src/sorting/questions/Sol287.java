package sorting.questions;

class Sol287 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int ans = findDuplicate(arr);
        System.out.println(ans);

    }
    public static int findDuplicate(int[] nums) {
        int i = 0;
        int len = nums.length;
        while(i < len){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        for(int j = 0; j < len; j++){
            if(nums[j] != j+1){
                return nums[j];
            }
        }
        return -1;
    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}