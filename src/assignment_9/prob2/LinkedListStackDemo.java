package assignment_9.prob2;

interface Stack {
    public void push(Object ob);

    public Object pop();

    public Object peek();

    public boolean isEmpty();

    public int size();
}

class LinkedList implements Stack{
    class Node{
        Object data;
        Node next;
        Node(Object item){
            data=item;
        }
    }
    Node top;
    int size;
    public LinkedList()
    {
        top=null;
        size=0;
    }

    public void push(Object item)
    {
      Node newNode=new Node(item);
      newNode.next=top;
      top=newNode;
      size++;
    }

    public Object pop()
    {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
       Object item=top.data;
        top=top.next;
        size--;
        return item;
    }

    public Object peek()
    {
        if (isEmpty())
            return null;
        return top.data;
    }

    public boolean isEmpty()
    {
        return (top == null);
    }

    public int size()
    {
        return size;
    }
}
public class LinkedListStackDemo {
    public static void main(String[] args) {
        LinkedList stk = new LinkedList();
        Object item;
        stk.push('A');
        stk.push('B');
        stk.push('C');
        stk.push('D');

        System.out.println("size(): " + stk.size());
        item = stk.pop();
        System.out.println(item + " is deleted");
        stk.push('D');
        stk.push('E');
        System.out.println(stk.pop() + " is deleted");
        stk.push('G');
        item = stk.peek();
        System.out.println(item + " is on top of stack");
        System.out.println("Size of the Stack : " + stk.size());

        stk.pop();
        stk.pop();
        stk.pop();
        stk.pop();
        stk.pop();
        System.out.println("Size of the Stack : " + stk.size());
        stk.pop();
        stk.peek();


    }

}
