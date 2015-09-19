/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notations;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ghost
 */
public class PostFixEvaluation {
    
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Postfix Expression : ");
        String exp = scanner.nextLine();
        double answer = evaluateExpression(exp);
        System.out.printf("\nevaluation is %.2f", answer);
    
    }
    
    public static double  evaluateExpression(String exp){
        double val1, val2;
        Stack<Double> stack = new Stack<Double>();
        //for(int i = 0; i<=exp.length()-1 ; i++ ){
        for(int i = exp.length()-1; i>=0 ; i-- ){
        
            if(exp.charAt(i) >= '0' && exp.charAt(i)<='9')
                stack.push(Double.parseDouble(Character.toString(exp.charAt(i))));
            else if(isOperator(exp.charAt(i))){
                val1 = stack.pop();
                val2 = stack.pop();
                double result  = performOperation(exp.charAt(i) ,val1, val2);
                stack.push(result);
            }
            
            
        }
        return stack.pop();
    }
    public static boolean isOperator(char op){
        if(op == '+' || op == '-' || op == '*' || op == '/' )
            return true;
        else
            return false;
    }
    
    public static double performOperation(char operator, double val1, double val2){
    
        if(operator == '+')
            return val1 + val2;
        else if(operator == '-')
                return val1 - val2;
        else if(operator == '*')
            return val1 * val2;
        else if(operator == '/')
            return val1 / val2;
        
        return 0;
    }
    
}
