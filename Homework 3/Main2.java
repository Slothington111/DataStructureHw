// Name: Aqdas Khan
// Programming Language: Java
// IDE/ Editor: Visual Studio Code

// ----------------------
// Stack
// ----------------------

class MyStack
{
    private int[] stack = new int[200];
    private int size = 0;

    // adds a new item to the top of the stack
    public void push (int value)
    {
        stack[size] = value;
        size++;
    }

    // removes and returns the most recently added item
    public int pop()
    {
        size--;
        return stack[size];
    }

    // returns the top item without removing it
    public int peek()
    {
        return stack[size - 1];
    }

    // returns true if the stack is empty
    public boolean isEmpty()
    {
        return size == 0;
    }
}

// --------------------
// Queue
// --------------------

class MyQueue
{
    private int[] queue = new int[200];
    private int size = 0;

    // Adds an item to the back of the queue
    public void enqueue(int value)
    {
        queue[size] = value;
        size++;
    }

    // removes and returns the item at the front of the queue
    public int dequeue()
    {
        int frontItem = queue[0];
        // Moves the remaining items forward
        for (int i = 0; i < size - 1; i++)
        {
            queue[i] = queue[i + 1];
        }
        size--;
        return frontItem;
    }

    // Returns the front item without removing it
    public int peek()
    {
        return queue[0];
    }

    // Returns true if the queue is empty
    public boolean isEmpty()
    {
        return size == 0;
    }
}

// -----------------
// Main Program
// -----------------
public class Main2
{
    public static void main(String[] args)
    {

        // ------------------
        // Stack Demonstration
        // ------------------
        MyStack stack = new MyStack();

        System.out.println("STACK DEMONSTRATION");
        System.out.println("Adding:");

        stack.push(15);
        System.out.println(15);

        stack.push(25);
        System.out.println(25);

        stack.push(35);
        System.out.println(35);

        stack.push(45);
        System.out.println(45);

        stack.push(55);
        System.out.println(55);
        
        System.out.println("Top item:");
        System.out.println(stack.peek());
        
        System.out.println("Removing:");
        System.out.println(stack.pop());
        
        System.out.println("Removing:");
        System.out.println(stack.pop());
        
        System.out.println("New top:");
        System.out.println(stack.peek());
        
        System.out.println("Is Stack empty:");
        System.out.println(stack.isEmpty());

        // ---------------
        // Queue Demonstration
        // ---------------
        MyQueue queue = new MyQueue();

        System.out.println("QUEUE DEMONSTRATION");
        System.out.println("Adding:");

        queue.enqueue(15);
        System.out.println(15);

        queue.enqueue(25);
        System.out.println(25);

        queue.enqueue(35);
        System.out.println(35);

        queue.enqueue(45);
        System.out.println(45);

        queue.enqueue(55);
        System.out.println(55);

        System.out.println("Front item:");
        System.out.println(queue.peek());

        System.out.println("Removing:");
        System.out.println(queue.dequeue());

        System.out.println("Removing:");
        System.out.println(queue.dequeue());

        System.out.println("New front:");
        System.out.println(queue.peek());

        System.out.println("Is Queue empty?");
        System.out.println(queue.isEmpty());


    }
}
