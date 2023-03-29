package stackQueue;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        //CustomQueue queue = new CustomQueue(5);
        DynamicQueue queue = new DynamicQueue(5);
        queue.insert(11);
        queue.insert(22);
        queue.insert(33);
        queue.insert(44);
        queue.insert(55);
        queue.insert(66);
        queue.display();
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.insert(23);
        queue.insert(34);
        queue.insert(45);


        queue.display();
        //System.out.println(queue);
    }
}
