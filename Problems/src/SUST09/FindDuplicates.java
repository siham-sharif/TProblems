/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SUST09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author siham.sharif
 */
public class FindDuplicates {
    
    public static void main(String[] args){
    
        int array[] = {1,2,3,4,4,5,6,7,3,10,11001,7,8,9,11001,2,4};
    
        Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();
        
        for(Integer val : array){
            if(myMap.containsKey(val)){
                int count = myMap.get(val);
                myMap.put(val, count+1);
            }
            else
                myMap.put(val, 1);       
        }
        
        for(Integer key : myMap.keySet()){
        
            if(myMap.get(key) > 1)
                System.out.printf("key %d : %d times\n", key, myMap.get(key));
        }
        
        /*
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();

            //iterating over keys only
            for (Integer key : map.keySet()) {
            System.out.println("Key = " + key);
            }

            //iterating over values only
            for (Integer value : map.values()) {
            System.out.println("Value = " + value); 
            }
        
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
        Map.Entry<Integer, Integer> entry = entries.next();
        System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
}
        */
    
        
    }
    
}
