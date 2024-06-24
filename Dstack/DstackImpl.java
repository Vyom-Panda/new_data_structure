package Dstack;

public class DstackImpl implements Dstack{

    int max=2;
    int top=0;
    int[] stack=new int[max];


    @Override
    public void push(int i) {
        if(top==max){
            expand();
        }
        stack[top]=i;
        top++;
    }

    private void expand() {
        int tempMax=max*2;
        int[] temp=new int[tempMax];
        for (int i = 0; i < max; i++) {
            temp[i]=stack[i];
        }
        stack=temp;
        max=tempMax;
    }

    public Boolean isEmpty(){
        return top<=0;
    }

    @Override
    public void pop() {
        if(isEmpty()){
            System.out.println("Stack is empty could not pop further ");
            return;
        }
        int tr=stack[top-1];
        stack[top-1]=0;
        top--;

        if(top<max/2){
            shrink();
        }
        System.out.println("POPPING: "+tr);
    }

    private void shrink() {
        int tempMax=max/2+2;
        int[] temp=new int[tempMax];
        for (int i = 0; i < top; i++) {
            temp[i]=stack[i];
        }
        stack=temp;
        max=tempMax;
    }

    @Override
    public int peek() {
        return stack[top-1];
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public void mid() {
        int middle;
        if(top%2==0){
        middle=top/2;
        }else {
            middle = top / 2 - 1;
        }
        System.out.println("MID: "+stack[middle]);
    }

    @Override
    public void show() {
        for (int i:stack) {
            if(i==0) System.out.print("- ");
            else {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }
}
