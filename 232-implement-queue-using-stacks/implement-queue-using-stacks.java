class MyQueue {
    Stack <Integer> stk1 = new Stack<>();
    Stack <Integer> stk2 = new Stack<>();

    public MyQueue() {
        
    }
    //This code is push efficient--
    public void push(int x) {
        stk1.push(x);
    }
    
    public int pop() {
        while(stk1.size()>1){
            stk2.push(stk1.pop());
        }
        int val = stk1.pop();
        while(stk2.size()>0){
            stk1.push(stk2.pop());
        }
        return val;
    }
    
    public int peek() {
        while(stk1.size()>1){
            stk2.push(stk1.pop());
        }
        int val = stk1.peek();
        while(stk2.size()>0){
            stk1.push(stk2.pop());
        }
        return val;
    }
    
    public boolean empty() {
        if(stk1.size()==0) return true;
        else return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */