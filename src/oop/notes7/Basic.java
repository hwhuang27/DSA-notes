package oop.notes7;

public class Basic {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        Week(){
            System.out.println("Constructor called for " + this);
        }
        @Override
        public void hello() {
            System.out.println("hello");
        }
    }



    public static void main(String[] args) {
        Week week;
        week = Week.Friday;
        week.hello();

        System.out.println(Week.valueOf("Monday"));
//        for (Week day : Week.values()) {
//            System.out.println(day);
//        }

        // .ordinal() prints the position in its enum declaration
        //System.out.println(week.ordinal());



    }


}
