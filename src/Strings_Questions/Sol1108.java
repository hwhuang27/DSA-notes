package Strings_Questions;

public class Sol1108 {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String ans = defangIPaddr(address);
        System.out.println(ans);
    }
    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
