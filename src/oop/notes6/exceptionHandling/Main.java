package oop.notes6.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            // int c = a / b;
            //int c = divide(a, b);
            //throw new Exception("just for fun");
            String name = "David";
            if (name.equals("David")){
                throw new MyException("Name is David");
            }
        }catch (MyException e){
            System.out.println(e.getMessage() + " ");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("normal exception caught");
        }finally {
            System.out.println("This will always execute.");
        }

    }
    public static int divide(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Do not divide by zero.");
        }

        return a / b;
    }
}
