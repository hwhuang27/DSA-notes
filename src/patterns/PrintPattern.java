package patterns;

public class PrintPattern {
    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
    }

    public static void pattern1(int n){
        int c;
        int offset = -1;
        for (int rows = 0; rows < n*2; rows++) {
            if(rows < 5){
                c = rows+1;
            }
            else{
                c = rows+offset;
                offset -= 2;
            }
            for (int cols = 0; cols < c; cols++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }

}
