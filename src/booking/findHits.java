/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Amr
 */
//Given a stream of characters (e.g. acacabcatghhellomvnsdb) and a list of words (e.g. ["aca","cat","hello","world"] ) 
//find and display count of each and every word once the stream ends.(Like : "aca" : 2 , "cat" : 1 , "hello" : 1 , "world" : 0 ).
public class findHits {

    public static Map<String, Integer> findHits(String string, String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, 0);

            int index = string.indexOf(word);
            System.out.println(word);
            while (index != -1) {
                System.out.println(index);
                map.put(word, map.get(word) + 1);
                string = string.substring(0, index) + string.substring(index + 1);
                index = string.indexOf(word);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String[] words = {"cat", "aca", "hello", "world"};
        System.out.println(findHits("acacabcatghhellomvnsdb", words));
    }

}
