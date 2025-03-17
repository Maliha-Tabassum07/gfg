package DSA.implement_stack_using_array;

class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        this.top++;
        arr[top]=x;
    }

    public int pop() {
        if(top!=-1){
            int x=arr[top];
            top--;
            return x;
        }
        return -1;
    }

}