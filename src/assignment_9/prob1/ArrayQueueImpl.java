package assignment_9.prob1;

import java.util.Arrays;

public class ArrayQueueImpl {
    private static int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;


    public int peek() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return 0;
        }
        return arr[front];
    }
    public void enqueue(int obj) {
        if(rear== arr.length){
            resize();
        }
        arr[rear++]=obj;
        if(front==-1){
            front=0;
        }

    }
    public int dequeue() {

        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int item=arr[front];
        arr[front++]=0;

        if(front==rear)
        {
            front=-1;
            rear=0;
        }



        return item;
    }
    public boolean isEmpty(){
    return front==-1;
    }
    public int size(){
        return rear-front;
    }
    private void resize(){
        System.out.println("resizing...");
        int length= arr.length;
        int newLength=2*length;
        int []temp=new int[newLength];
        System.arraycopy(arr,0,temp,0,length);
        arr=temp;
    }

    public static void main(String[] args) {
        ArrayQueueImpl aqi=new ArrayQueueImpl();
        aqi.enqueue(5);
        aqi.enqueue(6);
        aqi.enqueue(7);
        //aqi.enqueue(8);
        //aqi.enqueue(9);
        //aqi.enqueue(1);
       // aqi.enqueue(2);
       // aqi.enqueue(3);
       // aqi.enqueue(4);
       // aqi.enqueue(10);
        System.out.println(Arrays.toString(arr));
        System.out.println("Size of the Queue is: "+aqi.size());
        aqi.enqueue(11);
        System.out.println(Arrays.toString(arr));
        System.out.println("Size of the Queue is: "+aqi.size());
        aqi.dequeue();
        System.out.println(Arrays.toString(arr));
        System.out.println("Size of the Queue is: "+aqi.size());

        aqi.enqueue(12);
        System.out.println(Arrays.toString(arr));
        System.out.println("Size of the Queue is: "+aqi.size());

        System.out.println("Peek Value is: "+aqi.peek());
        aqi.dequeue();
        aqi.dequeue();
        aqi.dequeue();
        aqi.dequeue();
        System.out.println(Arrays.toString(arr));
        System.out.println("Size of the Queue is: "+aqi.size());
        aqi.dequeue();
        aqi.peek();
    }
}
