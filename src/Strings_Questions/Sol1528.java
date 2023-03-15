package Strings_Questions;

public class Sol1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String ans = restoreString(s, indices);
        System.out.println(ans);

    }
    public static String restoreString(String s, int[] indices) {
        char[] arr = s.toCharArray();
        boolean swapped;
        for (int i = 0; i < indices.length; i++) {
            swapped = false;
            for (int j = 1; j < indices.length-i; j++) {
                if(indices[j] < indices[j-1]){
                    int temp = indices[j-1];
                    indices[j-1] = indices[j];
                    indices[j] = temp;

                    char temp2 = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp2;
                    swapped = true;
                }
            }
            if(!swapped){
                return new String(arr);
            }
        }
        return new String(arr);
    }

}
