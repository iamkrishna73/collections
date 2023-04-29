package StackBasic;

public class StackImplementationUsingArray {
    int size;
    int[] array;
    int top;
    StackImplementationUsingArray(int size) {
        this.size = size;
        this.array = new int[size];
        this.top = -1;
    }
    public int peek() {
        if (!isEmpty()) {
            return array[top];
        } else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }
    public void push(int element) {
        if (!isFull()) {
            top++;
            array[top] = element;
            System.out.println("Pushed element is: " + element);
        } else {
            System.out.println("Stack is full now");
        }
    }
    public void pop() {
        if (!isEmpty()) {
            int returnTop = top;
            top--;
            System.out.println("Popped element is: " + array[returnTop]);
        } else {
            System.out.println("Stack is Empty");
        }
    }
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (size - 1 == top);
    }

    public static void main(String[] args) {
        StackImplementationUsingArray stackImp = new StackImplementationUsingArray(10);
        stackImp.pop();
        System.out.println("------------");
        stackImp.push(100);
        stackImp.push(200);
        stackImp.push(300);
        stackImp.push(400);

        System.out.println("------------");
        stackImp.pop();
        stackImp.pop();
        System.out.println(stackImp.isEmpty());
        System.out.println(stackImp.isEmpty());
    }
}
