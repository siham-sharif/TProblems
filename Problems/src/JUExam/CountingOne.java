/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUExam;

import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author ghost
 */
public class CountingOne {
    
    public static void main(String[] args){
        
        int[] array = {1,2,0,1,2,1,5,6,-2,-1,1};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int arrVal : array){
                if(map.containsKey(arrVal)){
                    int count = map.get(arrVal);
                    map.put(1, ++count);     
                }
                else
                    map.put(arrVal, 1);
                
                    
            
        }
        System.out.printf("total no 1 is : %d\n", map.get(1));
    }
    
}
