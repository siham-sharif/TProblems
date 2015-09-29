/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DUExam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ghost
 */
public class SetAMinusB {
    
    public static void main(String[] args){
    
        int[] arrayNum1 = {1,2,3};
        int[] arrayNum2 = {2,3,4};
        
        
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        
        for(Integer val1 : arrayNum1)
            set1.add(val1);
        for(Integer val2 : arrayNum2)
            set2.add(val2);
        
        System.out.printf("Set1 : %s\n", set1);
        System.out.printf("Set2 : %s\n", set2);
        
        Set<Integer> uniqueSet = new HashSet<Integer>();
        
        for(Integer val1 : set1)
            uniqueSet.add(val1);
        for(Integer val2 : set2)
            uniqueSet.add(val2);
        
        System.out.printf("Unique set : %s\n", uniqueSet);
        
        /*
        Iterator<Integer> iter = set1.iterator();
        while(iter.hasNext()){
            if(set2.contains(iter.next()))
                iter.remove();
        
        }
        
        System.out.printf("A-B : %s\n", set1);
        */
        
        set1.removeAll(set2);
        
        System.out.printf("\nAfter using removeAll ");
        
        System.out.printf("Set1 : %s\n", set1);
        
    }
    
}
