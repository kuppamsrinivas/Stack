import java.util.Scanner;

class Stack{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    static Node top = null;
    
    void push(int data){

    }

    void pop(){

    }

    void display(){

    }

    int search(int i){

    }

    int peek(){

    }

    boolean empty(){

    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Stack S = new Stack();
        int a = 1;
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);
            while(a != 0)
            {
                System.out.println("Enter Option:");
                a = s.nextInt();
                switch(a)
                {
                    case 1 -> S.push(s.nextInt());
                    case 2 -> S.pop();
                    case 3 -> System.out.println(S.peek());
                    case 4 -> System.out.println(S.search(s.nextInt()));
                    case 5 -> S.display();
                    case 6 -> System.out.println(S.empty());
                }
            }
    }
}