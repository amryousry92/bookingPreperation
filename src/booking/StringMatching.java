/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

/**
 *
 * @author Amr
 */
public class StringMatching {

    public static boolean isMatch(String s1, String s2) {
        if (!s1.equals(s2)) {
            char[] charArray1 = s1.toCharArray();
            char[] charArray2 = s2.toCharArray();
            int j = 0;
            for (int i = 0; i < Math.min(charArray1.length, charArray2.length); i++) {
                if (charArray1[i] == charArray2[j]) {
                    j++;
                } else if (charArray2[j] == '?' || charArray1[i] == '?') {
                    j++;
                } else if (charArray1[i] == '*') {
                    if (charArray1[i + 1] != charArray2[j + 1]) {
                        j++;
                        i--;
                    }
                } else if (charArray2[j] == '*') {
                    if (charArray1[i + 1] == charArray2[j + 1]) {
                        j++;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isMatch("abfefgsdfbc", "a*c"));
    }

}
