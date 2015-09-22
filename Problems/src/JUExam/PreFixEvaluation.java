/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUExam;
import java.util.Stack;

/**
 *
 * @author ghost
 */
public class PreFixEvaluation {
    public static void main(String[] args){
        String exp = "+*54*32";
        int answer = EvalPreFix(exp);
        System.out.printf("Evaluation : %d \n", answer);
    
    }
    public static int EvalPreFix(String exp){
    
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = exp.length()-1;i>=0;i--){
            if(exp.charAt(i) >='0' && exp.charAt(i) <='9'){
                stack.push(Integer.parseInt(Character.toString(exp.charAt(i))));
            }
            else if(isOperator(exp.charAt(i))){
                int val1 = stack.pop();
                int val2 = stack.pop();
                
                stack.push(ApplyOperation(exp.charAt(i), val1,val2));
            }
        }
       
        return stack.pop();
    }
    public static boolean isOperator(char op){
        if(op == '+' || op == '-' || op == '*' || op == '/')
            return true;
        else
            return false;
    }
    public static int ApplyOperation(char op, int val1, int val2){
        
        if(op == '+')
            return val1 + val2;
        else if (op == '-')
            return val1 - val2;
        else if(op == '*')
            return val1 * val2;
        else if(op == '/')
            return val1 / val2;
    
        return 0; // easy to forget line
    }
}
