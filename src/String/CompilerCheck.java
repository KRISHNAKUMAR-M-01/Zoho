package String;

import java.util.Stack;

public class CompilerCheck {
    public static void main(String[] args) {
        String string = "{([])}";
        System.out.println(check(string));
    }
    public static boolean check(String str){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);

            if(c=='{' ||c=='(' ||c=='['){
                stack.push(c);
            } else if (c=='}'||c==')'||c==']') {
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if(c=='}'&&top!='{') return false;
                if(c==')'&&top!='(') return false;
                if(c==']'&&top!='[') return false;

            }
        }
        return stack.isEmpty();
    }
}
