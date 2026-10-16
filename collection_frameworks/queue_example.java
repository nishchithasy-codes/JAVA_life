/*import java.util.*;
public class queue_example {
    public static void main(String args[]){

        //DOUBLY ENDED LINKED LIST QUEUE
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        //Because offer will return false if queue is not successful
        //To insert in queue use offer(), to remove use poll(), to access front element use peek()
        System.out.println("Queue: " + q);
        System.out.println("Removing: "+q.poll());
        System.out.println("Queue first element: " + q.peek());
        Deque<Integer> dq = new LinkedList<>();     //Doubly ended queue
        dq.add(20);
        dq.addFirst(100);
        dq.add(30);
        dq.add(40);
        dq.addLast(50);
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());






        //ARRAY DOUBLY ENDED QUEUE
        Deque<Integer> qArr = new ArrayDeque<>();
        qArr.offer(2000);
        qArr.offer(3000);
        System.out.println("ArrayDeque: " + qArr);
        qArr.pollLast();
        System.out.println(qArr);
        qArr.pollFirst();
        System.out.println(qArr);
        System.out.println("Size: "+qArr.size());
        System.out.println("Peek(First element): "+qArr.peek());
        System.out.println("Peek last: "+qArr.peekLast());


    }
}
*/