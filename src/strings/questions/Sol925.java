package strings.questions;

public class Sol925 {
    public static void main(String[] args) {
        String name = "alex";
        String typed = "aaleexa";
        String name2 = "saeed";
        String typed2 = "ssaaedd";
        System.out.println(isLongPressedName(name, typed));
        System.out.println(isLongPressedName(name2, typed));

    }
    public static boolean isLongPressedName(String name, String typed) {
        int namelen = name.length();
        int typelen = typed.length();
        int p1 = 0;
        int p2 = 0;
        // case 1 & 2
        if(name.charAt(0) != typed.charAt(0)){
            return false;
        }
        if(namelen > typelen){
            return false;
        }
        // case 3 & 4
        while(p1 < namelen && p2 < typelen){
            if(name.charAt(p1) == typed.charAt(p2)){
                p1++;
                p2++;
            }
            else if (typed.charAt(p2) == typed.charAt(p2-1)){
                p2++;
            }
            else{
                return false;
            }
        }
        // case 5
        while(p2 < typelen){
            if(name.charAt(namelen-1) == typed.charAt(p2)){
                p2++;
            }
            else{
                return false;
            }
        }
        // case 6
        if(p1 < namelen-1){
            return false;
        }

        return true;
    }
}
