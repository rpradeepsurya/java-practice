package com.assignment6;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QExample {

	public static void main(String[] args) {
		// 3. Using Queue interface
		
        Queue<String> linkedListQueue = new LinkedList<>();

        linkedListQueue.add("Red");
        linkedListQueue.offer("Green");
        ((LinkedList<String>)linkedListQueue).add(1, "Cyan"); 
        System.out.println("LinkedList Queue: " + linkedListQueue);
        
        linkedListQueue.remove();

        System.out.println("Polled from LinkedList Queue: " + linkedListQueue.poll());
        System.out.println("Peek into LinkedList Queue: " + linkedListQueue.peek());
        System.out.println("Number of elements in LinkedList Queue: " + linkedListQueue.size());
    
        
        // 4. PriorityQueue to String
        
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer("Orange");
        priorityQueue.offer("Banana");
        priorityQueue.offer("Apple");

        String str1 = priorityQueue.toString();
        System.out.println("String representation of PriorityQueue: " + str1);
        
        
        // 5. Maximum PriorityQueue
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(89);
        minHeap.add(82);
        minHeap.add(70);
        minHeap.add(25);
        minHeap.add(16);
        minHeap.add(22);
        minHeap.add(36);
        minHeap.add(10);
        minHeap.add(14);

        System.out.print("Original Priority Queue: ");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();

        minHeap.add(89);
        minHeap.add(82);
        minHeap.add(70);
        minHeap.add(25);
        minHeap.add(16);
        minHeap.add(22);
        minHeap.add(36);
        minHeap.add(10);
        minHeap.add(14);

        // maximum priority queue
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(minHeap);

        System.out.print("Maximum Priority Queue: ");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
        System.out.println();
        
        
	}

}
