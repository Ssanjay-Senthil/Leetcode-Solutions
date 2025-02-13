// class Solution {
//     public int evalRPN(String[] tokens) {
//         Stack<Integer> stack = new Stack<>();
//         for(String i : tokens)
//         {
//             if(isNumeric(i))
//             stack.push(Integer.parseInt(i));
//             else{
//                 int se = stack.pop();
//                 int fi = stack.pop();
//                 int re = 0;
//                 switch(i){
//                     case "+":re = fi+se;break;
//                     case "-":re = fi-se;break;
//                     case "*":re = fi*se;break;
//                     case "/":re = fi/se;break;
//                 }
//                 stack.push(re);
//             }
//         }
//         return stack.pop();
//     }
//     public static boolean isNumeric(String s){
//         try{
//             Integer.parseInt(s);
//             return true;
//         }
//         catch(NumberFormatException e){
//             return false;
//         }
//     }
// }

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String c : tokens) {
            if (c.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (c.equals("-")) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first - second);
            } else if (c.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (c.equals("/")) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first / second);
            } else {
                stack.push(Integer.parseInt(c));
            }
        }

        return stack.peek();        
    }
}