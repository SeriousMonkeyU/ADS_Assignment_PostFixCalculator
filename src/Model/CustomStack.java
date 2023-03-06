package Model;

import java.util.LinkedList;

public class CustomStack {
    LinkedList<Integer> stack;

    public CustomStack(LinkedList<Integer> stack)
    {
        this.stack = stack;
    }

    public Integer pop() throws Exception {
        if(stack.isEmpty()) throw new Exception("Nothing to pop, stack is empty");
        return stack.pop();
    }

    public Integer peek()
    {
        return stack.peek();
    }

    public void push(Integer pushedValue)
    {
        stack.push(pushedValue);
    }

}
