class MinStack {
        
    private class Node{
        Node next;
        int data;
        public Node(int x){
            data = x;
            next = null;
        }
    }
        
    private Node top;
       
    /** initialize your data structure here. */
    public MinStack() {
        top = null;
    }
    
    public void push(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
    }
    
    public void pop() {
        if(top == null)
            return;
        Node temp = top;
        top = top.next;
        temp = null;
    }
    
    public int top() {
        return top.data;
    }
    
    public int getMin() {
        if(top == null)
            return -1;
        Node temp = top;
        int min  = Integer.MAX_VALUE;
        while(temp != null){
            min = Math.min(min, temp.data);
            temp = temp.next;
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */