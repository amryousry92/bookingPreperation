/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import static javafx.scene.input.KeyCode.X;
import static javafx.scene.input.KeyCode.Y;

/**
 *
 * @author Amr
 */
public class parenthesis {

    public static boolean isParenthesis(String line) {
        Stack stack = new Stack();
        char[] charLine = line.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');

        List<String> output = new ArrayList<>();
        System.out.println("\n");
        System.out.println("haii");
        System.out.println("\n");
        System.out.println("\n");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (char character : charLine) {
            if (map.containsKey(character)) {
                stack.push(map.get(character));
            } else if ((character == '}' && !stack.pop().equals('{')) || (character == ']' && !stack.pop().equals('['))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isParenthesis("{{[[]]]]]]}}"));
    }

}
