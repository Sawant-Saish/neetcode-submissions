class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a,b,c;
        for(int i=0;i<tokens.length;i++){
            String ch = tokens[i];

            switch(ch){
                case "+":
                     a = stack.pop();
                     b = stack.pop();
                     c = b+a;
                    stack.push(c);
                    break;

                case "-":
                     a = stack.pop();
                     b = stack.pop();
                     c = b-a;
                    stack.push(c);
                    break;

                case "*":
                     a = stack.pop();
                     b = stack.pop();
                     c = b*a;
                    stack.push(c);
                    break;

                case "/":
                     a = stack.pop();
                     b = stack.pop();
                    if(a!=0){
                         c = b/a;
                        stack.push(c);
                    }
                    break;

                default:
                    stack.push(Integer.parseInt(ch));
            }
        }

        return stack.peek();
    }
}
