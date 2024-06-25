package Dstack;

public class DstackCall {

    public static void dummytest() {
        Dstack dst = new DstackImpl();

        System.out.print("Initial stack: ");
        dst.show();
        dst.push(10);
        dst.push(20);
        dst.push(30);
        dst.push(40);
        dst.push(45);
        dst.push(41);
        dst.push(42);
        dst.push(43);
        dst.show();
        System.out.println("MID: " + dst.mid());
        System.out.println("PEEK: " + dst.peek());
        dst.pop();
        dst.pop();
        dst.pop();
        dst.pop();
        dst.pop();
        System.out.print("Final stack: ");
        dst.show();
    }
}
