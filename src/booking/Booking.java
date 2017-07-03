/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

/**
 *
 * @author Amr
 */
public class Booking {

//    There is a robot moving on a square grid, and it understands 4 commands:
//
//'>' go east
//'<' go west
//'^' go north
//'v' go south
//
//
//And a program for the robot looks something like this:
//
//^v<>><^>v<>^<^>^>><v>v>><^^<>><<<><<><v^^v<<><^<^v<v^><^^v<<>><<<<^>v^<v>><v^><v<vvv>v^v^<v><<>>v<><<v>^<>><>>^><>v^v>v<<>v<>v^^><<>>>v<<>>>>^>v>>
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PriorityQueue<Integer> p = new PriorityQueue<Integer>(5);

        int[] a = new int[]{3, 5, 10, 1, 23, 42, 66, 1333, 545, 110};

        for (int i : a) {
            p.add(i);
            if (p.size() > 5) {
                p.poll();
            }
        }

        Arrays.sort(a);
        Map<Integer, Integer> hash = new HashMap<>();
        for (Entry<Integer, Integer> hash1 : hash.entrySet()) {
            System.out.println(hash1.getKey() + hash1.getValue());
        }

        String helloWorld = "Hello World!";
        int hellWrld = helloWorld.indexOf("l");
        System.out.println(hellWrld);
    }

}
