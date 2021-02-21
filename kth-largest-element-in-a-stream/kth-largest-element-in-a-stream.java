class KthLargest {

    Queue<Integer> queue;
    int k;
    public KthLargest(int k, int[] nums) {
        
        queue = new PriorityQueue<>();
        this.k = k;
        for(int i : nums) {
            add(i);
        }
    }
    
    public int add(int val) {
        queue.offer(val);
        if(queue.size()>k) {
            queue.poll();
        }
        
        return queue.peek();
    }
    
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */




 // "static void main" must be defined in a public class.
// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello World!");
//         KthLargest  kthLargest = new KthLargest();
//         int[] arr = new int[] { 10, 7, 11, 5, 27, 8, 9, 45 };
//         for(int num:arr) {
//             int largest = kthLargest.add(num,3);
//             System.out.println(largest);
//         }
//     }
// }



// class KthLargest {
    
//     Queue<Integer> minHeap = new PriorityQueue<>();
    
    
//     public int add(int num, int k) {
        
//         if(minHeap.size()<k) {
//             minHeap.add(num);
//             return minHeap.size() == k ? minHeap.peek():-1;
//         }
        
//         if(num>minHeap.peek()) {
//             minHeap.poll();
//             minHeap.add(num);
//         }
        
//         return minHeap.peek();
        
//     }
    
// }








// // "static void main" must be defined in a public class.
// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello World!");
//         KthLargest  kthLargest = new KthLargest();
//        int[] arr = new int[] { 10, 7, 11, 5, 27, 3, 2, 1 };
//         for(int num:arr) {
//             int largest = kthLargest.add(num,3);
//             System.out.println(largest);
//         }
//     }
// }



// class KthSmallest {
    
//     Queue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
    
    
//     public int add(int num, int k) {
        
//         if(minHeap.size()<k) {
//             minHeap.add(num);
//             return minHeap.size() == k ? minHeap.peek():-1;
//         }
        
//         if(num<minHeap.peek()) {
//             minHeap.poll();
//             minHeap.add(num);
//         }
        
//         return minHeap.peek();
        
//     }
    
// }