

class MinStack {

    private ArrayList<Integer> stack;
    private ArrayList<Integer> minStack;

    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }

    public void push(int val) {
        stack.add(val);

        if (minStack.isEmpty() || val <= minStack.get(minStack.size()-1)) {
            minStack.add(val);
        }
    }

    public void pop() {
        if (stack.get(stack.size()-1).equals(minStack.get(minStack.size()-1))) {
            minStack.remove(minStack.size()-1);
        }
        stack.remove(stack.size()-1);
    }

    public int top() {
        return stack.get(stack.size()-1);
    }

    public int getMin() {
        return minStack.get(minStack.size()-1);
    }
}