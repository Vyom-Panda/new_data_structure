import Dstack.Dstack;
import Dstack.DstackImpl;

public class Main {

    public static void main(String[] args) {

        Dstackcall();

    }

    public static void Dstackcall(){
        Dstack dst=new DstackImpl();

        System.out.print("Initial stack: ");
        dst.show();
        dst.push(10);
        dst.push(20);
        dst.push(30);
        dst.push(40);
        dst.push(40);
        dst.push(40);
        dst.push(40);
        dst.show();
        dst.mid();
        System.out.println("PEEK: "+dst.peek());
        dst.pop();
        dst.pop();
        dst.pop();
        dst.pop();
        dst.pop();
        System.out.print("Final stack: ");
        dst.show();
    }
}
