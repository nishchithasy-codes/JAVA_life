import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);    //And this will convert it to maxHeapGiving a comparator here.
        //default behaviour -> Integers -> less value -> high priority -> minHeap
        //maxHeap -> Integers -> high value -> high priority
        //pq -> strings -> comparator -> 
        pq.offer(40);
        pq.offer(5);
        pq.offer(20);
        pq.offer(50);
        System.out.println("Priority Queue: " + pq);
        System.out.println("The maximum number has the highest priority: in maxHeap" + pq.poll());
        System.out.println("Remaining elements: " + pq);




    }   
}
